package com.example.carapplication.wheel

import javax.inject.Inject

class Wheel @Inject constructor(val tyre: Tyre,
                                val tube: Tube,
                                val rim: Rim) {

}

class Tyre @Inject constructor(){}
class Tube @Inject constructor(){}
class Rim @Inject constructor(){}