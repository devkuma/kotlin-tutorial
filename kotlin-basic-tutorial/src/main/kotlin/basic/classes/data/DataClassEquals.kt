package basic.classes.data

fun main() {
    val personData1 = PersonData("devkuma", 21)
    val personData2 = PersonData("devkuma", 21)

    println(personData1 == personData2)
    println(personData1 === personData2)
}
