package com.devkuma.mapstruct.dto

import com.devkuma.mapstruct.mapper.UserMapper

data class UserDto(
    val name: String,
    val age: Int,
    val city: String?
) {

    fun convertToDomain() = UserMapper.INSTANCE.convertToDomain(this)
}