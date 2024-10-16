fun convertDistance() {
    while (true) {
        print("Введи расстояние в киломметрах: ")
        val readDistance = readln().toDoubleOrNull() ?: continue
        val millage = readDistance * 0.62
        val feet = readDistance * 3280.84
        println("Расстояние в милях: $millage")
        println("Расстояние в футах: $feet")
        break
    }
}