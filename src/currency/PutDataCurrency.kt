package currency

class PutDataCurrency {
    fun currencyName() {
        println("1 -BLR")
        println("2 -EUR")
        println("3 -USD")
        println("4 -PLN")
        println("5 -RUB")
    }

    fun inputCurrencyName(): String {
        while (true) {
            print("Введите название валюты:  ")
            return when (val inputCurrencyName = readln()) {
                "BLR" -> inputCurrencyName
                "EUR" -> inputCurrencyName
                "USD" -> inputCurrencyName
                "PLN" -> inputCurrencyName
                "RUB" -> inputCurrencyName
                else -> {
                    println("Попробуйте снова")
                    continue
                }
            }
        }
    }

    fun inputSum(inputCurrencyName: String): Double {
        while (true) {
            when (inputCurrencyName) {
                "BLR" -> {
                    print("Введите сумму  BLR: ")
                    return readln().toDoubleOrNull() ?: continue
                }

                "EUR" -> {
                    print("Введите сумму  EUR: ")
                    return readln().toDoubleOrNull() ?: continue
                }

                "USD" -> {
                    print("Введите сумму  USD: ")
                    return readln().toDoubleOrNull() ?: continue
                }

                "PLN" -> {
                    print("Введите сумму  PLN: ")
                    return readln().toDoubleOrNull() ?: continue
                }

                "RUB" -> {
                    print("Введите сумму  RUB: ")
                    return readln().toDoubleOrNull() ?: continue
                }

                else -> {
                    println("Неверный ввод")
                    continue
                }
            }
        }
    }

    fun outputCurrencyName(): String {
        while (true) {
            print("Выберете название валюты на которую хотите обменять: ")
            return when (val outputCurrencyName = readln()) {
                "BLR" -> outputCurrencyName
                "EUR" -> outputCurrencyName
                "USD" -> outputCurrencyName
                "PLN" -> outputCurrencyName
                "RUB" -> outputCurrencyName
                else -> {
                    println("Попробуйте снова")
                    continue
                }
            }
        }
    }

    fun exchanger(inputCurrencyName: String, inputSum: Double, outputCurrencyName: String): Double {
        val rate = ExchangeRate
        val resultExchange: Double = when {
            inputCurrencyName == "BLR" && outputCurrencyName == "BLR" -> inputSum
            inputCurrencyName == "BLR" && outputCurrencyName == "EUR" -> inputSum * rate.blrtoeur
            inputCurrencyName == "BLR" && outputCurrencyName == "USD" -> inputSum * rate.blrtousd
            inputCurrencyName == "BLR" && outputCurrencyName == "PLN" -> inputSum * rate.blrtopln
            inputCurrencyName == "BLR" && outputCurrencyName == "RUB" -> inputSum * rate.blrtorub
            inputCurrencyName == "EUR" && outputCurrencyName == "BLR" -> inputSum * rate.eurtoblr
            inputCurrencyName == "EUR" && outputCurrencyName == "EUR" -> inputSum
            inputCurrencyName == "EUR" && outputCurrencyName == "USD" -> inputSum * rate.eurtousd
            inputCurrencyName == "EUR" && outputCurrencyName == "PLN" -> inputSum * rate.eurtopln
            inputCurrencyName == "EUR" && outputCurrencyName == "RUB" -> inputSum * rate.eurtorub
            inputCurrencyName == "USD" && outputCurrencyName == "BLR" -> inputSum * rate.usdtoblr
            inputCurrencyName == "USD" && outputCurrencyName == "EUR" -> inputSum * rate.usdtoeur
            inputCurrencyName == "USD" && outputCurrencyName == "USD" -> inputSum
            inputCurrencyName == "USD" && outputCurrencyName == "PLN" -> inputSum * rate.usdtopln
            inputCurrencyName == "USD" && outputCurrencyName == "RUB" -> inputSum * rate.usdtorub
            inputCurrencyName == "PLN" && outputCurrencyName == "BLR" -> inputSum * rate.plntoblr
            inputCurrencyName == "PLN" && outputCurrencyName == "EUR" -> inputSum * rate.plntoeur
            inputCurrencyName == "PLN" && outputCurrencyName == "USD" -> inputSum * rate.plntousd
            inputCurrencyName == "PLN" && outputCurrencyName == "PLN" -> inputSum
            inputCurrencyName == "PLN" && outputCurrencyName == "RUB" -> inputSum * rate.plntorub
            inputCurrencyName == "RUB" && outputCurrencyName == "BLR" -> inputSum * rate.rubtoblr
            inputCurrencyName == "RUB" && outputCurrencyName == "EUR" -> inputSum * rate.rubtoeur
            inputCurrencyName == "RUB" && outputCurrencyName == "USD" -> inputSum * rate.rubtousd
            inputCurrencyName == "RUB" && outputCurrencyName == "PLN" -> inputSum * rate.rubtopln
            inputCurrencyName == "RUB" && outputCurrencyName == "RUB" -> inputSum
            else -> {
                0.0
            }
        }
        return resultExchange
    }
}



