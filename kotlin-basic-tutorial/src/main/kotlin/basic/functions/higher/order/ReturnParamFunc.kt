package basic.higher.order.functions

fun returnParamFunc(func: () -> String): () -> String {
    return func
}

fun main() {
    val hello: () -> String = { "Hello world!" }

    val returned = returnParamFunc(hello)
    print("${returned()}")
}