package com.aperezsi.emptyfridge.presentation.common

interface AdapterData<T> {
    fun swapData(data: List<T>)
}