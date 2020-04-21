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
        Product("Develops hoodie Gray","$38","hat01"),
        Product("Develops hoodie Red","$24","hat02"),
        Product("Develops White Gray","$21","hat03"),
        Product("Develops Black Hoodie","$19","hat04"))

    val hoodies = listOf<Product>(
        Product("Develops Graphic Beanie","$18","hoodie01"),
        Product("Develops Hat Black","$20","hoodie02"),
        Product("Develops Hat White","$28","hoodie03"),
        Product("Develops SnapBack","$12","hoodie04"))

    val shirts = listOf<Product>(
        Product("Develops Shirt Black","$31","shirt01"),
        Product("Develops Badge Light Gray","$27","shirt02"),
        Product("Develops Logo Red","$23","shirt03"),
        Product("Develops Hustle","$16","shirt04"),
        Product("KickFlip Studios","$15","shirt05"))
}