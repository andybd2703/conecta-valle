package com.conectavalle.backend.category.controller;

import com.conectavalle.backend.category.dto.CategoryResponse;
import com.conectavalle.backend.category.service.CategoryService;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<CategoryResponse>> findAll() {

        return ResponseEntity.ok(
                categoryService.findAllActive()
        );
    }
}