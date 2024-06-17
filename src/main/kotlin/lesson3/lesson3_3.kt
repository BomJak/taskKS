package lesson3

fun main(){
    val number = 5
    var count = 1

    println("""
           $number * $count = ${number * count++}
           $number * $count = ${number * count++}
           $number * $count = ${number * count++}
           $number * $count = ${number * count++}
           $number * $count = ${number * count++}
           $number * $count = ${number * count++}
           $number * $count = ${number * count++}
           $number * $count = ${number * count++}
           $number * $count = ${number * count++}
    """.trimIndent())
}