package lesson3

fun main() {
    val welcomeDay = "Доброго дня дорогой "
    val welcomeNight = "Добрый вечер дорогой "
    val userName = "Иван"

    var welcomeText = welcomeDay + userName
    println(welcomeText)

    welcomeText = welcomeNight + userName
    println(welcomeText)
}