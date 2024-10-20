package currency

class PutDataCurrency {
    fun currencyName() {
        println("1 -BLR")
        println("2 -EUR")
        println("3 -USD")
        println("4 -PLN")
        println("5 -RUB")
    }

    fun inputCurrencyName(): Int {
        while (true) {
            print("Выберет валюту которую хотите обменять: ")
            val inputCurN = readln().toIntOrNull() ?: continue
            if (inputCurN in 1..5) {
                return inputCurN
            } else continue
        }
    }

    fun inputSum(inputCurN: Int): Double {
        while (true) {
            when (inputCurN) {
                1 -> {
                    print("Введите сумму  BLR: ")
                    return readln().toDoubleOrNull() ?: continue
                }

                2 -> {
                    print("Введите сумму  EUR: ")
                    return readln().toDoubleOrNull() ?: continue
                }

                3 -> {
                    print("Введите сумму  USD: ")
                    return readln().toDoubleOrNull() ?: continue
                }

                4 -> {
                    print("Введите сумму  PLN: ")
                    return readln().toDoubleOrNull() ?: continue
                }

                5 -> {
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

    fun outputCurrencyName(): Int {
        while (true) {
            print("Выберет валюту на которую хотите обменять: ")
            val outputC = readln().toIntOrNull() ?: continue
            if (outputC in 1..5) {
                return outputC
            } else continue
        }
    }

    fun exchanger(inputCurrencyName: Int, inputSum: Double, outputCurrencyName: Int): Double {
        val rate = ExchangeRate
        val resultExchange: Double = when {
            inputCurrencyName == 1 && outputCurrencyName == 1 -> inputSum
            inputCurrencyName == 1 && outputCurrencyName == 2 -> inputSum * rate.blrtoeur
            inputCurrencyName == 1 && outputCurrencyName == 3 -> inputSum * rate.blrtousd
            inputCurrencyName == 1 && outputCurrencyName == 4 -> inputSum * rate.blrtopln
            inputCurrencyName == 1 && outputCurrencyName == 5 -> inputSum * rate.blrtorub
            inputCurrencyName == 2 && outputCurrencyName == 1 -> inputSum * rate.eurtoblr
            inputCurrencyName == 2 && outputCurrencyName == 2 -> inputSum
            inputCurrencyName == 2 && outputCurrencyName == 3 -> inputSum * rate.eurtousd
            inputCurrencyName == 2 && outputCurrencyName == 4 -> inputSum * rate.eurtopln
            inputCurrencyName == 2 && outputCurrencyName == 5 -> inputSum * rate.eurtorub
            inputCurrencyName == 3 && outputCurrencyName == 1 -> inputSum * rate.usdtoblr
            inputCurrencyName == 3 && outputCurrencyName == 2 -> inputSum * rate.usdtoeur
            inputCurrencyName == 3 && outputCurrencyName == 3 -> inputSum
            inputCurrencyName == 3 && outputCurrencyName == 4 -> inputSum * rate.usdtopln
            inputCurrencyName == 3 && outputCurrencyName == 5 -> inputSum * rate.usdtorub
            inputCurrencyName == 4 && outputCurrencyName == 1 -> inputSum * rate.plntoblr
            inputCurrencyName == 4 && outputCurrencyName == 2 -> inputSum * rate.plntoeur
            inputCurrencyName == 4 && outputCurrencyName == 3 -> inputSum * rate.plntousd
            inputCurrencyName == 4 && outputCurrencyName == 4 -> inputSum
            inputCurrencyName == 4 && outputCurrencyName == 5 -> inputSum * rate.plntorub
            inputCurrencyName == 5 && outputCurrencyName == 1 -> inputSum * rate.rubtoblr
            inputCurrencyName == 5 && outputCurrencyName == 2 -> inputSum * rate.rubtoeur
            inputCurrencyName == 5 && outputCurrencyName == 3 -> inputSum * rate.rubtousd
            inputCurrencyName == 5 && outputCurrencyName == 4 -> inputSum * rate.rubtopln
            inputCurrencyName == 5 && outputCurrencyName == 5 -> inputSum
            else -> {
                0.0
            }
        }
        return resultExchange
    }
}
