package com.example.lakshmicolumbus.welcome.activities;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lakshmicolumbus.welcome.R;
import com.example.lakshmicolumbus.welcome.activities.Main2Activity;
import com.example.lakshmicolumbus.welcome.core.ArithmeticOperations;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_RESULT = "result_message";
    public final static String TAG = "MainActivity";
    EditText edd2;
    Context context = this;

    ImageView ph;

    ArithmeticOperations mArithmeticOperations = new ArithmeticOperations();

    private static final int CAMERA_CAPTURE_IMAGE_REQUEST_CODE = 100;

    public static final int MEDIA_TYPE_IMAGE = 1;


    // directory name to store captured images and videos
    private static final String IMAGE_DIRECTORY_NAME = "Hello Camera";

    private Uri fileUri; // file url to store image/video

    private ImageView imgPreview;

    private Button btnCapturePicture, btnRecordVideo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        edd2 = (EditText) findViewById(R.id.edit1);
        setContentView(R.layout.samcalc);
        imgPreview = (ImageView) findViewById(R.id.imgPreview);

        /*btnCapturePicture = (Button) findViewById(R.id.btnCapturePicture);


        *//**
         * Capture image button click event
         * *//*
        btnCapturePicture.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // capture picture
                captureImage();
            }
        });*/


    }


    private void captureImage() {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

                startActivityForResult(intent, CAMERA_CAPTURE_IMAGE_REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        Log.i("","camera result data : "+data.getData());

        if (requestCode == CAMERA_CAPTURE_IMAGE_REQUEST_CODE) {
            if (resultCode == RESULT_OK) {

                previewCapturedImage();
            } else if (resultCode == RESULT_CANCELED) {

                Toast.makeText(getApplicationContext(),
                        "User cancelled image capture", Toast.LENGTH_SHORT)
                        .show();
            } else {

                Toast.makeText(getApplicationContext(),
                        "Sorry! Failed to capture image", Toast.LENGTH_SHORT)
                        .show();
            }
        }
    }


    private void previewCapturedImage() {
        try {
            Log.d("CAM", "Called...");
           // imgPreview.setVisibility(View.VISIBLE);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = 8;
            final Bitmap bitmap = BitmapFactory.decodeFile(fileUri.getPath(),
                    options);
            imgPreview.setImageBitmap(bitmap);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

// other

    public void sendMessage(View view) {
        Intent intent = new Intent(this, Main2Activity.class);

        EditText editText = (EditText) findViewById(R.id.edit1);
        String message = editText.getText().toString();

        intent.putExtra(Main2Activity.EXTRA_MESSAGE, message);
        startActivityForResult(intent, 1);

    }

    public void toasting(View view) {

        Toast toast = Toast.makeText(MainActivity.this, "hai", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.VERTICAL_GRAVITY_MASK, 0, 0);

        toast.show();

    }


    public void display(View view) {

        TextView res = (TextView) findViewById(R.id.result);

        switch (view.getId()) {

            case R.id.one:
                mArithmeticOperations.setInput("1");
                res.setText(mArithmeticOperations.getInput());
                break;
            case R.id.two:
                mArithmeticOperations.setInput("2");
                res.setText(mArithmeticOperations.getInput());
                break;
            case R.id.three:
                mArithmeticOperations.setInput("3");
                res.setText(mArithmeticOperations.getInput());
                break;
            case R.id.four:
                mArithmeticOperations.setInput("4");
                res.setText(mArithmeticOperations.getInput());
                break;
            case R.id.five:
                mArithmeticOperations.setInput("5");
                res.setText(mArithmeticOperations.getInput());
                break;
            case R.id.six:
                mArithmeticOperations.setInput("6");
                res.setText(mArithmeticOperations.getInput());
                break;
            case R.id.seven:
                mArithmeticOperations.setInput("7");
                res.setText(mArithmeticOperations.getInput());
                break;
            case R.id.eight:
                mArithmeticOperations.setInput("8");
                res.setText(mArithmeticOperations.getInput());
                break;
            case R.id.nine:
                mArithmeticOperations.setInput("9");
                res.setText(mArithmeticOperations.getInput());
                break;
            case R.id.zero:
                mArithmeticOperations.setInput("0");
                res.setText(mArithmeticOperations.getInput());

                break;
            case R.id.dot:
                mArithmeticOperations.setInput(".");
                res.setText(mArithmeticOperations.getInput());
                break;

            case R.id.clr:
                mArithmeticOperations.clear();
                res.setText("");

                break;

            case R.id.plus:
                mArithmeticOperations.setOperator('+');

                res.setText("");

                break;
            case R.id.minus:
                mArithmeticOperations.setOperator('-');

                res.setText("");

                break;
            case R.id.back:

                res.clearComposingText();
            case R.id.mul:
                mArithmeticOperations.setOperator('*');

                res.setText("");

                break;
            case R.id.divide:
                mArithmeticOperations.setOperator('/');

                res.setText("");

                break;

            case R.id.eq:


                res.setText(String.valueOf(mArithmeticOperations.getResult()));

        }


    }

   /* Button callCameraButton = (Button) findViewById(R.id.but);
    ph = (ImageView) findViewById(R.id.photo_image);
    ph.setImageDrawable(null);

    callCameraButton.setOnClickListener(new View.OnClickListener() {
        public void onClick(View view) {
            Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            i.putExtra(MediaStore.EXTRA_OUTPUT, "");
            startActivityForResult(i, CAMERA_CAPTURE_IMAGE_REQUEST_CODE);
        }
    });*/
}
