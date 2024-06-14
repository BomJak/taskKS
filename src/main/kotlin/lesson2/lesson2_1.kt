package lesson2

fun main(){
    val firstScore: Int = 3
    val secondScore: Int = 4
    val thirdScore: Int = 3
    val fourthScore: Int = 5
    var arfMean: Float = (firstScore+secondScore+thirdScore+fourthScore)/4f
    println(String.format("%.2f",arfMean))
}