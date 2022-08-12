package com.devkuma.mapstruct.domain

import com.devkuma.mapstruct.mapper.UserMapper

data class User(
    val name: String,
    val age: Int,
    val city: String?
) {

    fun convertToDto() = UserMapper.INSTANCE.convertToDto(this)
}