package com.chea.myshopapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CartAdapter(private val items: List<CartItem>) :
    RecyclerView.Adapter<CartAdapter.CartViewHolder>() {

    inner class CartViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameText: TextView = view.findViewById(R.id.cartItemName)
        val quantityText: TextView = view.findViewById(R.id.cartItemQuantity)
        val priceText: TextView = view.findViewById(R.id.cartItemPrice)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_cart, parent, false)
        return CartViewHolder(view)
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        val item = items[position]
        holder.nameText.text = item.product.name
        holder.quantityText.text = "Qty: ${item.quantity}"
        holder.priceText.text = "$${"%.2f".format(item.product.price * item.quantity)}"
    }

    override fun getItemCount(): Int = items.size
    }
