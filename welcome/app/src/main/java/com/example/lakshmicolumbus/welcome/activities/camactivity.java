package com.example.lakshmicolumbus.welcome.activities;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.lakshmicolumbus.welcome.CreateFileListener;
import com.example.lakshmicolumbus.welcome.CreateFileTask;
import com.example.lakshmicolumbus.welcome.R;

import java.io.File;
import java.io.IOException;

public class camactivity extends AppCompatActivity implements CreateFileListener{
 public static final int REQUEST_IMAGE_CAPTURE = 1;

    Uri mImageUri;
ImageView mImageView;
    Button but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_camera_);
        mImageView = (ImageView) findViewById(R.id.imgPreview);
    }

    String mCurrentPhotoPath;
static final int REQUEST_TAKE_PHOTO = 1;

    public void dispatchTakePictureIntent(View view) {
        Log.d("NOW", "Called ");
        new CreateFileTask(camactivity.this,this).execute();
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            mImageView.setImageURI(mImageUri);

        }
    }

    @Override
    public void onFileCreated(File output) {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        mImageUri = Uri.fromFile(output);

        takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT,
                mImageUri);
        startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
    }

    @Override
    public void onFileCreationFailed() {

    }

}

