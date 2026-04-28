package com.oscar.todo_rest.dto;

import com.oscar.todo_rest.model.Task;
import com.oscar.todo_rest.users.NewUserResponse;

import java.time.LocalDateTime;
import java.util.List;

public record GetTaskDto(
        Long id,
        String title,
        String description,
        LocalDateTime createdAt,
        LocalDateTime deadline,
        NewUserResponse author,

        String category,  
        String status,    
        List<String> tags 
){
    public static GetTaskDto of(Task t) {
        return new GetTaskDto(
                t.getId(),
                t.getTitle(),
                t.getDescription(),
                t.getCreatedAt(),
                t.getDeadline(),
                NewUserResponse.of(t.getAuthor()),
                
                t.getCategory() != null ? t.getCategory().getName() : "VACIO",
                t.getStatus() != null ? t.getStatus().getType() : "VACIO",
                t.getTags() != null ? t.getTags().stream().map(tag -> tag.getTitle()).toList(): List.of()
        );
    }
}