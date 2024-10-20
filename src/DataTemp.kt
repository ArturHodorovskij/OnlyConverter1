class DataTemp(inputTempValue: Double) {
    val degrtodegr = inputTempValue
    val degrtokalv = (inputTempValue + 273.15)
    val degrtofar = (inputTempValue * 1.8 + 32)
    val kalvtodegr = (inputTempValue - 273.15)
    val kalvtokalv = inputTempValue
    val kalvtofar = ((inputTempValue - 273.15) * 1.8000 + 32.00)
    val fartodegr = ((inputTempValue - 32) / 1.8)
    val fartokalv = ((inputTempValue - 32) / 1.8 + 237.15)
    val fartofar = inputTempValue
}
