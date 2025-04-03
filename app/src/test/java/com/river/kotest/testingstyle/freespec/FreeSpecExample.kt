package com.river.kotest.testingstyle.freespec

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class FreeSpecExample : FreeSpec({
    "String.length" - {
        "문자열의 길이를 반환해야 한다" {
            "sammy".length shouldBe 5
            "".length shouldBe 0
        }
    }
    "컨테이너는 원하는 만큼 깊게 중첩할 수 있다" - {
        "그래서 또 다른 컨테이너를 중첩하고.." - {
            "그리고 또 다른 컨테이너.." - {
                "실제 테스트!!" {
                    1 + 1 shouldBe 2
                }
            }
        }
    }
})