package com.example.lakshmicolumbus.welcome;

import java.io.File;

/**
 * Created by sameer on 26/11/15.
 */
public interface CreateFileListener {
    void onFileCreated(File output);
    void onFileCreationFailed();
}
