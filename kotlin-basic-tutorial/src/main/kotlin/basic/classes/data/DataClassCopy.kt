package basic.classes.data

fun main() {
    val personData1 = PersonData("devkuma", 21)

    val personData2 = personData1.copy()
    val personData3 = personData1.copy(name = "kimkc")

    println(personData1)
    println(personData2)
    println(personData3)
}
