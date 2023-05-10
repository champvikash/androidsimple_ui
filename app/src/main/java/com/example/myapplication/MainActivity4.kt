package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4);

        val images = listOf<Image>(
            Image("Images 1", R.drawable.image1),
            Image("Images 2", R.drawable.image11111),
            Image("Images 3", R.drawable.image174774),
            Image("Images 4", R.drawable.image16666),
            Image("Images 5", R.drawable.image123),
            Image("Images 1", R.drawable.image9),
            Image("Images 2", R.drawable.image8),
            Image("Images 3", R.drawable.image7),
            Image("Images 4", R.drawable.image6),
            Image("Images 5", R.drawable.image5),
            Image("Images 1", R.drawable.image4),
            Image("Images 2", R.drawable.image3),
            Image("Images 3", R.drawable.image2),
            Image("Images 4", R.drawable.image1),
            Image("Images 5", R.drawable.image174774)
        )

        val recyclerView = findViewById<RecyclerView>(R.id.imagesRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this, images)
    }
}