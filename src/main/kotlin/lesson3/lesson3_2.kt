package lesson3

fun main(){
    var userSureName = "Андреева"
    val userName = "Татьяна"
    val userLastname = "Сергеевна"
    var userAge = 20

    println("$userSureName $userName $userLastname $userAge")
    userSureName="Сидорова"
    println("$userSureName $userName $userLastname ${userAge+2}")
}