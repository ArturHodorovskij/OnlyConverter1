package distance

class PutDataDistance {
    fun distanceName() {
        println("1 -Мили")
        println("2 -Киллометры")
        println("3 -Футы")

    }

    fun inputDistanceName(): Int {
        while (true) {
            print("Выберет меру длины котрую хотите конвертировать : ")
            val inputDistanceName = readln().toIntOrNull() ?: continue
            if (inputDistanceName in 1..3) {
                return inputDistanceName
            } else continue
        }
    }

    fun inputDistanceValue(inputDistanceName: Int): Double {
        while (true) {
            when (inputDistanceName) {
                1 -> {
                    print("Введите длину  в милях: ")
                    return readln().toDoubleOrNull() ?: continue
                }

                2 -> {
                    print("Введите длину в киллометрах: ")
                    return readln().toDoubleOrNull() ?: continue
                }

                3 -> {
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

    fun outputDistanceName(): Int {
        while (true) {
            print("Выберет меру длины на котрую хотите конвертировать: ")
            val outputDistanceName = readln().toIntOrNull() ?: continue
            if (outputDistanceName in 1..3) {
                return outputDistanceName
            } else continue
        }
    }

    fun distanceConversion(inputDistanceName: Int, inputDistanceValue: Double, outputDistanceName: Int): Double {
        val distanceData = DataDistance
        val resultDistanceConversion: Double = when {
            inputDistanceName == 1 && outputDistanceName == 1 -> inputDistanceValue
            inputDistanceName == 1 && outputDistanceName == 2 -> inputDistanceValue * distanceData.mltoklm
            inputDistanceName == 1 && outputDistanceName == 3 -> inputDistanceValue * distanceData.mltofeet
            inputDistanceName == 2 && outputDistanceName == 1 -> inputDistanceValue * distanceData.klmtoml
            inputDistanceName == 2 && outputDistanceName == 2 -> inputDistanceValue
            inputDistanceName == 2 && outputDistanceName == 3 -> inputDistanceValue * distanceData.klmtofeet
            inputDistanceName == 3 && outputDistanceName == 1 -> inputDistanceValue * distanceData.feettoml
            inputDistanceName == 3 && outputDistanceName == 2 -> inputDistanceValue * distanceData.feettoklm
            inputDistanceName == 3 && outputDistanceName == 3 -> inputDistanceValue
            else -> {
                0.0
            }
        }
        return resultDistanceConversion
    }
}

