import currency.Currency
import distance.Distance
import temperature.Temperature
import java.io.File

fun main() {
    while (true) {
        println("1 - Конвертер валют")
        println("2 - Конвертер температуры")
        println("3 - Конвертер расстояние")
        println("4 - История конвертаций")
        print("Выберите необходимый конвертер: ")
        when (readln()) {
            "1" -> Currency().converterCurrency()
            "2" -> Temperature().converterTemperature()
            "3" -> Distance().convertDistance()
            "4" -> {
                val history = File("History").readText()
                println("\nИстория конвертаций:\n$history")
            }
            else -> {
                println("Неверное значение, попробуйсте снова")
                continue
            }
        }
        break
    }
}





