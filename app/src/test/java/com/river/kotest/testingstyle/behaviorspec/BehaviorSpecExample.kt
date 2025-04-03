package com.river.kotest.testingstyle.behaviorspec

import io.kotest.core.spec.style.BehaviorSpec

class BehaviorSpecExample : BehaviorSpec ({
    context("빗자루는 스스로 날아서 다시 돌아올 수 있어야 한다.") {
        given("빗자루가 있을 때") {
            `when`("내가 빗자루에 올라타면") {
                then("나는 날 수 있어야 한다.") {
                    // test code here
                }
            }
            `when`("내가 빗자루를 던지면") {
                then("빗자루는 날아서 다시 돌아와야 한다.") {
                    // test code here
                }
            }
        }
    }
})