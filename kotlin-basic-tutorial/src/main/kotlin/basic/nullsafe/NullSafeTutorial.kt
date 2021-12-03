package basic

fun moneyStatus(name: String, money: Int?): String? {
    return "$name 님의 재산은 ${money?:"0"}원 입니다."
}

fun main(args:Array<String>) {
    var name1:String = "devkuma" // non-null
    //name1 = null // error
    var name2:String? = "kotlin"
    name2 = null;

    println("name1.length = ${name1.length}")
    println("name2.length = ${name2?.length}")

    println(moneyStatus("kimkc",2000000000))
    println(moneyStatus("devkuma",null))

    val framework:String? = "spring"
    println(framework?.uppercase())

    val library:String? = null
    println(library?.uppercase())
    println(library!!.uppercase());


    val str: String? =  null

    println(str!!.length)
}

