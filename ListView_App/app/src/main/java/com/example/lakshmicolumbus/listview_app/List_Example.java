package com.example.lakshmicolumbus.listview_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

public class List_Example extends AppCompatActivity {
    ListView listview;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_home);
        listview = (ListView) findViewById(R.id.listview);
        String[] values = new String[] { "one","two","three","f","fi","sx","se","ei","ni","ten" };

        //listview.setAdapter(new My_Adapter(this, new String[] { "data1",
          //      "data2" }));
        listview.setAdapter(new My_Adapter(this,values));
        Log.d("GET", "Create Called");

        }
}
