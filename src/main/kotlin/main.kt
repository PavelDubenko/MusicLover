fun main() {
    val purchaseAmount = 11_000 // сумма покупки
    var discount = if (purchaseAmount < 1001) 0 else if (purchaseAmount < 10001) 100 else (purchaseAmount * 5 / 100) // скидка
    val isRegularCustomer = true // является ли постоянным покупателем

     if (isRegularCustomer) {
        discount += (discount * 0.01).toInt()
    }

    val finalAmount = purchaseAmount - discount
    println("Сумма покупки: $purchaseAmount руб.")
    println("Скидка: $discount руб.")
    println("Итого к оплате: $finalAmount руб.")
}