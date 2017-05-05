package com.example.danie.headsup;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
 //   Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("OnCreate", "OnCreate method has been executed");

        final Button  button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                //load new intent here
                askquestion();
            }
        });

        final Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                //load new intent here
                Intent intent = new Intent(getApplicationContext(), CalendarActivity.class);
                startActivity(intent);
            }
        });

        final Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                //load new intent here
            }
        });

    }


    public void askquestion() {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        LayoutInflater factory = LayoutInflater.from(this);
        alert.setTitle("Where is your syllabus?");
        final View view = factory.inflate(R.layout.layout_dialog, null);
        alert.setView(view);
        // alert.setMessage("Message");

        alert.setPositiveButton("Take a picture", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                //Your action here
                Intent intent = new Intent(((Dialog) dialog).getContext(), ScanActivity.class);
                startActivity(intent);
            }
        });

        alert.setNegativeButton("Choose folder",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        Intent intent = new Intent(((Dialog) dialog).getContext(), FileChooser.class);
                        startActivity(intent);
                    }
                });

        alert.show();

    }

}
