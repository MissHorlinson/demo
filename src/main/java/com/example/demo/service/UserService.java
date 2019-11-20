package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.exception.UserUpdateException;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(UserDTO userDTO) {
        User user = new User(userDTO.getName(), userDTO.getSurname(), userDTO.getLevel());
        return userRepository.save(user);
    }

    public User getUserById(Long id) {
        return userRepository.getOne(id);
    }

    public User update(UserDTO userDTO) throws Exception {
        if (userRepository.findById(userDTO.getId()).isPresent()) {
            User user = userRepository.getOne(userDTO.getId());
            user.setName(userDTO.getName());
            user.setSurname(userDTO.getSurname());
            user.setLevel(userDTO.getLevel());
            return userRepository.save(user);
        }
        throw new UserUpdateException(
                "Can not update user - " + userDTO.toString());
    }

    public void delete(UserDTO userDTO) {
        if(userRepository.findById(userDTO.getId()).isPresent()) {
            User user = userRepository.getOne(userDTO.getId());
            userRepository.delete(user);
        }
    }
}
