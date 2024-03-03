package test

class TreeNode<T>(val data: T) {
    private val _children = arrayListOf<TreeNode<T>>()
    var parent: TreeNode<T>? = null

        private set

    val children: List<TreeNode<T>>get() = _children

    fun addChild(data: T) = TreeNode(data).also {
        _children += it
        it.parent = this
    }

    override fun toString() =
        _children.joinToString(prefix = "$data {", postfix = "}")
}

fun main1() {
    val root = TreeNode("Hello").apply {
        addChild("World")
        addChild("!!!")
    }

    println(root) // Hello {World {}, !!! {}}
}

fun <T : Comparable<T>> TreeNode<T>.maxNode(): TreeNode<T> {
    val maxChild = children.maxByOrNull { it.data } ?: return this

    return if (data >= maxChild.data) this else maxChild
}

fun main() {
//    // Double은 Comparable<Double>의 하위 타입임
//    val doubleTree = TreeNode(1.0).apply {
//        addChild(2.0)
//        addChild(3.0)
//    }
//    println(doubleTree.maxNode().data) // 3.0
//
//
//    val collection: Collection<Int> = setOf(1, 2, 3)
//
//    if (collection is List<Int>) {
//        println("list")
//    } else {
//        println("not list")
//    }
//
//    val n = (listOf(1, 2, 3) as List<Number>)[0] // OK
//    val s = (listOf(1, 2, 3) as List<String>)[0] // java.lang.ClassCastException
//

//    val stringNode = TreeNode<String>("Hello")
//    val anyNode: TreeNode<Any> = stringNode
//    anyNode.addChild(123)
//    val s = stringNode.children.first() // ???


    // 배열에서는 공변이고, Long은 Object의 하위 타입이기에 할당이 가능하다.

    // 배열에서는 공변이고, Long은 Object의 하위 타입이기에 할당이 가능하다.
//    val stringArray = emptyArray<String>()
//    val anyArray : Array<Any> = stringArray // error
//    val a = anyArray.first()
//
//    // 공변으로 인해 선언한 arr은 Object로 참조가 된상태라 String도 할당 가능하다.
//
//    // 공변으로 인해 선언한 arr은 Object로 참조가 된상태라 String도 할당 가능하다.
//    arr.get(0) = "arr" // 그런데, 여기서 런타임에 ArrayStoreException 발생
    val stringProducer: () -> String = { "Hello" }
    val anyProducer: () -> Any = stringProducer
    println(anyProducer()) // Hello
}

