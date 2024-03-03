//package com.devkuma.kotest.tutorial.ordering
//
//import io.kotest.core.config.AbstractProjectConfig
//import io.kotest.core.spec.Order
//import io.kotest.core.spec.SpecExecutionOrder
//import io.kotest.core.spec.style.FunSpec
//
//class AnnotatedConfig: AbstractProjectConfig() {
//    override val specExecutionOrder = SpecExecutionOrder.Annotated
//}
//
//@Order(1)
//class FooTest : FunSpec({
//    test("foo") {
//        println("FooTest")
//    }
//})
//
//@Order(0)
//class BarTest: FunSpec({
//    test("bar") {
//        println("BarTest")
//    }
//})
//
//@Order(1)
//class FarTest : FunSpec({
//    test("far") {
//        println("FarTest")
//    }
//})
//
//class BooTest : FunSpec({
//    test("boo") {
//        println("BooTest")
//    }
//})