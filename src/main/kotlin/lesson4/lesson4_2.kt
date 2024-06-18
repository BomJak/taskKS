package lesson3

const val MIN_WEIGH_AVARAGE = 35
const val MAX_WEIGH_AVARAGE = 100

const val MAX_SIZE_AVARAGE = 100

fun main() {
    val firstProductWeigh = 20
    val firstProductSize = 80

    val secondProductWeigh = 50
    val secondProductSize = 100

    val firstСonditionCheck = (firstProductSize < MAX_SIZE_AVARAGE) && ((firstProductWeigh > MIN_WEIGH_AVARAGE) && (firstProductWeigh <= MAX_WEIGH_AVARAGE))
    val secondСonditionCheck = (secondProductSize < MAX_SIZE_AVARAGE) && ((secondProductWeigh > MIN_WEIGH_AVARAGE) && (secondProductWeigh <= MAX_WEIGH_AVARAGE))

    println(
        "Первый груз весом $firstProductWeigh объемом $firstProductSize соответствует \'Avarage\': $firstСonditionCheck\n" +
        "Второй груз весом $secondProductWeigh объемом $secondProductSize соответствует \'Avarage\': $secondСonditionCheck"
    )
}