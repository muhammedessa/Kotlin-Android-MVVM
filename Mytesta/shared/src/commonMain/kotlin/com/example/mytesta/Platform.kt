package com.example.mytesta

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform