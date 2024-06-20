package lesson5

const val WELCOME_TEXT = "Добро пожаловать!"
const val NOT_WELCOME_TEXT = "Доступ запрещен."

fun main() {
    val firstValue = (0..9).random()
    val secondValue = (0..9).random()

    print("Для входа решите задачку $firstValue + $secondValue = ")

    val resultatValue = readLine()!!.toInt()
    if ((firstValue + secondValue) == resultatValue){
        println(WELCOME_TEXT)
    }
    else{
        println(NOT_WELCOME_TEXT)
    }
}