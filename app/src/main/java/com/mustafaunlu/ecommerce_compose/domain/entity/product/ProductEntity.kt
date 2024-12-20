package com.mustafaunlu.ecommerce_compose.domain.entity.product

data class ProductEntity(
    val id: Int,
    val title: String,
    val description: String,
    val price: Double,
    val imageUrl: String,
    val rating: Double,
)
