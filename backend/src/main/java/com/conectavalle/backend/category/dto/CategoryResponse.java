package com.conectavalle.backend.category.dto;

public record CategoryResponse(
        Long id,
        String name,
        String slug,
        String description
) {
}