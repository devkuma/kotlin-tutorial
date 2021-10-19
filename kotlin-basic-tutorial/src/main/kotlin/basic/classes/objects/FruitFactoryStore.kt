package basic.classes.objects

class FruitFactoryStore {
    companion object Factory {
        private val items = mutableListOf<String>()
        fun create(): FruitFactoryStore = FruitFactoryStore()
    }

    fun add(s: String) {
        items.add(s)
    }

    fun printList() {
        for (item in items) {
            println(item)
        }
    }
}

fun main() {
    val store = FruitFactoryStore.create()
    store.add("Apple")
    store.add("Orange")
    store.add("Banana")
    store.printList()

    println("-")

    val store2 = FruitFactoryStore.create()
    store2.printList()
}