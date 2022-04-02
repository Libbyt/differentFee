val cardType = "MasterCard"
var comission = 0.0
var payment = 75500.0 * 100
var monthlyTotal = 75500.0 * 100

fun addToMonthly() {
    monthlyTotal += payment
}

fun main() {
    when (cardType) {
        "Vk Pay" -> comission
        "Maestro", "MasterCard" -> comission = if (monthlyTotal > 75000_00) payment * 0.006 + 20 else comission
        "Visa" -> comission = if (payment * 0.006 < 35) 35.0 else payment * 0.06
    }
    println("Ваша комиссия - $comission копеек")
}

