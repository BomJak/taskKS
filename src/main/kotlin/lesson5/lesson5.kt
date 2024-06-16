package lesson5

fun main() {
    val winningVal = arrayOf((0..42).random(), (0..42).random(), (0..42).random())

    var userInValue: Array<Int>

    println("Для участия в лотереи введите последовательно 3 числа в диапозоне от 0 до 42 включительно")
    println("Введите число: ")
    userInValue = arrayOf(readLine()!!.toInt(), readLine()!!.toInt(), readLine()!!.toInt())

    val intersectArr = winningVal.intersect(userInValue.toList())

    when (intersectArr.size) {
        3 -> println("Поздравляем вы выйграли $$$ ДЖЕКПОТ $$$")
        2 -> println("Поздравляем вы угадали 2 из 3 чисел ваш выигрыш \"крупный приз\"")
        1 -> println("Поздравляем вы угадали 1 из 3 чисел вы получаете \"утешительный приз\"")
        0 -> println("Вы не угадали ни одного числа")
    }
    println("Числа победители: " + winningVal.joinToString())
}
