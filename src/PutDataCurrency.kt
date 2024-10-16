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

    fun outputCurrency(): Int {
        while (true) {
            print("Выберет валюту на которую хотите обменять: ")
            val outputC = readln().toIntOrNull() ?: continue
            if (outputC in 1..5) {
                return outputC
            } else continue
        }
    }

    fun exchanger(inputCurN: Int, inputS: Double, outputCurN: Int): Double {

        val rate = ExchangeRate()
        val resultExchange: Double = when {
            inputCurN == 1 && outputCurN == 1 -> inputS
            inputCurN == 1 && outputCurN == 2 -> inputS * rate.blrtoeur
            inputCurN == 1 && outputCurN == 3 -> inputS * rate.blrtousd
            inputCurN == 1 && outputCurN == 4 -> inputS * rate.blrtopln
            inputCurN == 1 && outputCurN == 5 -> inputS * rate.blrtorub
            inputCurN == 2 && outputCurN == 1 -> inputS * rate.eurtoblr
            inputCurN == 2 && outputCurN == 2 -> inputS
            inputCurN == 2 && outputCurN == 3 -> inputS * rate.eurtousd
            inputCurN == 2 && outputCurN == 4 -> inputS * rate.eurtopln
            inputCurN == 2 && outputCurN == 5 -> inputS * rate.eurtorub
            inputCurN == 3 && outputCurN == 1 -> inputS * rate.usdtoblr
            inputCurN == 3 && outputCurN == 2 -> inputS * rate.usdtoeur
            inputCurN == 3 && outputCurN == 3 -> inputS
            inputCurN == 3 && outputCurN == 4 -> inputS * rate.usdtopln
            inputCurN == 3 && outputCurN == 5 -> inputS * rate.usdtorub
            inputCurN == 4 && outputCurN == 1 -> inputS * rate.plntoblr
            inputCurN == 4 && outputCurN == 2 -> inputS * rate.plntoeur
            inputCurN == 4 && outputCurN == 3 -> inputS * rate.plntousd
            inputCurN == 4 && outputCurN == 4 -> inputS
            inputCurN == 4 && outputCurN == 5 -> inputS * rate.plntorub
            inputCurN == 5 && outputCurN == 1 -> inputS * rate.rubtoblr
            inputCurN == 5 && outputCurN == 2 -> inputS * rate.rubtoeur
            inputCurN == 5 && outputCurN == 3 -> inputS * rate.rubtousd
            inputCurN == 5 && outputCurN == 4 -> inputS * rate.rubtopln
            inputCurN == 5 && outputCurN == 5 -> inputS
            else -> {
                0.0
            }
        }
        return resultExchange
    }
}
