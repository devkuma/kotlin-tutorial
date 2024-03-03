package basic.collections.map

class UserDb {
    // 사용자 나이 캐시
    private var userAge = mutableMapOf<String, Int>()

    // 사용자 나이를 가져온다(캐시를 이용).
    fun getAge(name: String): Int = userAge.getOrPut(name) { getAgeWithoutCache(name) }

    private fun getAgeWithoutCache(name: String): Int {
        // 초기값 계산에 시간이 걸린다고 가정
        return 10
    }
}

fun main() {
    val userDb = UserDb()
    val age: Int = userDb.getAge("devkuma")
    println(age)
}