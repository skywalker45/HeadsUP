package com.example.danie.headsup;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Environment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.File;

public class FileChooser extends Activity implements IFolderItemListener {

    FolderLayout localFolders;

    /** Called when the activity is first created. */

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_chooser);

        String root = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
        localFolders = (FolderLayout)findViewById(R.id.localfolders);
        localFolders.setIFolderItemListener(this);
        localFolders.setDir(root);//change directory if u want,default is root

    }

    //Your stuff here for Cannot open Folder
    public void OnCannotFileRead(File file) {
        // TODO Auto-generated method stub
        new AlertDialog.Builder(this)
                .setIcon(R.drawable.ic_chooser)
                .setTitle(
                        "[" + file.getName()
                                + "] folder can't be read!")
                .setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog,
                                                int which) {


                            }
                        }).show();

    }


    //Your stuff here for file Click
    public void OnFileClicked(File file) {
        // TODO Auto-generated method stub
        new AlertDialog.Builder(this)
                .setIcon(R.drawable.ic_chooser)
                .setTitle("[" + file.getName() + "]")
                .setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {


                            }

                        }).show();
    }

}