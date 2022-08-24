package com.tech4dev.wmtapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var teamAScore: TextView
    private lateinit var teamBScore: TextView
    private lateinit var enterTeamAScore: EditText
    private lateinit var enterTeamBScore: EditText
    private lateinit var addButton: Button

    private var aScore = 0
    private var bScore = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addButton = findViewById(R.id.addScoreBtn)
        enterTeamAScore = findViewById(R.id.enterTeamAScore)
        enterTeamBScore = findViewById(R.id.enterTeamBScore)
        teamAScore = findViewById(R.id.teamAScore)
        teamBScore = findViewById(R.id.teamBScore)

        addButton.setOnClickListener{
//            Toast.makeText(this, "Add Score Was Clicked", Toast.LENGTH_LONG).show()
            aScore = enterTeamAScore.text.toString().toInt()
            bScore = enterTeamBScore.text.toString().toInt()

            teamAScore.text = "Team A: $aScore"
            teamBScore.text = "Team B: $bScore"
        }
    }
}