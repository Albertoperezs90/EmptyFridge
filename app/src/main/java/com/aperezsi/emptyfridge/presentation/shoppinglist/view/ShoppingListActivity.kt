package com.aperezsi.emptyfridge.presentation.shoppinglist.view

import androidx.activity.viewModels
import com.aperezsi.emptyfridge.R
import com.aperezsi.emptyfridge.databinding.ActivityShoppingListBinding
import com.aperezsi.emptyfridge.presentation.common.BaseActivity
import com.aperezsi.emptyfridge.presentation.shoppinglist.adapter.ShoppingListAdapter
import com.aperezsi.emptyfridge.presentation.shoppinglist.viewmodel.ShoppingListViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ShoppingListActivity : BaseActivity<ActivityShoppingListBinding>(R.layout.activity_shopping_list) {

    private val shoppingListViewModel: ShoppingListViewModel by viewModels()
    private val shoppingListAdapter: ShoppingListAdapter by lazy {
        ShoppingListAdapter(shoppingListViewModel::deleteItem)
    }

    override fun initialize(binding: ActivityShoppingListBinding) {
        binding.viewmodel = shoppingListViewModel
        binding.adapter = shoppingListAdapter
        binding.executePendingBindings()
    }

}