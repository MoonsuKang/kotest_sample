package com.river.kotest.writingtest

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.string.shouldHaveLength

class CallBackTest : FunSpec({

    beforeEach {
        println("Hello from $it")
    }

    test("sam should be a three letter name") {
        "sam".shouldHaveLength(3)
    }

    afterEach {
        println("GoodBye from $it")
    }

})