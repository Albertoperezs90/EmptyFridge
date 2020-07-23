package com.aperezsi.emptyfridge.data.remote.implementation

import android.util.Log
import com.aperezsi.emptyfridge.data.remote.ShoppingListRemoteDataSource
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import javax.inject.Inject

@ExperimentalCoroutinesApi
class ShoppingListRemoteDataSourceImpl @Inject constructor(private val firebaseFirestore: FirebaseFirestore) : ShoppingListRemoteDataSource {

    override fun getShoppingList(): Flow<List<Grocery>> = callbackFlow {
        val eventDocument = firebaseFirestore.collection("shoppingList")
        val suscription = eventDocument.addSnapshotListener { value, error ->
            val changes = value?.documents.orEmpty()
            val groceries = mutableListOf<Grocery>()
            changes.forEach {
                val grocery = it.toObject(Grocery::class.java)
                Log.d("grocery", grocery.toString())
                if (grocery != null) groceries.add(grocery)
            }
            offer(groceries)
        }

        awaitClose { suscription.remove() }
    }

    override fun addShoppingItem() {
        firebaseFirestore.collection("shoppingList").add(Grocery())
    }

    override fun removeShoppingItem() {
        firebaseFirestore.collection("shoppingList").whereEqualTo("name", "pera").get().addOnSuccessListener {
            it.documents.forEach { snapshot ->
                snapshot.reference.delete()
            }
        }
    }

}

data class Grocery(val name: String = "pera")