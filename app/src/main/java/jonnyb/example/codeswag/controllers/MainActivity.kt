package jonnyb.example.codeswag.controllers

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
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        adapter = CategoryRecycleAdapter(this,DataService.categories)

        categoryListView.adapter = adapter

        val linearLayout : LinearLayoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = linearLayout

        categoryListView.setHasFixedSize(true)

    }


}
