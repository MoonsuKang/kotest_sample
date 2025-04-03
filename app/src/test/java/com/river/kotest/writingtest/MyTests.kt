package com.river.kotest.writingtest

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.startWith

class MyTests : StringSpec({
    "length should return size of string" {
        "hello".length shouldBe 5 // 실제로 "hello"의 length가 5 인가요?
    }
    "startsWith should test for a prefix" {
        "world" should startWith("wor") // 실제로 "world"가 "wor"로 시작하나요?
    }
})