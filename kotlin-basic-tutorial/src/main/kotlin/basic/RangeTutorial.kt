package basic

fun main(args: Array<String>) {
    println("==== if num1 in 4...8 ====")
    val num1 = 5
    if (num1 in 4..8) {
        println("$num1 in 4~8")
    }

    println("======= if num2 !in 4...8 =======")
    val num2 = 0;
    if (num2 !in 4..8) {
        println("$num2 not in 4~8")
    }

    println("========= for i in 1..7 =========")
    for (i in 1..7) {
        print("$i ")
    }
    println()

    println("====== for i in 1 until 7 ======")
    for (i in 1 until 7) {
        print("$i ")
    }
    println()

    println("====== for i in downTo 1 =======")
    for (i in 7 downTo 1) {
        print("$i ")
    }
    println()

    println("====== for i in 1..7 step 2 ======")
    for (i in 1..7 step 2) {
        print("$i ")
    }
}