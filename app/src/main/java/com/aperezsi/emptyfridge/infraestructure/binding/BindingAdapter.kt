package com.aperezsi.emptyfridge.infraestructure.binding

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.aperezsi.emptyfridge.presentation.common.AdapterData

object BindingAdapter {

    @BindingAdapter("adapter")
    @JvmStatic
    fun setRecyclerViewAdapter(recyclerView: RecyclerView, adapter: RecyclerView.Adapter<*>) {
        recyclerView.adapter = adapter
    }

    @Suppress("UNCHECKED_CAST")
    @BindingAdapter("data")
    @JvmStatic
    fun <T> setRecyclerViewAdapterData(recyclerView: RecyclerView, data: List<T>?) {
        if (recyclerView.adapter is AdapterData<*> && data != null) {
            (recyclerView.adapter as AdapterData<T>).swapData(data)
        }
    }
}