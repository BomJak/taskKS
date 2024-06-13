package lesson2

fun main(){
    val priceForWorker: Int = 30000
    val priceForIntern: Int = 20000

    val countOfWorker: Int = 50
    val countOfIntern: Int = 30

    val salaryAllWorkers = priceForWorker * countOfWorker
    val salaryForAll = salaryAllWorkers + (priceForIntern * countOfIntern)
    val middleSalary = salaryForAll / (countOfWorker + countOfIntern)

    println("Зарплата рабочих $salaryAllWorkers")
    println("Зарплата рабочих и стажеров $salaryForAll")
    println("Средняя зарплата: $middleSalary")

}