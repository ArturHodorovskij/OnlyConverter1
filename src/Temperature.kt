fun converterTemperature() {
    while (true) {
        print("Введите температуру в градусах цельсия: ")
        val readTemp = readln().toDoubleOrNull() ?: continue
        val fahrenheit = readTemp * 1.8 + 32
        val kelvin = readTemp + 273.15
        println("Температура в фарингейтах: $fahrenheit")
        println("Температура в кельвинах: $kelvin")
        break
    }
}