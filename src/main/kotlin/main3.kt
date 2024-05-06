import kotlin.math.roundToInt

fun main() {
    val amount = 100
    val monthlyBuy = 2 // те, кто покупает ежемесячно, более 1 месяца - постоянники
    val discount1 = 100
    val discount2 = 0.95
    val discountBuy = 0.99

    var totalPrice1 = amount - discount1
    var totalPrice2 = amount * discount2

    if (amount >= 1_001 && amount <= 10_000 && monthlyBuy <= 1) {
        println(
            "Стоимость покупки с учётом скидки составляет: $totalPrice1 руб." +
                    "\nСкидка составляет: 100 руб."
        )
    } else if (amount >= 1_001 && amount <= 10_000 && monthlyBuy >= 2) {
        println(
            "Стоимость покупки с учётом скидок составляет:" +
                    " ${(totalPrice1 * discountBuy)} руб." +
                    "\nСкидка составляет: 100 руб. и как постоянному покупателю + 1%"
        )
    } else if (amount >= 10_001 && monthlyBuy <= 1) {
        println(
            "Стоимость покупки с учётом скидки составляет: " +
                    "${(totalPrice2 * 100.0).roundToInt() / 100.0} руб." +
                    "\nСкидка составляет: 5%"
        )
    } else if (amount >= 10_001 && monthlyBuy >= 2) {
        println(
            "Стоимость покупки с учётом скидок составляет:" +
                    " ${((totalPrice2 * 100.0).roundToInt() / 100.0) * discountBuy} руб." +
                    "\nСкидка составляет: 5% и как постоянному покупателю + 1%"
        )
    } else if (amount <= 1_000 && monthlyBuy <= 1) {
        println(
            "Стоимость покупки составляет: $amount руб." +
                    "\nУсловия акции не соблюдены, скидка не предоставляется."
        )
    } else if (amount <= 1_000 && monthlyBuy >= 2) {
        println(
            "Стоимость покупки составляет: ${amount * discountBuy} руб." +
                    "\nСкидка составляет: 1% и как постоянному покупателю."
        )
    }
}