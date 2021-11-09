package basic.functions.inline


fun ordinaryFunction(block: () -> Unit) {
    println("Hello!!")
}

fun main() {
    ordinaryFunction {
        //return // ERROR: `foo`을 여기에 return 할 수 없다.
    }
}

