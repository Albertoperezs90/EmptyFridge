package com.aperezsi.emptyfridge.presentation.common

class Navigator(private val activity: BaseActivity<*>) {

    fun navigateToAddShoppingItem() {
        println(activity.javaClass)
    }

}