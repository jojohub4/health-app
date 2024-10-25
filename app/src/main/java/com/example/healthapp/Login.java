package com.example.healthapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login extends AppCompatActivity {

    EditText edUsername, edPassword;
    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        edUsername = findViewById(R.id.editTextUsername);
        edPassword = findViewById(R.id.editTextTextPassword);
        btn = findViewById(R.id.buttonLogin);
        tv = findViewById(R.id.textViewNewUser);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login.this,homeActivity.class));
               /* String username = edUsername.getText().toString();
                String password = edPassword.getText().toString();
                database db = new database(getApplicationContext(), "Healthcare",null,1);
                if (username.length()== 0 || password.length()== 0){
                    Toast.makeText(getApplicationContext(), "please fill all details", Toast.LENGTH_SHORT).show();
                }else {
                    if (db.login(username,password)==1){
                        Toast.makeText(getApplicationContext(), "LOOGIN SUCCESFUL", Toast.LENGTH_SHORT).show();
                        SharedPreferences sharedPreferences= getSharedPreferences("share_prefs", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("username", username);
                        //to save our data eith the kry and value
                        editor.apply();
                        startActivity(new Intent(Login.this,homeActivity.class));
                    }else{
                        Toast.makeText(getApplicationContext(), "Invalid Login", Toast.LENGTH_SHORT).show();
                    }

                }*/


            }
        });
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this,registrationActivity.class));
            }
        });
    }
}