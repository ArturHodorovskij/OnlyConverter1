package currency
import java.io.File

class Currency {
    fun converterCurrency() {
        val putDataCurrency = PutDataCurrency()
        putDataCurrency.currencyName()
        val inputCurrencyName = putDataCurrency.inputCurrencyName()
        val inputSum = putDataCurrency.inputSum(inputCurrencyName)
        val outputCurrencyName = putDataCurrency.outputCurrencyName()
        val resultExchange = putDataCurrency.exchanger(inputCurrencyName, inputSum, outputCurrencyName)
        println("Ваша сумма $resultExchange")
        val logEntry = "$inputSum $inputCurrencyName  -> $resultExchange $outputCurrencyName\n"
        File("History").appendText(logEntry)
    }
}
