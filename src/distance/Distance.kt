package distance

import java.io.File

class Distance {
    fun convertDistance() {
        val putDataDistance = PutDataDistance()
        putDataDistance.distanceName()
        val putDistanceName = putDataDistance.inputDistanceName()
        val putDistanceValue = putDataDistance.inputDistanceValue(putDistanceName)
        val outputDistanceName = putDataDistance.outputDistanceName()
        val distanceResult = putDataDistance.distanceConversion(putDistanceName, putDistanceValue, outputDistanceName)
        println("Полученное значение длины: $distanceResult")
        val logEntry = "$putDistanceName $putDistanceValue  -> $distanceResult $outputDistanceName\n"
        File("History").appendText(logEntry)
    }
}