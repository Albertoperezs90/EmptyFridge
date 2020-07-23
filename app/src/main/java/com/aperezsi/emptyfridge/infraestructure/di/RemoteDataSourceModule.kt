package com.aperezsi.emptyfridge.infraestructure.di

import com.aperezsi.emptyfridge.data.remote.ShoppingListRemoteDataSource
import com.aperezsi.emptyfridge.data.remote.implementation.ShoppingListRemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
abstract class RemoteDataSourceModule {

    @Binds
    abstract fun bindsShoppingListRemoteDataSource(shoppingListRemoteDataSourceImpl: ShoppingListRemoteDataSourceImpl): ShoppingListRemoteDataSource

}