package lesson5

const val FIRST_WIN_VAL = 1
const val SECOND_WIN_VAL = 4

const val MIN_VAL = 0
const val MAX_VAL = 42

fun main() {
    val firstIn: Int
    val secondIn: Int

    println("Для участие введите два значения в диапозоне От 0 До 42")

    print("Введите первое значение: ")
    firstIn = readLine()!!.toInt()
    print("Введите второе значение: ")
    secondIn = readLine()!!.toInt()

    if (!(firstIn in MIN_VAL..MAX_VAL) || !(secondIn in MIN_VAL..MAX_VAL) || (firstIn == secondIn)) {
        println("Ошибка ввода")
    } else {
        when {
            ((firstIn == FIRST_WIN_VAL || firstIn == SECOND_WIN_VAL) && (secondIn == FIRST_WIN_VAL || secondIn == SECOND_WIN_VAL)) -> println(
                "Поздравляем! Вы выиграли главный приз!"
            )

            ((firstIn != FIRST_WIN_VAL && firstIn != SECOND_WIN_VAL) && (secondIn != FIRST_WIN_VAL && secondIn != SECOND_WIN_VAL)) -> println(
                "Неудача!"
            )

            else -> println("Вы выиграли утешительный приз!")
        }
        println("Победные номера $FIRST_WIN_VAL и $SECOND_WIN_VAL")
    }
}