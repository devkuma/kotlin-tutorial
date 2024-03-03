package basic.annotations.ex5

@Ann(value = 10)
class MyClass {
    // ...
}

fun main(args: Array<String>) {
    val clazz = MyClass()
    val x = clazz.javaClass.getAnnotation(Ann::class.java)
    if (x != null) {
        println("Value:" + x?.value)
    }
}