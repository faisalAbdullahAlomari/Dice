package com.example.dice

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()

        }
    }

    private fun rollDice() {
        val dice =Dice(6)
        val diceRoll = dice.roll()
        val resultImageView: ImageView= findViewById(R.id.imageView)

        val drawbleResource = when (diceRoll){
            1 -> resultImageView.setImageResource(R.drawable.dice_1)
            2 -> resultImageView.setImageResource(R.drawable.dice_2)
            3 -> resultImageView.setImageResource(R.drawable.dice_3)
            4 -> resultImageView.setImageResource(R.drawable.dice_4)
            5 -> resultImageView.setImageResource(R.drawable.dice_5)
            else -> resultImageView.setImageResource(R.drawable.dice_6)
        }
        drawbleResource
    }

    class Dice(private val numSide: Int){

            fun roll():Int{
                return (1..numSide).random()
            }
        }
}