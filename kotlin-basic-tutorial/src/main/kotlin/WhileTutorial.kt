fun main(args:Array<String>) {
    val mostLang = listOf("javascript", "python", "kotlin", "java", "go")

    println("== while case 1 ==============")
    var i = 0
    while (true) {
        if (i == mostLang.size) {
            break
        }
        println(mostLang[i])
        i++
    }

    println("== while case 2 ==============")
    var j = 0
    while (j < mostLang.size) {
        println(mostLang[j])
        j++
    }
}

