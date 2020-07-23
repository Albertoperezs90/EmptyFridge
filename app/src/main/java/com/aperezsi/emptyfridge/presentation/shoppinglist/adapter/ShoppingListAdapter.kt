package com.aperezsi.emptyfridge.presentation.shoppinglist.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.aperezsi.emptyfridge.R
import com.aperezsi.emptyfridge.databinding.ItemShoppingListBinding
import com.aperezsi.emptyfridge.presentation.common.AdapterData

class ShoppingListAdapter(private val deleteCallback: (index: Int) -> Unit) : RecyclerView.Adapter<ShoppingListAdapter.ViewHolder>(), AdapterData<String> {

    private var shoppingList: List<String> = emptyList()

    override fun swapData(data: List<String>) {
        shoppingList = data
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: ItemShoppingListBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_shopping_list, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = shoppingList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = shoppingList[position]
        holder.bind(item)
    }

    inner class ViewHolder(private val binding: ItemShoppingListBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: String) {
            binding.item = item
            binding.deleteIcon.setOnClickListener {
                deleteCallback(adapterPosition)
            }
            binding.executePendingBindings()
        }
    }
}