package com.example.geo_quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var trueButton: Button
    private lateinit var falseButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)

        trueButton.setOnClickListener { view: View ->
            val snackBar = Snackbar.make(view, "Correct!", Snackbar.LENGTH_SHORT)
            snackBar.show()
        }
        falseButton.setOnClickListener { view: View ->
            val snackBar = Snackbar.make(view, "Incorrect.", Snackbar.LENGTH_SHORT)
            snackBar.show()
        }

    }
}