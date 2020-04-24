package jonnyb.example.codeswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import jonnyb.example.codeswag.R
import jonnyb.example.codeswag.models.Category
import jonnyb.example.codeswag.models.Product

class ProductRecycleAdapter(val context : Context, val products : List<Product>) :  RecyclerView.Adapter<ProductRecycleAdapter.Holder>() {

    inner class Holder (itemView: View?) : RecyclerView.ViewHolder(itemView!!)
    {
        val productTitleTxt = itemView?.findViewById<TextView>(R.id.productTitleTxt)
        val productPriceTxt = itemView?.findViewById<TextView>(R.id.productPriceTxt)
        val productImg = itemView?.findViewById<ImageView>(R.id.productImg)

        fun bindProduct(product: Product, context: Context)
        {
            val resourceId = context.resources.getIdentifier(product.image
                , "drawable"
                , context.packageName)

            productTitleTxt?.text = product.title
            productPriceTxt?.text = product.price
            productImg?.setImageResource(resourceId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_list_item,parent,false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindProduct(products[position], context)
    }

}