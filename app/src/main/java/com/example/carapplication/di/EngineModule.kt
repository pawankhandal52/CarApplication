package com.example.carapplication.di

import com.example.carapplication.engine.Engine
import com.example.carapplication.engine.PetrolEngine
import dagger.Module
import dagger.Provides

@Module
class EngineModule {

    @Provides
    fun getEngine():Engine{
        return PetrolEngine()
    }
}