package basic.classes.data

fun main() {
    val personGeneral1 = PersonGeneral("devkuma", 21)
    val personGeneral2 = PersonGeneral("devkuma", 21)

    val personData1 = PersonData("devkuma", 21)
    val personData2 = PersonData("devkuma", 21)

    println(personGeneral1.hashCode())
    println(personGeneral2.hashCode())

    println(personData1.hashCode())
    println(personData2.hashCode())
}
