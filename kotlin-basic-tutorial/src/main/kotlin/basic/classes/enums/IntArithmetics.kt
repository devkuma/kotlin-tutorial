package basic.classes.enums

import java.util.function.BinaryOperator
import java.util.function.IntBinaryOperator

enum class IntArithmetics : BinaryOperator<Int>, IntBinaryOperator {
    PLUS {
        override fun apply(t: Int, u: Int): Int = t + u
    },
    TIMES {
        override fun apply(t: Int, u: Int): Int = t * u
    };

    override fun applyAsInt(t: Int, u: Int) = apply(t, u)
}

fun main() {
    val t = 2
    val u = 3

    println("PLUS($t, $u) = ${IntArithmetics.PLUS.apply(t, u)}");
    println("TIMES($t, $u) = ${IntArithmetics.TIMES.apply(t, u)}");
}