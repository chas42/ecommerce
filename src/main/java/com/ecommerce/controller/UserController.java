package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.ecommerce.dto.UserDTO;
import com.ecommerce.dto.UserReadDTO;
import com.ecommerce.dto.UserUpdateDTO;
import com.ecommerce.service.UserService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody UserDTO userDTO) {

        userService.create(userDTO);

        return ResponseEntity.ok().build();

    }

    @GetMapping("/{id}")
    public ResponseEntity<UserReadDTO> read(@PathVariable Long id) {

        UserReadDTO userDTO = userService.read(id);

        return ResponseEntity.ok(userDTO);

    }

    @PutMapping
    public ResponseEntity<Void> update(@RequestBody UserUpdateDTO userUpdateDTO) {

        userService.update(userUpdateDTO);

        return ResponseEntity.ok().build();

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {

        userService.delete(id);

        return ResponseEntity.ok().build();

    }

}
