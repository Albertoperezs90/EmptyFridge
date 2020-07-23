package com.aperezsi.emptyfridge.domain.usecase

import com.aperezsi.emptyfridge.domain.repository.ShoppingListRepository
import javax.inject.Inject

class AddShoppingItem @Inject constructor(private val shoppingListRepository: ShoppingListRepository) {

    fun invoke() {
        shoppingListRepository.addShoppingItem()
    }

}