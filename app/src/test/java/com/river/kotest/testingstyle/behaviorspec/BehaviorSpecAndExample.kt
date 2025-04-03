package com.river.kotest.testingstyle.behaviorspec

import io.kotest.core.spec.style.BehaviorSpec

class BehaviorSpecAndExample : BehaviorSpec({
    given("빗자루가 있을 때") {
        and("마녀도 같이 있다면") {
            `when`("마녀가 빗자루에 올라타면") {
                and("마녀가 히히 하고 웃는다면") {
                    then("마녀는 날 수 있어야 한다") {
                        // test code
                    }
                }
            }
        }
    }
})