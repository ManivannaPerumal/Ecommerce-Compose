package com.mustafaunlu.ecommerce_compose.ui.uiData

data class ProductUiData(
    val id: Int,
    val title: String,
    val description: String,
    val price: Double,
    val imageUrl: String,
    val rating: Double,
)

data class Categorty(
    val slug : String ,
    val name : String ,
    val url : String ,
)