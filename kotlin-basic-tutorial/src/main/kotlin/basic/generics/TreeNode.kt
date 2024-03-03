package basic.generics

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

fun main() {
    val root = TreeNode("Hello").apply {
        addChild("World")
        addChild("!!!")
    }

    println(root) // Hello {World {}, !!! {}}
}

open class DataHolder<T>(val data: T)

// 실제 타입을 상위 타입의 타입 인자로 넘김
class StringDataHolder(data: String) : DataHolder<String>(data)

// 타입 인자를 상위 타입의 타입 인자로 넘김
//class TreeNode<T>(data: T) : DataHolder<T>(data) { }


//class TreeNode<U>(data: U) : DataHolder<U>(data) { }


//error: one type argument expected for class DataHolder<T>
//class StringDataHolder2(data: String) : DataHolder(data)

// Ok: DataHolder<String>를 컴파일러가 추론함
fun stringDataHolder(data: String) = DataHolder(data)

// error: type parameter of a property must be used in its receiver type
//var <T> root: TreeNode<T>? = null

// error: type parameters are not allowed for objects
//object EmptyTree<T>



fun <T> TreeNode<T>.addChildren(vararg data: T) {
    data.forEach { addChild(it) }
}

val <T> TreeNode<T>.depth: Int
    get() = (children.asSequence().map { it.depth }.maxOrNull() ?: 0) + 1

fun <T> TreeNode<T>.walkDepthFirst(action: (T) -> Unit) {
    children.forEach { it.walkDepthFirst(action) }
    action(data)
}

fun <T : Number>TreeNode<T>.average(): Double {
    var count = 0
    var sum = 0.0
    walkDepthFirst {  // 깊이 우선으로 노드를 방문하면서 함수 수행
        count++
        sum += it.toDouble()
    }
    return sum/count
}

fun main2() {
val intTree = TreeNode(1).apply {
    addChild(2).addChild(3)
    addChild(4).addChild(5)
}
println(intTree.average()) // 3.0

val doubleTree = TreeNode(1.0).apply {
    addChild(2.0)
    addChild(3.0)
}
println(doubleTree.average()) // 2.0

val stringTree = TreeNode("Hello").apply {
    addChildren("World", "!!!")
}
// error: unresolved reference. None of the following candidates is applicable because of receiver type mismatch
//println(stringTree.average())



}



// 제네릭이 아닌 함수로 대신할 수 있다.
// fun TreeNode<Int>.sum(): Int {...}
fun TreeNode<Int>.sum(): Int { // Warning
    var sum = 0
    walkDepthFirst{ sum += it }
    return sum
}


fun <T : Comparable<T>> TreeNode<T>.maxNode(): TreeNode<T> {
    val maxChild = children.maxByOrNull { it.data } ?: return this

    return if (data >= maxChild.data) this else maxChild
}

fun main3() {
    // Double은 Comparable<Double>의 하위 타입임
    val doubleTree = TreeNode(1.0).apply {
        addChild(2.0)
        addChild(3.0)
    }
    println(doubleTree.maxNode().data) // 3.0

    // String은 Comparable<String>의 하위 타입임
    val stringTree = TreeNode("abc").apply {
        addChildren("xyz", "def")
    }
    println(stringTree.maxNode().data) // xyz
}

fun <T, U : T> TreeNode<U>.toList(list: MutableList<T>) {
    walkDepthFirst{ list += it }
}

fun main4() {
    val list = ArrayList<Number>()

    TreeNode(1).apply {
        addChild(2)
        addChild(3)
    }.toList(list)

    TreeNode(1.0).apply {
        addChild(2.0)
        addChild(3.0)
    }.toList(list)
}


interface Named {
    val name: String
}

interface Identified {
    val id: Int
}

class Registry<T> where T : Named, T : Identified {
    private val items = ArrayList<T>()

    fun print() {
        items.forEach {
            println("id=${it.id}, name=${it.name}")
        }
    }
}

//fun <T> TreeNode<T>.addSubtree(node: TreeNode<T>): TreeNode<T> {
//    val newNode = addChild(node.data)
//    node.children.forEach { newNode.addSubtree (it) }
//    return newNode
//}

fun <T> TreeNode<T>.addSubtree(node: TreeNode<out T>): TreeNode<T> {
    val newNode = addChild(node.data)

    node.children.forEach { newNode.addSubtree(it) }
    return newNode
}

fun main6() {
//    val root = TreeNode("abc")
//    val subRoot = TreeNode("def")
//
//    root.addSubtree(subRoot)
//    println(root) // abc {def {}}

    val root = TreeNode<Number>(123)
    val subRoot = TreeNode(456.7)
    root.addSubtree(subRoot) // error: type mismatch

//    val any: Any = ""
//    any is TreeNode<*>
//    any is TreeNode<out Any?> // Ok
//    any is TreeNode<out Number> // error: cannot check for instance of erased type
}


//interface Named2 {
//    val name: String
//}
//
//interface Identified2 {
//    val id: Int
//}
//
//class Registry2<T> where T : Named2, T : Identified2
//
//// Registry의 타입 파라미터의 바운드는 Named와 Identified의 교집합이다
//var registry: Registry2<*>? = null
//
//println(registry?.id ?: "")    // error: unresolved reference: id
//println(registry?.name ?: "")  // error: unresolved reference: name

//fun main12() {
//    // error: nested and local type aliases are not supported
//    typealias A = Int
//}