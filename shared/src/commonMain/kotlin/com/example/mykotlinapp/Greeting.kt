package com.example.mykotlinapp

import daysUntilNewYear
import kotlin.random.Random
import kotlin.annotation.AnnotationRetention

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): List<String> = buildList {
        add(if (Random.nextBoolean()) "Hi!" else "Hello!")
        add("Guess what it is man! > ${platform.name.reversed()}!")
        add("\nThere are only ${daysUntilNewYear()} days left until New Year!")
    }
}