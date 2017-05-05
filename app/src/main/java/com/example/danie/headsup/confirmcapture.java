package com.example.danie.headsup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.vision.text.TextBlock;

public class confirmcapture extends AppCompatActivity {

    ListView words;
    String[] receiveWords;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmcapture);

        Intent intent = getIntent();
        receiveWords = intent.getStringArrayExtra("words");

//        TextBlock x = (TextBlock) intent.getParcelableExtra("words");
//        StringBuilder stringBuilder = new StringBuilder();

        words = (ListView)findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_confirmcapture, R.id.textView, receiveWords);
        words.setAdapter(arrayAdapter);
    }
}
