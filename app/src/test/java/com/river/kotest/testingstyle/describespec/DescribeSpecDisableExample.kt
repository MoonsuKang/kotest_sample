package com.river.kotest.testingstyle.describespec

import io.kotest.core.spec.style.DescribeSpec

class DescribeSpecDisableExample : DescribeSpec({
    describe("this outer block is enabled") {
        xit("this test is disabled") { // 실행 안 됨
            // test here
        }
    }
    xdescribe("this block is disabled") { // 아래 it들도 전부 실행 안 됨
        it("disabled by inheritance from the parent") {
            // test here
        }
    }
})