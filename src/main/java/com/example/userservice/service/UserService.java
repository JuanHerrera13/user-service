package com.example.userservice.service;

import com.example.userservice.domain.User;
import com.example.userservice.dto.UserBookListDto;
import com.example.userservice.dto.UserCreationDto;
import com.example.userservice.dto.UserDto;
import com.example.userservice.dto.UserUpdateDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User findUserById(String id);

    UserDto findUserByFirstAndLastName(String firstName, String lastName);

    List<UserDto> findAllUsers();

    UserDto addUser(UserCreationDto userCreationDto);

    UserDto updateUser(String userId, UserUpdateDto userUpdateDto);

    void deleteUser(String userId);

    UserDto addBook(String userId, UserBookListDto userBookListDto);

    UserDto removeBook(String userId, UserBookListDto userBookListDto);
}
