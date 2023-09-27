package com.example.carapplication.engine

import android.util.Log
import javax.inject.Inject

class PetrolEngine @Inject constructor():Engine {
    private val TAG = Engine::class.java.simpleName

    override fun startEngine() {
        Log.d(TAG,"Petrol Engine is Started")
    }
}

interface Engine{
    fun startEngine()
}