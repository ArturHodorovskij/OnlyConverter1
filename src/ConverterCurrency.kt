fun converterCurrency() {
    val putDataCurrency = PutDataCurrency()
    putDataCurrency.currencyName()
    val inputCurrencyName = putDataCurrency.inputCurrencyName()
    val inputSum = putDataCurrency.inputSum(inputCurrencyName)
    val outputCurrency = putDataCurrency.outputCurrencyName()
    println("Ваша сумма ${putDataCurrency.exchanger(inputCurrencyName, inputSum, outputCurrency)}")
}