package jonnyb.example.codeswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import jonnyb.example.codeswag.R
import jonnyb.example.codeswag.models.Category
import jonnyb.example.codeswag.views.CategoryHolderView

class CategoryAdapter(context : Context, categories : List<Category>) : BaseAdapter() {

    var context : Context? = null
    var categories : List<Category>? = null

    init {
        this.context = context
        this.categories = categories
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val categoryHolderView : CategoryHolderView
        val categoryView : View


        if(convertView == null) {

            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)

            categoryHolderView = CategoryHolderView(categoryView.findViewById<TextView>(R.id.categoryTxt),
                                                    categoryView.findViewById<ImageView>(R.id.categoryImg))

            categoryView.tag = categoryHolderView
        }
        else
        {
            categoryHolderView = convertView.tag as CategoryHolderView
            categoryView = convertView
        }

        val resource = context!!.resources.getIdentifier(categories!![position].image
            , "drawable", context!!.packageName )


        categoryHolderView.categoryTxt.text = categories!![position].title
        categoryHolderView.categoryImg.setImageResource(resource)

        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories!![position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories!!.count()
    }
}