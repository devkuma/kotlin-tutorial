package basic.nullsafe

fun <T> filterNotNull(list: List<T?>): List<T> =
    list.filter { it != null }
        .map { it!! }

fun main() {
    val a: List<String?> = listOf("kimkc", null, "devkuma")
    val b: List<String> = filterNotNull(a)
    println(b) // => ["kimkc", "devkuma"]
}