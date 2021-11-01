package basic.fuctions.extension


//fun Any?.toString(): String {
//    if (this == null) return "null"
//    // null인지 확인 후에 'this'는 null이 아닌 타입으로 자동 변환되므로 아래의 'toString()'은
//    // Any 클래스의 멤버 함수로 확인된다.
//    return toString()
//}

fun main() {
    println(null.toString())
}