package basic.functions.lambda

fun counter(): () -> Int {
    var count = 0
    return {
        count++
    }
}

fun main() {
    val counter1 = counter()
    println(counter1()) // => 0
    println(counter1()) // => 1
    println(counter1()) // => 2

    val counter2 = counter()
    println(counter2()) // => 0
    println(counter2()) // => 1
}