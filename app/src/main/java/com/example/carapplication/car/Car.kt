package com.example.carapplication.car

import android.util.Log
import com.example.carapplication.engine.Engine
import com.example.carapplication.wheel.Wheel
import javax.inject.Inject

class TATACar @Inject constructor(engine: Engine,
                                  frontLeftWheel:Wheel,
                                  frontRightWheel:Wheel,
                                  rearLeftWheel:Wheel,
                                  rearRightWheel:Wheel

    ):Car {

    override fun start() {
        Log.d("Car","Car is Started")
    }
}

interface Car{
    fun start()
}