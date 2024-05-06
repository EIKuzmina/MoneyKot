fun main() {
    val amount = 20000
    val percent = 100
    val hold = 0.75
    val minComission = 35
    val commission = (amount * hold) / percent
    if (commission > minComission) {
        println("$commission руб.")
    } else if (commission < minComission) {
        println("$minComission руб.")
    }
}