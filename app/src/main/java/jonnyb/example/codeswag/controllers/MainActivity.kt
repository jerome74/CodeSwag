package jonnyb.example.codeswag.controllers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import jonnyb.example.codeswag.R
import jonnyb.example.codeswag.adapters.CategoryAdapter
import jonnyb.example.codeswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        adapter = CategoryAdapter(this,DataService.categories)
        categoryListView.adapter = adapter

    }
}
