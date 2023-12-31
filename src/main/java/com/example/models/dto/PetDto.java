package com.example.models.dto;

import com.example.models.entity.CategoryEntity;
import com.example.models.entity.TagEntity;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Builder

public class PetDto {
    private UUID id;
    private CategoryEntity category;
    private String name;
    private List<String> photoUrls;
    private TagEntity tags;
    private String status;

}
