package com.river.kotest.testingstyle.shouldspec

import io.kotest.core.spec.style.ShouldSpec

class ShouldSpecDisableExample : ShouldSpec({
    context("this outer block is enabled") {
        xshould("this test is disabled") {   // 실행 안 됨
            // test here
        }
    }
    xcontext("this block is disabled") {     // 전체 block 비활성화
        should("disabled by inheritance from the parent") {   // 실행 안 됨
            // test here
        }
    }
})