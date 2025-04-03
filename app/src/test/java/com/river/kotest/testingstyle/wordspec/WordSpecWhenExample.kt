package com.river.kotest.testingstyle.wordspec

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe

class WordSpecWhenExample : WordSpec({
    "Hello" When {
        "길이를 요청하면" should {
            "5를 반환해야 한다" {
                "Hello".length shouldBe 5
            }
        }
        "Bob과 붙이면" should {
            "Hello Bob이 되어야 한다" {
                "Hello " + "Bob" shouldBe "Hello Bob"
            }
        }
    }
})