package com.river.kotest.testingstyle.funspec

import io.kotest.core.spec.style.FunSpec

class FunSpecDisableExample : FunSpec({
    context("this outer block is enabled") {   // context는 활성화
        xtest("this test is disabled") {      // test는 비활성화
            // test here
        }
    }
    xcontext("this block is disabled") {     // context 전체가 비활성화
        test("disabled by inheritance from the parent") {  // 따라서 이 test도 실행 안 됨
            // test here
        }
    }
})
