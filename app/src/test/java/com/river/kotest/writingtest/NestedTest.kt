package com.river.kotest.writingtest

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class NestedTest : DescribeSpec({
    describe("an outer test") { // <- 컨테이너
        it("an inner test") { //<- 케이스
            1 + 2 shouldBe 3
        }
        it("an inner test too!") { // <- 케이스
            3 + 4 shouldBe 7
        }
    }
})