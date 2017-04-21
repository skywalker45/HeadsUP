package com.example.danie.headsup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.apache.commons.io.FileUtils;


public class FileChooser extends AppCompatActivity {

    private static final int REQUEST_CHOOSER = 1234;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_chooser);

        // Create the ACTION_GET_CONTENT Intent
    //    Intent getContentIntent = FileUtils.createGetContentIntent();

//        Intent intent = Intent.createChooser(getContentIntent, "Select a file");
//        startActivityForResult(intent, REQUEST_CHOOSER);

    }



}
