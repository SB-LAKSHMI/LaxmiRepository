package com.example.lakshmicolumbus.welcome;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;

import com.example.lakshmicolumbus.welcome.activities.MainActivity;

import java.io.File;
import java.io.IOException;

/**
 * Created by sameer on 26/11/15.
 */


public class CreateFileTask extends AsyncTask<Void, Void, File> {

    private Context mContext;
    private CreateFileListener mListener;


    public CreateFileTask(Context context,CreateFileListener listener) {
        mContext = context;
        mListener = listener;
    }

    public File createImageFile() throws IOException {

        String imageFileName = "JPEG_"+ "_";
        File storageDir = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES);
        File image = File.createTempFile(
                imageFileName,   ".jpg",storageDir
        );
        //mCurrentPhotoPath = "file:" + image.getAbsolutePath();
        return image;
    }
    @Override
    protected File doInBackground(Void... params) {
        File photoFile = null;
        try {
            photoFile = createImageFile();
        } catch (IOException ex) {

            Log.d("CAM", "Exception is thorwn : " + ex.getMessage());
        }
        return photoFile;
    }

    @Override
    protected void onPostExecute(File photoFile) {
        super.onPostExecute(photoFile);
        if (photoFile != null) {
            mListener.onFileCreated(photoFile);
            Log.d("CAM", "Executed ...");
        }else{
            mListener.onFileCreationFailed();
        }


    }
}