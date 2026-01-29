//package com.devkuma.kotest.tutorial.conditional
//
//import io.kotest.core.annotation.EnabledCondition
//import io.kotest.core.annotation.EnabledIf
//import io.kotest.core.spec.Spec
//import io.kotest.core.spec.style.StringSpec
//
//import io.kotest.matchers.shouldBe
//import kotlin.reflect.KClass
//
//@EnabledIf(MyEnabledCondition::class)
//class EnabledIfTest2 : StringSpec({
//    "이 테스트는 특정 조건이 참일 때 실행된다" {
//        // 이 테스트는 MyEnabledCondition에서 지정한 조건이 참일 때 실행된다.
//        1 + 1 shouldBe 2
//    }
//})
//
//object MyEnabledCondition : EnabledCondition {
//    override fun enabled(kclass: KClass<out Spec>): Boolean {
//        // 여기서는 특정 조건을 판별하여 참 또는 거짓을 반환한다.
//        return true // 특정 조건이 참이면 true를 반환하여 테스트를 활성화한다.
//    }
//}