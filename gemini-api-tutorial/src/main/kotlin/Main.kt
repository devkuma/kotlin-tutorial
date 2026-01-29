package com.devkuma

import com.google.genai.Client

fun main() {
    val client = Client.builder().apiKey("GEMINI_API_KEY").build()

    val response =
        client.models.generateContent(
            "gemini-3-flash-preview",
            "인공지능에 대해 한 문장으로 설명하세요.",
            null
        )

    println(response.text())
}