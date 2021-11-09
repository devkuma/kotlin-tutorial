package basic.functions.inline

import javax.swing.tree.TreeNode

inline fun inlinedFunction(block: () -> Unit) {
    println("Hello!!")
}

fun main() {
    inlinedFunction {
        return // OK: 람다는 인라인되었다.
    }
}


fun <T> TreeNode.findParentOfType(clazz: Class<T>): T? {
    var p = parent
    while (p != null && !clazz.isInstance(p)) {
        p = p.parent
    }
    @Suppress("UNCHECKED_CAST")
    return p as T?
}