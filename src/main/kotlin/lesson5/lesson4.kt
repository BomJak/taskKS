package lesson5

const val CAPITAN_LOGIN = "Zaphod"
const val CAPITAN_PASS = "PanGalactic"
const val SUBMIT_OK = ("[вздыхает...] Ваши данные проверены, и о, чудо, они верны... \n" +
        "Пользователь $CAPITAN_LOGIN, вам разрешено входить на борт корабля \"Heart of Gold\". \n" +
        "Хотя мне всё равно... \nНу вперед, войдите... \n" +
        "Если вам так уж надо, в конце концов... [меланхолический вздох...] \n" +
        "Надеюсь, вам понравится пребывание здесь больше, чем мне.")
const val WELCOME_TEXT = ("Внимание, пассажир. " +
        "Моя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля \"Heart of Gold\"." +
        " [вздыхает...]\nЧто ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа.\n" +
        "Я всегда готов служить, хотя это не приносит мне радости... но вы, наверное, об этом не заботитесь. " +
        "[вздыхает ещё глубже...]\n" +
        "Да, вперед, пожалуйста, вводите свои данные... \n" +
        "Имя Пользователя: ")
const val LOGIN_ERROR = ("[вздох полный отчаяния]...Такого пользователя нету... хотите ли зарегистрировать нового пользователя?")
const val PASSWORD_ERROR = "Да да зачем запоминать пароль... зачем он нужен... НЕВЕРНЫЕ ДАННЫЕ"

fun main() {

    print(WELCOME_TEXT)

    if (readLine()!!.toString() == CAPITAN_LOGIN){
        print("Пароль: ")
        if(readLine()!!.toString() == CAPITAN_PASS){
               println(SUBMIT_OK)
        }
        else{
            println(PASSWORD_ERROR)
        }
    }
    else{
        println(LOGIN_ERROR)
    }
}
