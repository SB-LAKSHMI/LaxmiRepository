package com.example.lakshmicolumbus.sharing_application;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class List_Example extends AppCompatActivity {
    ListView listview;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        listview = (ListView) findViewById(R.id.listview);
        String[] values = new String[] { "one","two","three","f","fi","sx","se","ei","ni","ten" };

        //listview.setAdapter(new My_Adapter(this, new String[] { "data1",
          //      "data2" }));
        listview.setAdapter(new My_Adapter(this,values));
        Log.d("GET", "Create Called");

        }
}
