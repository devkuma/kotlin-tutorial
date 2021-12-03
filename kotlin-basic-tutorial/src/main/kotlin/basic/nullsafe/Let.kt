package basic.nullsafe

fun main() {
    5.let {
        println(it * 3) // => 15
    }


    fun success(n: Int): Int = n + 1

    // Nullable한 변수
    val a: Int? = 3
    val b: Int? =
        if (a != null) success(a)
        else null

    println(b) // => 4
}