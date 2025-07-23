app/src/main/java/com/chea/myshopapp/ProductAdapter.kt
import android.widget.Button
inner class ProductViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val productNameText: TextView = view.findViewById(R.id.productName)
    val productPriceText: TextView = view.findViewById(R.id.productPrice
holder.addToCartButton.setOnClickListener {
    val existingItem = CartActivity.cartItems.find { it.product == product }
    if (existingItem != null) {
        existingItem.quantity += 1
    } else {
        CartActivity.cartItems.add(CartItem(product))
    }
}                                            holder.addToCartButton.setOnClickListener {
    val existingItem = CartActivity.cartItems.find { it.product == product }
    if (existingItem != null) {
        existingItem.quantity += 1
    } else {
        CartActivity.cartItems.add(CartItem(product))
    }
                                            }           
    val addToCartButton: Button = view.findViewById(R.id.addToCartButton)
}
