package com.example.lakshmicolumbus.welcome.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.lakshmicolumbus.welcome.R;

public class Main2Activity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "message";
    String message1;

String message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);
        EditText ed2 = (EditText) findViewById(R.id.edit2);
        Intent intent = getIntent();
        message = intent.getStringExtra(EXTRA_MESSAGE);
        ed2.setText(message);
    }

    public void sendmsg(View view) {
        Intent intent = new Intent(this, MainActivity.class);

        EditText editText = (EditText) findViewById(R.id.edit2);
        message1 = editText.getText().toString();
        intent.putExtra(MainActivity.EXTRA_RESULT, message1);
        Log.d("Main2Activity",message);
        Log.d("Main2Activity",message1);
if(message.equals(message1))
        setResult(2, intent);
        else
setResult(3,intent);

        finish();
    }
}
