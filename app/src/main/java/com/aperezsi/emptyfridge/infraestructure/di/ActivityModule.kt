package com.aperezsi.emptyfridge.infraestructure.di

import android.app.Activity
import com.aperezsi.emptyfridge.presentation.common.BaseActivity
import com.aperezsi.emptyfridge.presentation.common.Navigator
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
class ActivityModule {

    @Provides
    fun providesBaseActivity(activity: Activity): BaseActivity<*> {
        return activity as BaseActivity<*>
    }

    @Provides
    fun provideNavigator(baseActivity: BaseActivity<*>): Navigator {
        return Navigator(baseActivity)
    }

}