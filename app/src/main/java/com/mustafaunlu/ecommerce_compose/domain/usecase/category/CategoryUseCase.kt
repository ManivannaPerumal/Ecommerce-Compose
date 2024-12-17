package com.mustafaunlu.ecommerce_compose.domain.usecase.category

import com.mustafaunlu.ecommerce_compose.common.NetworkResponseState
import com.mustafaunlu.ecommerce_compose.ui.uiData.Categorty
import kotlinx.coroutines.flow.Flow

interface CategoryUseCase {
    operator fun invoke(): Flow<NetworkResponseState<List<Categorty>>>
}
