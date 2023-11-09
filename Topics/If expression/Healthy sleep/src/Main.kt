fun main() {
    val A = readln().toInt()
    val B = readln().toInt()
    val H = readln().toInt()

    when {
        A > H -> println("Deficiency")
        B < H -> println("Excess")
        else -> println("Normal")
    }
}