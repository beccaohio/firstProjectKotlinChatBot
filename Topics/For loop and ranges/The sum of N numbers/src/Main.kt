fun main() {
    val num = readln().toInt()
    var sum = 0

    repeat(num) {
        val next = readln().toInt()
        sum += next
    }
    println(sum)
}