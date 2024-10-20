import currency.Currency
import distance.Distance
import temperature.Temperature


fun main() {
    while (true) {
        println("1 - Конвертер валют")
        println("2 - Конвертер температуры")
        println("3 - Конвертер расстояние")
        print("Выберите необходимый конвертер: ")
        when (readln()) {
            "1" -> Currency().converterCurrency()
            "2" -> Temperature().converterTemperature()
            "3" -> Distance().convertDistance()
            else -> {
                println("Неверное значение, попробуйсте снова")
                continue
            }
        }
        break
    }
}





