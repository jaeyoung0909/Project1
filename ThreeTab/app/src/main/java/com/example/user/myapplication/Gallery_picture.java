package com.example.user.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Gallery_picture extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_picture);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        Intent receivedIntent = getIntent();
        int imageID = receivedIntent.getIntExtra("image_ID", 0);
        imageView.setImageResource(imageID);
    }
}
