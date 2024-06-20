package lesson5


const val MIN_VAL = 0
const val MAX_VAL = 42

fun main() {
    val firstIn: Int
    val secondIn: Int

    val firstWinValue = (MIN_VAL..MAX_VAL).random()
    val secontWinValue =(MIN_VAL..MAX_VAL).random()

    println("Для участие введите два значения в диапозоне От 0 До 42")

    print("Введите первое значение: ")
    firstIn = readLine()!!.toInt()
    print("Введите второе значение: ")
    secondIn = readLine()!!.toInt()

    if (!(firstIn in MIN_VAL..MAX_VAL) || !(secondIn in MIN_VAL..MAX_VAL) || (firstIn == secondIn)) {
        println("Ошибка ввода")
    } else {
        when {
            ((firstIn == firstWinValue || firstIn == secontWinValue) &&
                    (secondIn == firstWinValue || secondIn == secontWinValue)) -> println(
                "Поздравляем! Вы выиграли главный приз!"
            )

            ((firstIn != firstWinValue && firstIn != secontWinValue) &&
                    (secondIn != firstWinValue && secondIn != secontWinValue)) -> println(
                "Неудача!"
            )

            else -> println("Вы выиграли утешительный приз!")
        }
        println("Победные номера $firstWinValue и $secontWinValue")
    }
}