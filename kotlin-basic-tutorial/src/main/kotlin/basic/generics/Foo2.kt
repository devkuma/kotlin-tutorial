package basic.generics

fun main() {
    val list = listOf(1, 2, 3) // List<Int>
    list is List<Number> // OK
    //list is List<String> // error: cannot check for instance of erased type: List<String>


    println(list is List<*>)
    println(list is Map<*, *>)


    val collection: Collection<Int> = setOf(1, 2, 3)

    if (collection is List<Int>) {
        println("list")
    } else {
        println("not list")
    }

    val n = (listOf(1, 2, 3) as List<Number>)[0] // OK
    val s = (listOf(1, 2, 3) as List<String>)[0] // java.lang.ClassCastException
}