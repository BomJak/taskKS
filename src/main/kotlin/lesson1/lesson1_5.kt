package lesson1

import kotlin.reflect.typeOf

fun main(){
    val full_seconds: Short = 6480

    val ost_seconds = full_seconds % 60

    val ost_minute = (full_seconds / 60)%60

    val ost_hours = full_seconds / 3600

    print("0$ost_hours:$ost_minute:0$ost_seconds")
}