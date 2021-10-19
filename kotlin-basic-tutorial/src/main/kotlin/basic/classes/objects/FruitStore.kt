package basic.classes.objects

object FruitStore {
    private val fruits = mutableListOf<String>()

    fun add(s: String) {
        fruits.add(s)
    }

    fun printList() {
        for (item in fruits) {
            println(item)
        }
    }
}

fun main() {
    FruitStore.add("Apple")
    FruitStore.add("Orange")
    FruitStore.add("Banana")
    FruitStore.printList()
}