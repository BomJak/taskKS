package lesson3

const val needValWeather = true
const val needValTent = true
const val needValWet = 20
const val notNeedSeason = "зима"

fun main() {
    val curValWeather = true
    val curValTent = true
    val curValWet = 20
    val curSeason = "зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? ${(curValWeather == needValWeather) && 
                (curValTent == needValTent) &&
                (curValWet == needValWet) &&
                !(curSeason == notNeedSeason)
        }"
    )
}