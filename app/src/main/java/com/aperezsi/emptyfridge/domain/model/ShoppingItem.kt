package com.aperezsi.emptyfridge.domain.model

sealed class ShoppingItem {
    object Fish : ShoppingItem()
    object Meat : ShoppingItem()
    object Vegetables : ShoppingItem()
    object Miscellanous : ShoppingItem()
}