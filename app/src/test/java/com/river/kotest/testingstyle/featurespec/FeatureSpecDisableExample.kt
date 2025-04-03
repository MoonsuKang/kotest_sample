package com.river.kotest.testingstyle.featurespec

import io.kotest.core.spec.style.FeatureSpec

class FeatureSpecDisableExample : FeatureSpec({
    feature("this outer block is enabled") {
        xscenario("this test is disabled") { // 비활성화
            // test here
        }
    }
    xfeature("this block is disabled") {   // feature 자체가 비활성화
        scenario("disabled by inheritance from the parent") {  // 실행 안 됨
            // test here
        }
    }
})