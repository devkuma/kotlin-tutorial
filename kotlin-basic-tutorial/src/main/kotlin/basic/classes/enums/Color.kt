package basic.classes.enums

enum class Color(val strRgb: String, val hexaRgb: Int) {
    RED("#f00", 0xFF0000),
    GREEN("#0f0", 0x00FF00),
    BLUE("#00f",0x0000FF ),
}

fun main() {
    println(Color.RED)
    println(Color.RED.name)
    println(Color.RED.strRgb)
    println(Color.RED.hexaRgb.toString(16))
}