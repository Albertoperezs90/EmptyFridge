package com.aperezsi.emptyfridge.domain.usecase

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetShoppingList @Inject constructor() {

    val example = flow {
        emit(listOf("berenjena", "fresas", "naranjas"))
        delay(5000)
        emit(listOf("colifor", "pescado", "carne"))
    }
}