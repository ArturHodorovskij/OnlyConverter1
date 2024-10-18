open class PutDataTemp {

    fun tempName() {
        println("1 -Градусы Цельсия")
        println("2 -Кельвины")
        println("3 -Фаренгейты")

    }

    fun inputTempName(): Int {
        while (true) {
            print("Выберет единицу температуры которую хотите конвертировать : ")
            val inputTempName = readln().toIntOrNull() ?: continue
            if (inputTempName in 1..3) {
                return inputTempName
            } else continue
        }
    }

    fun inputTempValue(putTempName: Int): Double {
        while (true) {
            when (putTempName) {
                1 -> {
                    print("Введите температуру в Градусах Цельсия: ")
                    return readln().toDoubleOrNull() ?: continue
                }

                2 -> {
                    print("Введите температуру в Кельвинах: ")
                    return readln().toDoubleOrNull() ?: continue
                }

                3 -> {
                    print("Введите температуру в Фаренгейтах: ")
                    return readln().toDoubleOrNull() ?: continue
                }

                else -> {
                    println("Неверный ввод")
                    continue
                }
            }
        }
    }

    fun outputTempName(): Int {
        while (true) {
            print("Выберет единицу температуры в которую хотите конвертировать: ")
            val outputTempName = readln().toIntOrNull() ?: continue
            if (outputTempName in 1..3) {
                return outputTempName
            } else continue
        }
    }

    fun tempConversion(inputTempName: Int, inputTempValue: Double, outputTempName: Int): Double {
        val tempData = DataTemp(inputTempValue)
        val resultTempConversion: Double = when {
            inputTempName == 1 && outputTempName == 1 -> inputTempValue
            inputTempName == 1 && outputTempName == 2 -> tempData.degrtokalv
            inputTempName == 1 && outputTempName == 3 -> tempData.degrtofar
            inputTempName == 2 && outputTempName == 1 -> tempData.kalvtodegr
            inputTempName == 2 && outputTempName == 2 -> inputTempValue
            inputTempName == 2 && outputTempName == 3 -> tempData.kalvtofar
            inputTempName == 3 && outputTempName == 1 -> tempData.fartodegr
            inputTempName == 3 && outputTempName == 2 -> tempData.fartokalv
            inputTempName == 3 && outputTempName == 3 -> inputTempValue
            else -> {
                0.0
            }
        }
        return resultTempConversion
    }
}

