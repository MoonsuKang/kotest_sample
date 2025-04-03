package com.river.kotest.testingstyle.shouldspec

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class ShouldSpecContextExample : ShouldSpec({
    context("String.length") {  // 그룹 이름
        should("return the length of the string") {
            "sammy".length shouldBe 5
            "".length shouldBe 0
        }
    }
})
