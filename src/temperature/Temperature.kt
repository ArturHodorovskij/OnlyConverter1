package temperature

import java.io.File

class Temperature {
    fun converterTemperature() {
        val putDataTemp = PutDataTemp()
        putDataTemp.tempName()
        val inputTempName = putDataTemp.inputTempName()
        val putTempValue = putDataTemp.inputTempValue(inputTempName)
        val outputTempName = putDataTemp.outputTempName()
        val resultTemperature = putDataTemp.tempConversion(inputTempName, putTempValue, outputTempName)
        println("Полученное значение температуры: $resultTemperature")
        val logEntry = "$inputTempName $putTempValue  -> $resultTemperature $outputTempName\n"
        File("History").appendText(logEntry)
    }
}

