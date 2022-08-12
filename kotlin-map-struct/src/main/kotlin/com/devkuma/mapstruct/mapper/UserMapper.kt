package com.devkuma.mapstruct.mapper

import com.devkuma.mapstruct.dto.UserDto
import com.devkuma.mapstruct.domain.User
import org.mapstruct.Mapper
import org.mapstruct.factory.Mappers

@Mapper
interface UserMapper {

    fun convertToDto(s: User): UserDto

    fun convertToDomain(s: UserDto): User

    companion object {
        val INSTANCE: UserMapper = Mappers.getMapper(UserMapper::class.java)
    }
}