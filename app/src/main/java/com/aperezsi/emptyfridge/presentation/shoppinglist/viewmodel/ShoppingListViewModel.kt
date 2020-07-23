package com.aperezsi.emptyfridge.presentation.shoppinglist.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.aperezsi.emptyfridge.domain.usecase.GetShoppingList

class ShoppingListViewModel @ViewModelInject constructor(
    private val getShoppingList: GetShoppingList
) : ViewModel() {

    val shoppingList = getShoppingList.example.asLiveData(viewModelScope.coroutineContext)

    fun deleteItem(index: Int) {
        /*val currentShoppingList = _shoppingList.value.orEmpty().toMutableList()
        currentShoppingList.removeAt(index)*/
    }
}