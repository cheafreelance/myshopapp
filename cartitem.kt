package com.chea.myshopapp

data class CartItem(
    val product: Product,
    var quantity: Int = 1
)
