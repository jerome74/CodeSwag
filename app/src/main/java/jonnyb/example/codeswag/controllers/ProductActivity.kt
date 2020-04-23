package jonnyb.example.codeswag.controllers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import jonnyb.example.codeswag.R
import jonnyb.example.codeswag.models.Category
import jonnyb.example.codeswag.utilities.EXTRA_CATEGORY

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val category : Category = intent.getParcelableExtra(EXTRA_CATEGORY)

        Toast.makeText(this,"ARTICOLO : ${category.title}", Toast.LENGTH_LONG).show()
    }
}
