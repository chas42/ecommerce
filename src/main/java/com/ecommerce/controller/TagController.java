package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.dto.tag.TagDTO;
import com.ecommerce.service.TagService;

@RestController
@RequestMapping("/tag")
public class TagController {

    @Autowired
    private TagService tagService;
    
    @PostMapping
    public ResponseEntity<Void> create(@RequestBody TagDTO tagDTO) {

        tagService.create(tagDTO);

        return ResponseEntity.ok().build();

    }

    @GetMapping("/{id}")
    public ResponseEntity<TagDTO> read(@PathVariable Long id) {

        TagDTO tagDTO = tagService.read(id);

        return ResponseEntity.ok(tagDTO);

    }

    @PutMapping
    public ResponseEntity<Void> update(@RequestBody TagDTO tagDTO) {

        tagService.update(tagDTO);

        return ResponseEntity.ok().build();

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {

        tagService.delete(id);

        return ResponseEntity.ok().build();

    }

}