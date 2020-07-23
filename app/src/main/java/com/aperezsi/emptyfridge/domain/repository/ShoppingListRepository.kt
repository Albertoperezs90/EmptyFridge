package com.aperezsi.emptyfridge.domain.repository

import com.aperezsi.emptyfridge.data.remote.implementation.Grocery
import kotlinx.coroutines.flow.Flow

interface ShoppingListRepository {
    fun getShoppingList(): Flow<List<Grocery>>
    fun addShoppingItem()
    fun removeShoppingItem()
}