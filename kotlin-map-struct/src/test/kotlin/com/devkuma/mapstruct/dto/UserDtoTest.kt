package com.devkuma.mapstruct.dto

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import kotlin.test.assertEquals

class UserDtoTest {

    @Test
    fun convertToDto(){

        // Given
        var userDto = UserDto(
            name = "devkuma",
            age = 20,
            city = "Seoul"
        )

        // When
        var user = userDto.convertToDomain()

        // Then
        assertAll(
            { assertEquals(userDto.name, user.name) },
            { assertEquals(userDto.age, user.age) },
            { assertEquals(userDto.city, user.city) },
        )
    }
}