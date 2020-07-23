package com.aperezsi.emptyfridge.domain.usecase

import com.aperezsi.emptyfridge.data.remote.implementation.Grocery
import com.aperezsi.emptyfridge.domain.repository.ShoppingListRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetShoppingList @Inject constructor(private val shoppingListRepository: ShoppingListRepository) {

    fun invoke(): Flow<List<Grocery>> {
        return shoppingListRepository.getShoppingList()
    }

}