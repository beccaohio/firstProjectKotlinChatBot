fun main() {
    val left = 0
    val right = 10
    val number = readln().toInt()

    val inRange = number > left && number < right

    println(inRange)
}