package basic.classes.enums

fun main() {
    println(Direction.valueOf("NORTH").name)
    println(Direction.values().joinToString())
}