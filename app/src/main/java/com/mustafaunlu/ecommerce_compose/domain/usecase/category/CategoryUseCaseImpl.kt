package com.mustafaunlu.ecommerce_compose.domain.usecase.category

import com.mustafaunlu.ecommerce_compose.common.NetworkResponseState
import com.mustafaunlu.ecommerce_compose.domain.repository.RemoteRepository
import com.mustafaunlu.ecommerce_compose.ui.uiData.Categorty
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CategoryUseCaseImpl @Inject constructor(private val repository: RemoteRepository) :
    CategoryUseCase {
    override fun invoke(): Flow<NetworkResponseState<List<Categorty>>> {
        return repository.getAllCategoriesListFromApi()
    }
}
