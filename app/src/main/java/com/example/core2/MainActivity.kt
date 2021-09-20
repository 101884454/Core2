package com.example.core2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

//create the movie details
val madmax = movie_details("Mad Max:\nFury Road", "Warner Bros",
    "George Miller", "14/05/2015", "1")
val matrix = movie_details("The Matrix", "Warner Bros",
    "The Wachowskis", "08/04/1999", "2")
val paddington = movie_details("Paddington 2", "Warner Bros",
    "Paul King", "10/11/2017", "3")
val spiderman = movie_details("Spider-Man:\nInto the Spider-Verse", "Sony",
    "Peter Ramsey, Bob Persichetti, Rodney Rothman", "26/12/2018", "4")

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val movie1 = findViewById<ImageView>(R.id.movie_1)
        val movie2 = findViewById<ImageView>(R.id.movie_2)
        val movie3 = findViewById<ImageView>(R.id.movie_3)
        val movie4 = findViewById<ImageView>(R.id.movie_4)
        //image and ratings are assigned
        val rating1 = findViewById<TextView>(R.id.ratings1)
        rating1.text = madmax.rating
        val rating2 = findViewById<TextView>(R.id.ratings2)
        rating2.text = matrix.rating
        val rating3 = findViewById<TextView>(R.id.ratings3)
        rating3.text = paddington.rating
        val rating4 = findViewById<TextView>(R.id.ratings4)
        rating4.text = spiderman.rating

        //if these movies chosen these details passed on to the other page
        movie1.setOnClickListener{
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("moviedetails", madmax)
            startActivity(intent)
        }
        movie2.setOnClickListener{
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("moviedetails", matrix)
            startActivity(intent)
        }
        movie3.setOnClickListener{
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("moviedetails", paddington)
            startActivity(intent)
        }
        movie4.setOnClickListener{
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("moviedetails", spiderman)
            startActivity(intent)
        }
    }
}