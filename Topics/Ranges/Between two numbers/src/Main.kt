fun main() {
    val x = readln().toInt()
    val y = readln().toInt()
    val z = readln().toInt()
    val within = x in y..z

    println(within)
}