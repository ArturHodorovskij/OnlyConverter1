@Suppress("IMPLICIT_CAST_TO_ANY") // ЭТО ЧЁ ТАКОЕ???
class PutSomething {
    fun currencyName(){
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

    fun inputSumm(inputCurN: Int): Double {
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

                else -> { println("Неверный ввод")
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
    fun exchanger(inputCurN: Int,inputS: Double,outputCurN: Int):Double {

        val rate = ExchangeRate()
        var govnoed = when (inputCurN and outputCurN) {
            1 and 1 -> inputS
            1 and 2 -> inputS * rate.blrtoeur
            1 and 3 -> inputS * rate.blrtousd
            1 and 4 -> inputS * rate.blrtopln
            1 and 5 -> inputS * rate.blrtorub
            2 and 1 -> inputS * rate.eurtoblr
            2 and 2 -> inputS
            2 and 3 -> inputS * rate.eurtousd
            2 and 4 -> inputS * rate.eurtopln
            2 and 5 -> inputS * rate.eurtorub
            3 and 1 -> inputS * rate.usdtoblr
            3 and 2 -> inputS * rate.usdtoeur
            3 and 3 -> inputS
            3 and 4 -> inputS * rate.usdtopln
            3 and 5 -> inputS * rate.usdtorub
            4 and 1 -> inputS * rate.plntoblr
            4 and 2 -> inputS * rate.plntoeur
            4 and 3 -> inputS * rate.plntousd
            4 and 4 -> inputS
            4 and 5 -> inputS * rate.plntorub
            5 and 1 -> inputS * rate.rubtoblr
            5 and 2 -> inputS * rate.rubtoeur
            5 and 3 -> inputS * rate.rubtousd
            5 and 4 -> inputS * rate.rubtopln
            5 and 5 -> inputS


            else -> {}
        }
        return govnoed as Double

    }

}
