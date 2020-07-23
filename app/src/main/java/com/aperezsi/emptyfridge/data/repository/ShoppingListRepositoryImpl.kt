package com.aperezsi.emptyfridge.data.repository

import com.aperezsi.emptyfridge.data.remote.ShoppingListRemoteDataSource
import com.aperezsi.emptyfridge.data.remote.implementation.Grocery
import com.aperezsi.emptyfridge.domain.repository.ShoppingListRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ShoppingListRepositoryImpl @Inject constructor(private val remoteDataSource: ShoppingListRemoteDataSource) : ShoppingListRepository {

    override fun getShoppingList(): Flow<List<Grocery>> {
        return remoteDataSource.getShoppingList()
    }

    override fun addShoppingItem() {
        remoteDataSource.addShoppingItem()
    }

    override fun removeShoppingItem() {
        remoteDataSource.removeShoppingItem()
    }

}