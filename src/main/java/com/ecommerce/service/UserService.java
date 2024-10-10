package com.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dto.UserDTO;
import com.ecommerce.dto.UserReadDTO;
import com.ecommerce.dto.UserUpdateDTO;
import com.ecommerce.model.User;
import com.ecommerce.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void create(UserDTO userDTO) {

        User user = new User(userDTO);

        userRepository.save(user);

    }

    public UserReadDTO read(Long id) {

        User user = userRepository.findById(id).get();

        return new UserReadDTO(user);

    }

    public void update(UserUpdateDTO userUpdateDTO) {

        User user = userRepository.findById(userUpdateDTO.id()).get();

        user.setName(userUpdateDTO.name());
        user.setEmail(userUpdateDTO.email());

        userRepository.save(user);

    }

    public void delete(Long id) {

        userRepository.deleteById(id);

    }
    
}
