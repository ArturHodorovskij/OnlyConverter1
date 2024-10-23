package currency
import java.io.File

class Currency {
    fun converterCurrency() {
        val putDataCurrency = PutDataCurrency()
        putDataCurrency.currencyName()
        val inputCurrencyName = putDataCurrency.inputCurrencyName()
        val inputSum = putDataCurrency.inputSum(inputCurrencyName)
        val outputCurrency = putDataCurrency.outputCurrencyName()
        val exchang = putDataCurrency.exchanger(inputCurrencyName, inputSum, outputCurrency)
        println("Ваша сумма $exchang")
        val logEntry = "$inputSum $inputCurrencyName  -> $exchang $outputCurrency"
        File("History").appendText(logEntry)
    }
}