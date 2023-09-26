package com.example.mykotlinapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform