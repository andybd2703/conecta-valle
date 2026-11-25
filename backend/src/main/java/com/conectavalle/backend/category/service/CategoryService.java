package com.conectavalle.backend.category.service;

import com.conectavalle.backend.category.dto.CategoryResponse;
import com.conectavalle.backend.category.mapper.CategoryMapper;
import com.conectavalle.backend.category.repository.CategoryRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    public List<CategoryResponse> findAllActive() {

        return categoryRepository
                .findByActiveTrueOrderByNameAsc()
                .stream()
                .map(categoryMapper::toResponse)
                .toList();
    }
}