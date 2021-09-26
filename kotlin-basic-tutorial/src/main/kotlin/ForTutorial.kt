fun main() {
    val langList = listOf("javascript", "python", "kotlin", "java", "go")

    println("========= for loop =============");
    for (item in langList) {
        println(item)
    }

    println("========= for loop index =============");
    for (index in langList.indices) {
        println("${index} = ${langList[index]}")
    }

    println("========= for each loop =============");
    langList.forEachIndexed { index, value ->
        println("$index = $value")
    }
}

