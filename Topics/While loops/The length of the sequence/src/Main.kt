fun main() {
    var counter = 0
    do {
        val num = readln().toInt()
        if (num != 0)
            counter++
    } while (num > 0)
    println(counter)
}