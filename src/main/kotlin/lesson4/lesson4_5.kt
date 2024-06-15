package lesson4

const val NEEDFUL_FOOD = 50
const val MIN_CREW_WHOLE_SHIP = 55
const val MAX_CREW_WHOLE_SHIP = 70
const val NEED_CREW_BROKEN_SHIP = 70


fun main() {
    print("Корабыль без поврежденний? (true/false): ")
    val shipWhole: Boolean = readLine().toBoolean()

    print("Введите количество экипажа: ")
    val shipCrew: Int = readLine()!!.toInt()

    print("Введите количество провизии: ")
    val shipFood: Int = readLine()!!.toInt()

    print("Благоприятные метеоусловия? (true/false): ")
    val meteoDate: Boolean = readLine().toBoolean()

    println(
        "Корабыль может отправиться в плавание: " +
                "${
                    ((shipWhole == true) && (shipCrew in MIN_CREW_WHOLE_SHIP..MAX_CREW_WHOLE_SHIP) && (shipFood > NEEDFUL_FOOD))
                            or ((shipWhole == false) && (shipCrew == NEED_CREW_BROKEN_SHIP) && (meteoDate == true) && (shipFood > NEEDFUL_FOOD))
                }"
    )
}