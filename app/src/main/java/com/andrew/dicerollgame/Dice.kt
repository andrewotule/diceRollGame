package com.andrew.dicerollgame

class Dice( private val numSides: Int) {

    // do a random dice roll and return results
    fun roll(): Int{
        return(1..numSides).random()
    }

}