fun converterTemperature() {
    val putDataTemp = PutDataTemp()
    putDataTemp.tempName()
    val putTempName = putDataTemp.inputTempName()
    val putTempValue = putDataTemp.inputTempValue(putTempName)
    val outputTempValue = putDataTemp.outputTempName()
    println("Полученное значение температуры: ${putDataTemp.tempConversion(putTempName, putTempValue, outputTempValue)}")
}

