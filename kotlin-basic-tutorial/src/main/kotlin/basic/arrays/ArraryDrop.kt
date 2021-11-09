package basic.arrays

fun main() {
    val array = arrayOf(1, 2, 3, 4, 5)
    array.drop(1).forEach{print(it)} // => 2, 3, 4, 5
    println()
    array.drop(2).forEach{print(it)} // => 3, 4, 5
    println()
    array.drop(3).forEach{print(it)} // => 4, 5
    println()
    array.drop(4).forEach{print(it)} // => 5
    println()
    array.drop(5).forEach{print(it)} // => 비어 있는 Array
}