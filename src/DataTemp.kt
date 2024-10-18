class DataTemp(putTempName: Double) {
    val degrtodegr = putTempName
    val degrtokalv = (putTempName + 273.15)
    val degrtofar = (putTempName * 1.8 + 32)
    val kalvtodegr = (putTempName - 273.15)
    val kalvtokalv = putTempName
    val kalvtofar = ((putTempName - 273.15) * 1.8000 + 32.00)
    val fartodegr = ((putTempName - 32) / 1.8)
    val fartokalv = ((putTempName - 32) / 1.8 + 237.15)
    val fartofar = putTempName
}
