package com.river.kotest.testingstyle.describespec

import io.kotest.core.spec.style.DescribeSpec

class DescribeSpecExample : DescribeSpec({
    describe("score") { // 그룹 이름
        it("start as zero") { // 실제 테스트

        }
        describe("with a strike") { // 중첩 describe
            it("adds ten") {
                // test here
            }
            it("carries strike to the next frame") {
                // test here
            }
        }

        describe("for the opposite team") {
            it("Should negate one score") {
                // test here
            }
        }
    }
})