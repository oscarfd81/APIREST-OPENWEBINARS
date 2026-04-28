package com.oscar.todo_rest.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;
import java.util.List;

public record EditTaskCommand(
    String title,
    String description,
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    LocalDateTime deadline,

    Long categoryId,
    Long statusId,
    List<Long> tagIds
){}