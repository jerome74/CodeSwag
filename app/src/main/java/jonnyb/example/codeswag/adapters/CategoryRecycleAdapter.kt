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
import kotlinx.android.synthetic.main.category_list_item.view.*

class CategoryRecycleAdapter(val context : Context, val categories : List<Category> ) : RecyclerView.Adapter<CategoryRecycleAdapter.Holder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.category_list_item,parent,false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindCategory(categories[position], context)
    }


    inner class Holder (itemView: View?) : RecyclerView.ViewHolder(itemView!!)
    {
        val categoryTxt = itemView?.findViewById<TextView>(R.id.categoryTxt)
        val categoryImg = itemView?.findViewById<ImageView>(R.id.categoryImg)

        fun bindCategory(category: Category, context: Context)
        {
            val resourceId = context.resources.getIdentifier(category.image
                , "drawable"
                , context.packageName)

            categoryTxt?.text = category.title
            categoryImg?.setImageResource(resourceId)
        }
    }
}