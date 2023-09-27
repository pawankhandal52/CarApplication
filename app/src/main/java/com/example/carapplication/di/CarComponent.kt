package com.example.carapplication.di

import com.example.carapplication.car.Car
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [CarModule::class,EngineModule::class])
interface CarComponent {
    fun getCar():Car
}