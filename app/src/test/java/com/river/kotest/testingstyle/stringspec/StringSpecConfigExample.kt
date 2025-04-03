package com.river.kotest.testingstyle.stringspec

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class StringSpecConfigExample : StringSpec({
    "string.length should return size of string".config(enabled = false, invocations = 3) {
        "hello".length shouldBe 5
    }
})