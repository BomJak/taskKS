package lesson4

fun main() {
    var curDays = 5

    val isEven: Boolean = (curDays % 2 == 0)

    println(
        """
        Упражнения для рук:    ${!isEven}
        Упражнения для ног:    $isEven
        Упражнения для спины:  $isEven
        Упражнения для пресса: ${!isEven}
    """.trimMargin("$")
    )
}