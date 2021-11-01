package basic.lambda

fun main() {
    println("== Sample 1 ================")

    // 익명 함수를 생성하여 greeting에 할당한다.
    val greeting1 = fun() { println("Hello world!") }

    // 익명 함수 호출한다.
    greeting1()


    println("== Sample 2 ================")

    val greeting2: () -> Unit = { println("Hello world!") }

    greeting2()


    println("== Sample 3 ================")

    val greeting3 = { name: String, age: Int -> "Hello. My name is $name. I'm $age year old" }

    val result3 = greeting3("devkuma", 21)

    println(result3)


    println("== Sample 4 ================")

    val greeting4: (String, Int) -> String = { name, age -> "Hello. My name is $name. i'm $age year old" }

    val result4 = greeting4("devkuma", 21)

    println(result4)


    println("== Sample 5 ================")

    val greeting5: (String) -> String = { name -> "Hello. My name is $name." }

    val result5 = greeting5("devkuma")

    println(result5)


    println("== Sample 6 ================")

    val greeting6: (String) -> String = { "Hello. My name is $it." }

    val result6 = greeting6("devkuma")

    println(result6)



    println("== Sample 7 ================")

    val numbers = listOf(5, 1, 3, 2, 9, 6, 7, 8, 4)
    println(numbers)

    val sorted = numbers.sortedBy { it }
    println(sorted)

    val biggerThan5 = numbers.sortedBy { it }.filter { it > 5 }
    println(biggerThan5)

}