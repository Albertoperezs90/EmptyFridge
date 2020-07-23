package com.aperezsi.emptyfridge.presentation.shoppinglist.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.aperezsi.emptyfridge.domain.usecase.AddShoppingItem
import com.aperezsi.emptyfridge.domain.usecase.GetShoppingList
import com.aperezsi.emptyfridge.domain.usecase.RemoveShoppingItem

class ShoppingListViewModel @ViewModelInject constructor(
    getShoppingList: GetShoppingList,
    private val addShoppingItem: AddShoppingItem,
    private val removeShoppingItem: RemoveShoppingItem
) : ViewModel() {

    val shoppingList = getShoppingList.invoke().asLiveData(viewModelScope.coroutineContext)

    fun deleteItem(index: Int) {
        /*val currentShoppingList = _shoppingList.value.orEmpty().toMutableList()
        currentShoppingList.removeAt(index)*/
    }

    fun addItem() {
        addShoppingItem.invoke()
    }

    fun removeItem() {
        removeShoppingItem.invoke()
    }
}