package com.example.lakshmicolumbus.listview_app;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

public class ListView_Add extends AppCompatActivity {

    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_home);
        listview = (ListView) findViewById(R.id.listview);
        String[] values = new String[] { "Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune"
        };

        listview.setAdapter(new My_Adapter(this, values));
        Log.d("GET", "Create Called");
    }


}
