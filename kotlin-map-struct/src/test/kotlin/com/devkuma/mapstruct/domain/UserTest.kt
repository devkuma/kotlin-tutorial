package com.devkuma.mapstruct.domain

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import kotlin.test.assertEquals

class UserTest {

    @Test
    fun convertToDto(){

        // Given
        var user = User(
            name = "devkuma",
            age = 20,
            city = "Seoul"
        )

        // When
        var userDto = user.convertToDto()

        // Then
        assertAll(
            { assertEquals(user.name, userDto.name) },
            { assertEquals(user.age, userDto.age) },
            { assertEquals(user.city, userDto.city) },
        )
    }
}