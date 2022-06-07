package basic.coroutine

fun main(){
    println("Coroutine")
    Thread.sleep(3000L) // 3초 동안 처리가 중지된다. 이 시간은 동안 처리는 전혀 진행되지 않는다.
    println("Hello")
}