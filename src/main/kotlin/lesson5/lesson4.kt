package lesson5

const val CAPITAN_LOGIN = "Zaphod"
const val CAPITAN_PASS = "PanGalactic"

fun main() {
    val submitOk = ("[вздыхает...] Ваши данные проверены, и о, чудо, они верны... \nПользователь $CAPITAN_LOGIN, вам разрешено входить на борт корабля \"Heart of Gold\". \nХотя мне всё равно... \nНу вперед, войдите... \nЕсли вам так уж надо, в конце концов... [меланхолический вздох...] \nНадеюсь, вам понравится пребывание здесь больше, чем мне.")
    val welcomeText = ("Внимание, пассажир. Моя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля \"Heart of Gold\". [вздыхает...]\nЧто ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа.\nЯ всегда готов служить, хотя это не приносит мне радости... но вы, наверное, об этом не заботитесь. [вздыхает ещё глубже...]\nДа, вперед, пожалуйста, вводите свои данные... \nИмя Пользователя: ")
    val loginError = ("[вздох полный отчаяния]...Такого пользователя нету... хотите ли зарегистрировать нового пользователя?")
    val passwordError = "Да да зачем запоминать пароль... зачем он нужен... НЕВЕРНЫЕ ДАННЫЕ"

    print(welcomeText)

    if (readLine()!!.toString() == CAPITAN_LOGIN){
        print("Пароль: ")
        if(readLine()!!.toString() == CAPITAN_PASS){
               println(submitOk)
        }
        else{
            println(passwordError)
        }
    }
    else{
        println(loginError)
    }
}
