fun main() {
    while (true) {
        println("1 - Конвертер валют")
        println("2 - Конвертер температуры")
        println("3 - Конвертер расстояние")
        print("Выберите необходимый конвертер: ")
        when (readln()) {
            "1" -> converterCurrency()
            "2" -> converterTemperature()
            "3" -> convertDistance()
            else -> {
                println("Неверное значение, попробуйсте снова")
                continue
            }
        }
        break
    }
}





