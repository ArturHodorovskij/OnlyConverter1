package temperature

open class PutDataTemp {

    fun tempName() {
        println("1 -C")
        println("2 -K")
        println("3 -F")
    }

    fun inputTempName(): String {
        while (true) {
            print("Введите название исходной температуры: ")
            return when (val inputTempName = readln()) {
                "C" -> inputTempName
                "K" -> inputTempName
                "F" -> inputTempName
                else -> {
                    println("Попробуйте снова")
                    continue
                }
            }
        }
    }

    fun inputTempValue(inputTempName: String): Double {
        while (true) {
            when (inputTempName) {
                "C" -> {
                    print("Введите температуру в Градусах Цельсия: ")
                    return readln().toDoubleOrNull() ?: continue
                }

                "K" -> {
                    print("Введите температуру в Кельвинах: ")
                    return readln().toDoubleOrNull() ?: continue
                }

                "F" -> {
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

    fun outputTempName(): String {
        while (true) {
            print("Введите название конечной температуры: ")
            return when (val outputTempName = readln()) {
                "C" -> outputTempName
                "K" -> outputTempName
                "F" -> outputTempName
                else -> {
                    println("Попробуйте снова")
                    continue
                }
            }
        }
    }

    fun tempConversion(inputTempName: String, inputTempValue: Double, outputTempName: String): Double {
        val tempData = DataTemp(inputTempValue)
        val resultTempConversion: Double = when {
            inputTempName == "C" && outputTempName == "C" -> inputTempValue
            inputTempName == "C" && outputTempName == "K" -> tempData.degrtokalv
            inputTempName == "C" && outputTempName == "F" -> tempData.degrtofar
            inputTempName == "K" && outputTempName == "C" -> tempData.kalvtodegr
            inputTempName == "K" && outputTempName == "K" -> inputTempValue
            inputTempName == "K" && outputTempName == "F" -> tempData.kalvtofar
            inputTempName == "F" && outputTempName == "C" -> tempData.fartodegr
            inputTempName == "F" && outputTempName == "K" -> tempData.fartokalv
            inputTempName == "F" && outputTempName == "F" -> inputTempValue
            else -> {
                0.0
            }
        }
        return resultTempConversion
    }
}

