package com.example.userservice.dto.mapping;

import com.example.userservice.domain.User;
import com.example.userservice.dto.UserCreationDto;
import com.example.userservice.dto.UserDto;
import com.example.userservice.dto.UserUpdateDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

/**
 * Mapper interface for converting between domain objects and DTOs using MapStruct.
 */
@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface UserMapper {

    User userCreationDtoToUser(UserCreationDto userCreationDto);

    UserDto userToUserDto(User user);

    List<UserDto> userListToUserListDto(List<User> users);

    void userUpdateDtoToUser(UserUpdateDto userUpdateDto, @MappingTarget User user);
}
