package distance

class PutDataDistance {
    fun distanceName() {
        println("1 -ml")
        println("2 -km")
        println("3 -ft")
    }

    fun inputDistanceName(): String {
        while (true) {
            print("Введите название исходной величины длины: ")
            return when (val inputDistanceName = readln()) {
                "ml" -> inputDistanceName
                "km" -> inputDistanceName
                "ft" -> inputDistanceName
                else -> {
                    println("Попробуйте снова")
                    continue
                }
            }
        }
    }

    fun inputDistanceValue(inputDistanceName: String): Double {
        while (true) {
            when (inputDistanceName) {
                "ml" -> {
                    print("Введите длину  в милях: ")
                    return readln().toDoubleOrNull() ?: continue
                }

                "km" -> {
                    print("Введите длину в киллометрах: ")
                    return readln().toDoubleOrNull() ?: continue
                }

                "ft" -> {
                    print("Введите длину в футах: ")
                    return readln().toDoubleOrNull() ?: continue
                }

                else -> {
                    println("Неверный ввод")
                    continue
                }
            }
        }
    }

    fun outputDistanceName(): String {
        while (true) {
            print("Введите название конечной величины длины: ")
            return when (val outputDistanceName = readln()) {
                "ml" -> outputDistanceName
                "km" -> outputDistanceName
                "ft" -> outputDistanceName
                else -> {
                    println("Попробуйте снова")
                    continue
                }
            }
        }
    }

    fun distanceConversion(inputDistanceName: String, inputDistanceValue: Double, outputDistanceName: String): Double {
        val distanceData = DataDistance
        val resultDistanceConversion: Double = when {
            inputDistanceName == "ml" && outputDistanceName == "ml" -> inputDistanceValue
            inputDistanceName == "ml" && outputDistanceName == "km" -> inputDistanceValue * distanceData.mltoklm
            inputDistanceName == "ml" && outputDistanceName == "ft" -> inputDistanceValue * distanceData.mltofeet
            inputDistanceName == "km" && outputDistanceName == "ml" -> inputDistanceValue * distanceData.klmtoml
            inputDistanceName == "km" && outputDistanceName == "km" -> inputDistanceValue
            inputDistanceName == "km" && outputDistanceName == "ft" -> inputDistanceValue * distanceData.klmtofeet
            inputDistanceName == "ft" && outputDistanceName == "ml" -> inputDistanceValue * distanceData.feettoml
            inputDistanceName == "ft" && outputDistanceName == "km" -> inputDistanceValue * distanceData.feettoklm
            inputDistanceName == "ft" && outputDistanceName == "ft" -> inputDistanceValue
            else -> {
                0.0
            }
        }
        return resultDistanceConversion
    }
}






