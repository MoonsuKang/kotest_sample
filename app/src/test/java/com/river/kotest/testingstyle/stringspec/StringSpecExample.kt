package com.river.kotest.testingstyle.stringspec

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class StringSpecExample : StringSpec({
    "strings.length should return size of string" {
        "hello".length shouldBe 5 // 실제로 "hello"의 length가 5 인가요?
    }
})