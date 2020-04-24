package jonnyb.example.codeswag.services

import jonnyb.example.codeswag.models.Category
import jonnyb.example.codeswag.models.Product

object DataService {
    val categories = listOf<Category>(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage" )
    )

    val hats = listOf<Product>(
        Product("Develops hoodie Gray","$38","hat1"),
        Product("Develops hoodie Red","$24","hat2"),
        Product("Develops White Gray","$21","hat3"),
        Product("Develops Black Hoodie","$19","hat4"))

    val hoodies = listOf<Product>(
        Product("Develops Graphic Beanie","$18","hoodie1"),
        Product("Develops Hat Black","$20","hoodie2"),
        Product("Develops Hat White","$28","hoodie3"),
        Product("Develops SnapBack","$12","hoodie4"))

    val shirts = listOf<Product>(
        Product("Develops Shirt Black","$31","shirt1"),
        Product("Develops Badge Light Gray","$27","shirt2"),
        Product("Develops Logo Red","$23","shirt3"),
        Product("Develops Hustle","$16","shirt4"),
        Product("KickFlip Studios","$15","shirt5"))


    fun getProducts(category : Category) : List<Product>{

        return when(category!!.title){
            "SHIRTS" -> shirts
            "HOODIES" -> hoodies
            "HATS" -> hats
            else -> listOf()
        }
    }
}