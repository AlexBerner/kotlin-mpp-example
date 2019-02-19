package org.greeting

expect class Platform() {
    val name: String
}

class SharedSpeaker {
    fun sharedGreeting(): String = "Hello, Android and iOS worlds!"
    fun platformGreeting(): String = "Hello, ${Platform().name} world!"
}
