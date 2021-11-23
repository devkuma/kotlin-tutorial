package basic.functions.lambda

fun main() {

    println("== Sample 1 ================")

    var add1 = fun(a: Int, b: Int): Int = a + b

    println(add1(3, 5))


    println("== Sample 2 ================")

    var add2 = { a: Int, b: Int -> a + b }
    var add3: (Int, Int) -> Int = { a, b -> a + b }

    println(add2(3, 5))
    println(add3(3, 5))

    println("== Sample 3 ================")

    var square: (Int) -> Int = { it * it }
    println(square(5))
}