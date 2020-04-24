package jonnyb.example.codeswag.controllers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import jonnyb.example.codeswag.R
import jonnyb.example.codeswag.adapters.ProductRecycleAdapter
import jonnyb.example.codeswag.models.Category
import jonnyb.example.codeswag.services.DataService
import jonnyb.example.codeswag.utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {

    lateinit var adapter : ProductRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val category : Category = intent.getParcelableExtra(EXTRA_CATEGORY)

        adapter = ProductRecycleAdapter(this,DataService.getProducts(category))

        productListView.adapter = adapter

        val linearLayout : GridLayoutManager = GridLayoutManager(this,2)
        productListView.layoutManager = linearLayout

        productListView.setHasFixedSize(true)



    }
}

