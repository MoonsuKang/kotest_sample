package com.river.kotest.testingstyle.shouldspec

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class ShouldSpecExample : ShouldSpec({
    should("return the length of the string") {
        "sammy".length shouldBe 5 // 실제로 "sammy"의 length가 5 인가요?
        "".length shouldBe 0 // 실제로 ""의 length가 0 인가요?
    }
})