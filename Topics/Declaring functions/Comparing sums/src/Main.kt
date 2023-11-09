fun isGreater(a: Int, b: Int, c: Int, d:Int): Boolean {
    val sum1 = a + b
    val sum2 = c + d
    val result = sum1 > sum2
    return result
}

fun main() {
    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()
    val number3 = readLine()!!.toInt()
    val number4 = readLine()!!.toInt()

    println(isGreater(number1, number2, number3, number4))
}