package com.aperezsi.emptyfridge.infraestructure.di

import com.aperezsi.emptyfridge.data.remote.ShoppingListRemoteDataSource
import com.aperezsi.emptyfridge.data.repository.ShoppingListRepositoryImpl
import com.aperezsi.emptyfridge.domain.repository.ShoppingListRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun provideShoppingListRepository(shoppingListRemoteDataSource: ShoppingListRemoteDataSource): ShoppingListRepository {
        return ShoppingListRepositoryImpl(shoppingListRemoteDataSource)
    }

}