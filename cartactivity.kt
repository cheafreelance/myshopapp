package com.chea.myshopapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CartActivity : AppCompatActivity() {

    companion object {
        val cartItems = mutableListOf<CartItem>()
    }

    private lateinit var cartRecyclerView: RecyclerView
    private lateinit var cartAdapter: CartAdapter
    private lateinit var totalTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        cartRecyclerView = findViewById(R.id.cartRecyclerView)
        totalTextView = findViewById(R.id.totalPriceTextView)

        cartRecyclerView.layoutManager = LinearLayoutManager(this)
        cartAdapter = CartAdapter(cartItems)
        cartRecyclerView.adapter = cartAdapter

        updateTotal()
    }

    private fun updateTotal() {
        val total = cartItems.sumOf { it.product.price * it.quantity }
        totalTextView.text = "Total: $${"%.2f".format(total)}"
    }
}
