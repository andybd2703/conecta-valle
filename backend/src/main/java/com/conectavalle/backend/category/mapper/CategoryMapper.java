package com.conectavalle.backend.category.mapper;

import com.conectavalle.backend.category.dto.CategoryResponse;
import com.conectavalle.backend.category.entity.Category;

import org.springframework.stereotype.Component;

@Component
public class CategoryMapper {

    public CategoryResponse toResponse(Category category) {

        return new CategoryResponse(
                category.getId(),
                category.getName(),
                category.getSlug(),
                category.getDescription()
        );
    }
}