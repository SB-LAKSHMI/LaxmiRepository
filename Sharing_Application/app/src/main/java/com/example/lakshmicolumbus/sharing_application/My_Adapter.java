package com.example.lakshmicolumbus.sharing_application;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.lakshmicolumbus.sharing_application.R;

/**
 * Created by sameer on 30/11/15.
 */
public class My_Adapter extends BaseAdapter {

        Context context;
        String[] data;
private static LayoutInflater inflater = null;

public My_Adapter(Context context, String[] data) {
        // TODO Auto-generated constructor stub
        this.context = context;
        this.data = data;
        inflater = (LayoutInflater) context
        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

@Override
public int getCount() {
        // TODO Auto-generated method stub
        return data.length;
        }

@Override
public Object getItem(int position) {
        // TODO Auto-generated method stub
        return data[position];
        }

@Override
public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
        }

@Override
public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View vi = convertView;
       // if(vi!=null)
       //         Log.d("VIEW","Not Null...");
       // if(vi==null)
        vi = inflater.inflate(R.layout.row, null);

        TextView text = (TextView) vi.findViewById(R.id.text);
        text.setText(data[position]);
        Button button1=(Button)vi.findViewById(R.id.butt);
        button1.setText(data[position]);

        return vi;
        }
        }