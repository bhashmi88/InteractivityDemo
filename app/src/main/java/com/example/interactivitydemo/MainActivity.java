package com.example.interactivitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){
        EditText userName = findViewById(R.id.nameEditText);
        EditText password = findViewById(R.id.passwordEditText);
        Log.i("info","Button Pressed");
        Log.i("Username",userName.getText().toString());
        Log.i("Password",password.getText().toString());
        Toast.makeText(this, "Hi"+ userName.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
