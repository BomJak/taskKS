package lesson3

fun main() {
    val inLogChess = "D2-D4;0"

    val parsingLog =inLogChess.split("-",";")

    val inMoveLog = parsingLog[0]
    val outMoveLog = parsingLog[1]
    val countMoveLog = parsingLog[2]

    println(inMoveLog)
    println(outMoveLog)
    println(countMoveLog)
}