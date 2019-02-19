package org.konan.multiplatform

import org.greeting.SharedSpeaker
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class HelloWorldTest {

    @Test
    fun testPlatformGreeting() {
        assertEquals(SharedSpeaker().platformGreeting(), "Hello, Android world!")
    }
}

// Note that common tests (i.e. `SharedHelloWorldTest`) can be run from `greeting`
// with `test` Gradle task.
