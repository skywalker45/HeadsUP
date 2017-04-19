package com.example.danie.headsup;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
 //   Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("OnCreate", "OnCreate method has been executed");

        //read syllabus
        final Button  button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                //load new intent here
                askquestion();
            }
        });

        //view next week
        final Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                //load new intent here
                Intent intent = new Intent(MainActivity.this, CalendarActivity.class);
                startActivity(intent);
            }
        });

        //options
        final Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                //load new intent here
            }
        });

    }


    public void askquestion() {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Where is your syllabus?");
        // alert.setMessage("Message");

        alert.setPositiveButton("Take a picture", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                //Your action here
                //Intent intent = new Intent(((Dialog) dialog).getContext(), Main2Activity.class);
                //startActivity(intent);
            }
        });

        alert.setNegativeButton("Choose folder",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                    }
                });

        alert.show();

    }

}
