package com.example.userservice.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Data Transfer Object (DTO) for manage user books.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserBookListDto {

    @NotNull
    private List<String> booksIds;
}
