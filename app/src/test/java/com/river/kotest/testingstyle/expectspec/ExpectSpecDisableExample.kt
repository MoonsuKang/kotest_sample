package com.river.kotest.testingstyle.expectspec

import io.kotest.core.spec.style.ExpectSpec

class ExpectSpecDisableExample : ExpectSpec({
    context("this outer block is enabled") {
        xexpect("this test is disabled") {
            // 비활성화됨
        }
    }
    xcontext("this block is disabled") {
        expect("disabled by inheritance from the parent") {
            // 실행 안 됨
        }
    }
})