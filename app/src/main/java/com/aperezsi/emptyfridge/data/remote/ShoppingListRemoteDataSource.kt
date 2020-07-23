package com.aperezsi.emptyfridge.data.remote

import com.aperezsi.emptyfridge.data.remote.implementation.Grocery
import kotlinx.coroutines.flow.Flow

interface ShoppingListRemoteDataSource {
    fun getShoppingList(): Flow<List<Grocery>>
    fun addShoppingItem()
    fun removeShoppingItem()
}