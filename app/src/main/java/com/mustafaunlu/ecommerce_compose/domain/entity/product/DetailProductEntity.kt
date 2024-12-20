package com.mustafaunlu.ecommerce_compose.domain.entity.product

data class DetailProductEntity(
    val id: Int,
    val title: String,
    val description: String,
    val price: Double,
    val imageUrl: List<String>,
    val rating: String,
)
