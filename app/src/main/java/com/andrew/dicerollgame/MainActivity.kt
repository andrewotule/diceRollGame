package com.andrew.dicerollgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.button)

        // set a click listener on the button to roll whe the user taps it
        rollButton.setOnClickListener{ rollDice()}

        //do a dice roll when the app starts
        rollDice()
    }

    private fun rollDice(){
        // create new dice objects with 6 side and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()
        //find the imageview in the layout
        val diceImage = findViewById<ImageView>(R.id.imageView)

        // determine which resource id to use based on the dice roll use
        val drawableResource = when(diceRoll){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else -> R.drawable.dice_6

        }

        //update the image view with the correct drawable resource ID
        diceImage.setImageResource(drawableResource)
        //update the content description
        diceImage.contentDescription = diceRoll.toString()
    }
}