package com.example.danie.headsup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ViewWeekActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_week);

        String events[] = {"4/17/17 test", "4/23/17 quiz", "4/26/17 project"};
        ArrayList<String> eventList = new ArrayList<String>();

        if(getIntent().getExtras() != null){
            for(String a : getIntent().getExtras().getStringArrayList("list")){
                eventList.add(a);
            }
        }



        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.view_week_listview, eventList) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                /// Get the Item from ListView
                View view = super.getView(position, convertView, parent);

                // Set the border of View (ListView Item)
                view.setBackground(getContext().getDrawable(R.drawable.listview_item_border));

                // Return the view
                return view;
            }
        };
        ListView listview = (ListView) findViewById(R.id.events_list);


        listview.setAdapter(adapter);

    }
}