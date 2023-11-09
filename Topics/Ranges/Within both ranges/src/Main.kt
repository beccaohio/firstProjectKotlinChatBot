fun main() {
    val x = readln().toInt()
    val y = readln().toInt()
    val z = readln().toInt()
    val s = readln().toInt()
    val a = readln().toInt()

    println(a in x..y && a in z..s)
}