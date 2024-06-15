package lesson4

fun main() {
    var curDays = 5

    var workoutArms: Boolean = (curDays % 2 != 0)
    var workoutLegs: Boolean = (curDays % 2 == 0)
    var workoutBack: Boolean = (curDays % 2 == 0)
    var workoutPress: Boolean = (curDays % 2 != 0)

    println(
        """
        Упражнения для рук:    $workoutArms
        Упражнения для ног:    $workoutLegs
        Упражнения для спины:  $workoutBack
        Упражнения для пресса: $workoutPress
    """.trimMargin("$")
    )
}