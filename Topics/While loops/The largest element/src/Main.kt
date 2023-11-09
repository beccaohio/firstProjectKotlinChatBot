fun main() {
    var max = 0
    var value = readln().toInt()
    while (value != 0) {
        if (value > max) {
            max = value
        }
        value = readln().toInt()
    }
    println(max)
}