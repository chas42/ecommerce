package com.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dto.tag.TagDTO;
import com.ecommerce.model.Tag;
import com.ecommerce.repository.TagRepository;

@Service
public class TagService {

    @Autowired
    private TagRepository tagRepository;

    public void create(TagDTO tagDTO) {

        Tag tag = new Tag(tagDTO);

        tagRepository.save(tag);

    }

    public TagDTO read(Long id) {

        Tag tag = tagRepository.findById(id).get();

        return new TagDTO(tag);

    }

    public void update(TagDTO tagDTO) {

        Tag tag = tagRepository.findById(tagDTO.id()).get();

        tag.setName(tagDTO.name());

        tagRepository.save(tag);

    }

    public void delete(Long id) {

        tagRepository.deleteById(id);

    }
    
}
