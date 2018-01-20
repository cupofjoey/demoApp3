package com.jkh3.demoapp3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction (View view) {

        EditText userName = (EditText) findViewById(R.id.userName);
        EditText password = (EditText) findViewById(R.id.password);

        Log.i("Username", userName.getText().toString());
        Log.i("Password", password.getText().toString());

        // Displaying what was typed into 'Username' field by converting it to a string and putting it into a
        //'Toast'. In this case it's a short popup
        Toast.makeText(MainActivity.this, "Hello " + userName.getText().toString() + "!!", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
