package lesson2

fun main(){
    val firstScore: Int = 3
    val secondScore: Int = 4
    val thirdScore: Int = 3
    val fourthScore: Int = 5
    val countOfStudent = 4f

    var arfMean: Float = (firstScore+secondScore+thirdScore+fourthScore)/countOfStudent
    println(String.format("%.2f",arfMean))
}