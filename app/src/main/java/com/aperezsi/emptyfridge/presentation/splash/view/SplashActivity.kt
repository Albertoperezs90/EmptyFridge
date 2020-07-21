package com.aperezsi.emptyfridge.presentation.splash.view

import androidx.activity.viewModels
import com.aperezsi.emptyfridge.R
import com.aperezsi.emptyfridge.databinding.ActivitySplashBinding
import com.aperezsi.emptyfridge.presentation.common.BaseActivity
import com.aperezsi.emptyfridge.presentation.splash.viewmodel.SplashViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashActivity : BaseActivity<ActivitySplashBinding>(R.layout.activity_splash) {

    private val splashViewMode: SplashViewModel by viewModels()

    override fun initialize(binding: ActivitySplashBinding) {

    }

}