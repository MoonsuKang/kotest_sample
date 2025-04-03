package com.river.kotest.testingstyle.expectspec

import io.kotest.core.spec.style.ExpectSpec
import io.kotest.matchers.shouldBe

class ExpectSpecContextExample : ExpectSpec({
    context("덧셈 기능") {
        expect("1 + 2는 3이어야 한다") {
            (1 + 2) shouldBe 3
        }
    }
})