package com.aperezsi.emptyfridge.presentation.shoppinglist.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData

class ShoppingListViewModel @ViewModelInject constructor() : ViewModel() {

    val shoppingList: LiveData<List<String>> = liveData {
        emit(listOf("berenjenas", "fresas", "naranjas"))
    }
}