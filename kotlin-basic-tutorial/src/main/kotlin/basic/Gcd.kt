package basic

// 掛け算
fun times(a: Int, b: Int) = a * b

// 平方
fun square(n: Int): Int = times(n, n)

// 大きい方を返す
fun max(a: Int, b: Int): Int = if (a < b) b else a

// 小さい方を返す
fun min(a: Int, b: Int): Int = if (a <= b) a else b

// 最大公約数を返す
//fun gcd(a: Int, b: Int): Int {
//    var x = max(a, b)
//    var y = min(a, b)
//    while(y != 0) {
//        val w = y
//        y = x % y
//        x = w
//    }
//    return x
//}



