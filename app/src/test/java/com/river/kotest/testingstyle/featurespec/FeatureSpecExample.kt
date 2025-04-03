package com.river.kotest.testingstyle.featurespec

import io.kotest.core.spec.style.FeatureSpec

class FeatureSpecExample : FeatureSpec({
    feature("코카콜라 캔") {
        scenario("흔들면 탄산이 터져야 한다") {
            // test here
        }
        scenario("그리고 맛있어야 한다") {
            // test here
        }
    }
})