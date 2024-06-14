package lesson3

fun main() {
    val inLogChess = "D2-D4;0"
    val inMoveLog: String = inLogChess.substring(0..1)
    val outMoveLog: String = inLogChess.substring(3..4)
    val countMoveLog: String = inLogChess.substringAfter(';')

    println(inMoveLog)
    println(outMoveLog)
    println(countMoveLog)
}