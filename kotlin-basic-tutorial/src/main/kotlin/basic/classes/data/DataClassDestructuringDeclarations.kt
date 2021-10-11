package basic.classes.data

fun main() {
    val personData1 = PersonData("devkuma", 21)

    val (name, age) = personData1

    println("$name, $age years of age")
}
