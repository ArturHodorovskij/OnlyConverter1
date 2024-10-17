fun convertDistance() {
    val putDataDistance = PutDataDistance()
    putDataDistance.distanceName()
    val putDistanceName = putDataDistance.inputDistanceName()
    val putDistanceValue = putDataDistance.inputDistanceValue(putDistanceName)
    val outputDistanceValue = putDataDistance.outputDistanceName()

    println("Полученное значение длины: ${putDataDistance.distanceConversion(putDistanceName, putDistanceValue, outputDistanceValue)}")


}