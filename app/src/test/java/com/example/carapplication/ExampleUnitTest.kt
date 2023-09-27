package com.example.carapplication

import com.example.carapplication.di.DaggerCarComponent
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun checkForCar(){
        val component = DaggerCarComponent.builder().build()
        val car = component.getCar()
        println(car.hashCode())
        val car2 = component.getCar()
        println(car2.hashCode())
        val car3 = component.getCar()
        println(car3.hashCode())
    }
}