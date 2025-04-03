package com.river.kotest.testingstyle.wordspec

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

class WordSpecExample : WordSpec({
    "String.length" should  {
        "문자열의 길이를 반환해야 한다" {
            "sammy".length shouldBe 5
            "".length shouldBe 0
        }
    }
})