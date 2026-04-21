package com.oscar.todo_rest.model;

import java.time.LocalDateTime;

import com.oscar.todo_rest.users.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Task {
    
    @Id @GeneratedValue
    private Long id;

    @Builder.Default
    private LocalDateTime createdAt = LocalDateTime.now();

    private String title;   

    @Lob
    private String description;

    private LocalDateTime deadline;

    @ManyToOne
    private User author;

}