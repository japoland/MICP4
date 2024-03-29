package com.example.cameramap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

//import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button_map, button_photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onPhotoClick(View v) {
        //This code redirects the from main page to the maps page.
        Intent redirect = new Intent(MainActivity.this, CameraActivity.class);
        startActivity(redirect);
    }

    public void onLocationClick(View v) {
        //This code redirects to the photo activity.
        Intent redirect = new Intent(MainActivity.this, MyMapsActivity.class);
        startActivity(redirect);
    }

    public void onGalleryClick(View v){
        Intent redirect = new Intent(MainActivity.this, GalleryActivity.class);
        startActivity(redirect);
    }
}
