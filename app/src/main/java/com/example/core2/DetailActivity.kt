package com.example.core2

import android.os.Bundle
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val image = findViewById<ImageView>(R.id.final_movie)

        //loads the saved instance
        val moviedetails = intent.getParcelableExtra<movie_details>("moviedetails")
        moviedetails?.let{
            val name = findViewById<TextView>(R.id.name)
            name.text = moviedetails.title
            val studio = findViewById<TextView>(R.id.studio)
            studio.text = moviedetails.studio
            val director = findViewById<TextView>(R.id.director)
            director.text = moviedetails.director
            val release = findViewById<TextView>(R.id.release)
            release.text = moviedetails.release
            val ratingBar = findViewById<RatingBar>(R.id.rating)
            ratingBar.rating = moviedetails.rating.toFloat()
            //assigns all the new values on the new page

            //if to check which image should be showing in image
            if(director.text == "George Miller")
            {
                image.setImageResource(R.drawable.mad_max)
            }
            if(director.text == "The Wachowskis")
            {
                image.setImageResource(R.drawable.the_matrix)
            }
            if(director.text == "Paul King")
            {
                image.setImageResource(R.drawable.paddington_2)
            }
            if(director.text == "Peter Ramsey, Bob Persichetti, Rodney Rothman")
            {
                image.setImageResource(R.drawable.spiderman_into_the_spiderverse)
            }

        }
    }

}