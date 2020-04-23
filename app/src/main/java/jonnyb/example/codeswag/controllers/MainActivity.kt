package jonnyb.example.codeswag.controllers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import jonnyb.example.codeswag.R
import jonnyb.example.codeswag.adapters.CategoryAdapter
import jonnyb.example.codeswag.adapters.CategoryRecycleAdapter
import jonnyb.example.codeswag.services.DataService
import jonnyb.example.codeswag.utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        adapter = CategoryRecycleAdapter(this,DataService.categories, itemClick = {
           val localIntent : Intent = Intent(this,ProductActivity::class.java)
            localIntent.putExtra(EXTRA_CATEGORY,it)
            startActivity(localIntent)
        } )

        categoryListView.adapter = adapter

        val linearLayout : LinearLayoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = linearLayout

        categoryListView.setHasFixedSize(true)

    }


}
