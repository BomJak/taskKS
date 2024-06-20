package lesson5

const val AGE_OF_MAJORITY = 18
const val CURRENT_YEAR = 2024

const val WELCOME_TEXT = "Показать экран со скрытым контентом"
const val NOT_WELCOME_TEXT = "Вернуться на главный экран"


fun main(){
    print("Введите год рождения: ")
    val userBirthYear = readLine()!!.toInt()

    if((CURRENT_YEAR-userBirthYear)>= AGE_OF_MAJORITY){
        println(WELCOME_TEXT)
    }
    else{
        println(NOT_WELCOME_TEXT)
    }
}