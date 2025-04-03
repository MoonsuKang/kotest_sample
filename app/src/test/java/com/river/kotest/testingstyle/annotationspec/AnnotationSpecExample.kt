package com.river.kotest.testingstyle.annotationspec

import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe

class AnnotationSpecExample : AnnotationSpec() {

    @BeforeEach
    fun beforeTest() {
        println("테스트 전 실행")
    }

    @Test
    fun test1() {
        1 shouldBe 1
    }

    @Test
    fun test2() {
        3 shouldBe 3
    }
}