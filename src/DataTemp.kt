private val putDataTemp = PutDataTemp()
private val putTempName = putDataTemp.inputTempName()
private val putTempValue = putDataTemp.inputTempValue(putTempName)

class DataTemp {

    val degrtodegr = putTempValue
    val degrtokalv = (putTempValue+273.15)
    val degrtofar = (putTempValue*1.8 + 32)
    val kalvtodegr = (putTempValue-273.15)
    val kalvtokalv = putTempValue
    val kalvtofar = ((putTempValue - 273.15)* 1.8000+ 32.00)
    val fartodegr = ((putTempValue - 32)/1.8)
    val fartokalv = ((putTempValue-32)/1.8+237.15)
    val fartofar = putTempValue

}
// 1-градусы цельсия 2- кельвины 3-фарингейты