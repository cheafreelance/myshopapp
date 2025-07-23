app/src/main/java/com/chea/myshopapp/ProductAdapter.kt
import android.widget.Button
inner class ProductViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val productNameText: TextView = view.findViewById(R.id.productName)
    val productPriceText: TextView = view.findViewById(R.id.productPrice)
    val addToCartButton: Button = view.findViewById(R.id.addToCartButton)
}
