package com.example.lakshmicolumbus.sharing_application;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class List_Activity extends ListActivity {

    TextView content;

@Override
protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_list_);
        content = (TextView)findViewById(R.id.output);

        String[] values = new String[] { "Android Example ListActivity","ListView ListActivity Array Adapter", "Adapter implementation","ListView ListActivity Array Adapter", "Simple List View With ListActivity",
                "ListActivity Android", "Android Example", "ListView ListActivity Array Adapter","ListActivity Source Code", "ListView ListActivity Array Adapter", "Android Example ListActivity" };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, values);


        // Assign adapter to List
        setListAdapter(adapter);
}

@Override
protected void onListItemClick(ListView l, View v, int position, long id) {

        super.onListItemClick(l, v, position, id);

        // ListView Clicked item index
        int itemPosition     = position;

        // ListView Clicked item value
        String  itemValue    = (String) l.getItemAtPosition(position);

        content.setText("Click : \n  Position :" + itemPosition + "  \n  ListItem : " + itemValue);


}



}