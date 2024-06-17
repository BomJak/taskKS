package lesson2

fun main() {
    val ironOreMined = 11
    val crystalMined = 7
    val buffPercent = 0.2

    val ironOreBuffet: Int = (buffPercent * ironOreMined).toInt()
    val crystalBuffet: Int = (buffPercent * crystalMined).toInt()

    println("Бонусное железо: $ironOreBuffet")
    println("Бонусные кристаллы: $crystalBuffet")
}