package com.chea.myshopapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var productRecyclerView: RecyclerView
    private lateinit var productAdapter: ProductAdapter
    private lateinit var productList: List<Product>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        productRecyclerView = findViewById(R.id.productRecyclerView)
        productRecyclerView.layoutManager = LinearLayoutManager(this)

        productList = getSampleProducts()
        productAdapter = ProductAdapter(productList)
        productRecyclerView.adapter = productAdapter
    }

    private fun getSampleProducts(): List<Product> {
        return listOf(
            Product("T-Shirt", 9.99, R.mipmap.ic_launcher),
            Product("Jeans", 19.99, R.mipmap.ic_launcher),
            Product("Sneakers", 29.99, R.mipmap.ic_launcher),
            Product("Hat", 5.99, R.mipmap.ic_launcher)
        )
    }
}
