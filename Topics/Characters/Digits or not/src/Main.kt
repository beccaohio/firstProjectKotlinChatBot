fun main() {
    val ch1 = readln().first()
    val ch2 = readln().first()
    val ch3 = readln().first()
    val ch4 = readln().first()

    val isDigit = ch1 >= '\u0030' && ch1 <= '\u0039'
    val isDigit2 = ch2 >= '\u0030' && ch2 <= '\u0039'
    val isDigit3 = ch3 >= '\u0030' && ch3 <= '\u0039'
    val isDigit4 = ch4 >= '\u0030' && ch4 <= '\u0039'

    println(isDigit)
    println(isDigit2)
    println(isDigit3)
    println(isDigit4)
}