package com.example.lakshmicolumbus.sharing_application;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Popup_List extends AppCompatActivity {
/*

    ListView listView_Actions;
    ArrayList<String> actionsArrayList;
    Button btn_ViewPopUp;
    ArrayAdapter<String> actionsAdapter;
    static final int CUSTOM_DIALOG_ID1 = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_ViewPopUp=(Button) findViewById(R.id.btn_ViewPopUp);

        actionsArrayList=new ArrayList<String>();
        actionsArrayList.add("Action 1");
        actionsArrayList.add("Action 2");
    }

    @Override
    protected void onStart() {
        super.onStart();

        btn_ViewPopUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(CUSTOM_DIALOG_ID1);
                actionsAdapter=new MyCustomBaseAdapteradpt(getApplicationContext(),R.layout.list_actions,actionsArrayList);
                listView_Actions.setAdapter(actionsAdapter);
            }
        });
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        Dialog dialog = null;
        switch (id) {
            case CUSTOM_DIALOG_ID1:
                dialog = new Dialog(MainActivity.this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.setContentView(R.layout.list_actions);
                listView_Actions = (ListView) dialog.findViewById(R.id.listView_Actions);
                break;
        }
        return dialog;
    }

    class MyCustomBaseAdapterAdapter extends ArrayAdapter<String>
    {
        public MyCustomBaseAdapterAdapter(Context context, int textViewResourceId, ArrayList<String> actionsArrayList) {
            super(context, textViewResourceId,actionsArrayList);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View v = inflater.inflate(R.layout.action_list_cell, null);
            final TextView lblContactAction;
            lblContactAction = (TextView) v.findViewById(R.id.txtContactAction);

            lblContactAction.append(actionsArrayList.get(position));
            return v;
        }
    }
}
*/

}
