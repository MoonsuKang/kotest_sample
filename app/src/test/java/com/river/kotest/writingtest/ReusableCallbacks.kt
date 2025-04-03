package com.river.kotest.writingtest

import io.kotest.core.spec.BeforeTest
import io.kotest.core.spec.style.FunSpec

val resetDatabase: BeforeTest = {
    println("DB 초기화")
}

class ReusableCallbacks : FunSpec({

    beforeTest(resetDatabase)

    test("DB가 깨끗해야하는 테스트") {
        println("테스트 실행")
    }
})
