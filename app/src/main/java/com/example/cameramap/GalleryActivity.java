package com.example.cameramap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class GalleryActivity extends AppCompatActivity {

    static final int REQUEST_GALLERY_IMAGE = 100;
    private static final String TAG = "Gallery Activity";
    private ImageView selectedImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        selectedImage= findViewById(R.id.selected_image);
        launchImagePicker();
    }
    private void launchImagePicker(){
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);

        Log.d("GALLERY WATCH", "" + intent.toString());
        startActivityForResult(Intent.createChooser(intent, "Select an image"),
                REQUEST_GALLERY_IMAGE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_GALLERY_IMAGE && resultCode == RESULT_OK && data != null){
            Uri uri = data.getData();
            selectedImage.setImageURI(uri);

        }else {
            Log.d(TAG, "Request Code invalid");


        }


    }
}
