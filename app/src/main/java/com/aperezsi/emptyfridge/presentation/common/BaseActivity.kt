package com.aperezsi.emptyfridge.presentation.common

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<T>(private val layoutId: Int) : AppCompatActivity() where T : ViewDataBinding {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<T>(this, layoutId)
        binding.lifecycleOwner = this
        initialize(binding)
    }

    abstract fun initialize(binding: T)
}