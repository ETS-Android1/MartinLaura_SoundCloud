package com.example.log;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnSignIn = findViewById(R.id.btnSignIn);
        EditText txtUsername = findViewById(R.id.txtUsername);
        EditText txtPassword = findViewById(R.id.txtPassword);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(txtUsername.getText().toString().equals("Laura") && txtPassword.getText().toString().equals("Laura")){
                    Log.i("Test","login ok");
                }else{
                    Log.i("Test","no login");
                }
            }
        });
    }
}