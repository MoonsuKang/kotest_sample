package com.river.kotest.testingstyle.behaviorspec

import io.kotest.core.spec.style.BehaviorSpec

class BehaviorSpecDisableExample: BehaviorSpec({
    xgiven("이 테스트는 비활성화됨") {
        When("부모에 의해 비활성화됨") {
            then("조상에게 비활성화됨") {
                // test code here
            }
        }
    }
    given("이 테스트는 활성화됨") {
        When("이것도 활성화됨") {
            xthen("이 테스트만 비활성화됨") {
                // test code here
            }
        }
    }
})