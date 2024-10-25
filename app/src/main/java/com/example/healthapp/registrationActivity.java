package com.example.healthapp;

import android.content.Intent;
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

public class registrationActivity extends AppCompatActivity {

    EditText edUsername, edEmail, edPassword, edConfirm;
    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registrtion);

        edUsername = findViewById(R.id.editTextTextusername);
        edEmail = findViewById(R.id.editTextTextEmailAddress2);
        edPassword = findViewById(R.id.editTextTextPassword2);
        edConfirm  = findViewById(R.id.editRegconfirmPassword);
        btn = findViewById(R.id.buttonReg);
        tv = findViewById(R.id.textViewExistingUser);

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(registrationActivity.this,Login.class));
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = edUsername.getText().toString();
                String email = edEmail.getText().toString();
                String password = edPassword.getText().toString();
                database db = new database(getApplicationContext(), "Healthcare",null,1);
                String confirm = edConfirm.getText().toString();

                if (username.length()==0|| email.length()== 0 || password.length()== 0 || confirm.length()==0) {
                    Toast.makeText(getApplicationContext(), "please fill all details", Toast.LENGTH_SHORT).show();
                }else{
                    if (password.compareTo(confirm)==0){
                       if (isValid(password)){
                           db.register(username,email,password);
                           Toast.makeText(getApplicationContext(), "registration was successful", Toast.LENGTH_SHORT).show();
                           startActivity(new Intent(registrationActivity.this,Login.class));
                       }else {
                           Toast.makeText(getApplicationContext(), "password must contain atleast 8 letters, letter, numbers and special characters", Toast.LENGTH_SHORT).show();
                       }
                    }else {
                        Toast.makeText(getApplicationContext(), "confirm your password", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
    public static boolean isValid(String passwordhere){
        int f1=0, f2=0, f3=0;
        if (passwordhere.length() < 8){
            return false;
        }else {
            for (int p=0; p< passwordhere.length(); p++){
                if (Character.isLetter(passwordhere.charAt(p))){
                    f1=1;
                }
            }
            for (int r=0; r< passwordhere.length(); r++){
                if (Character.isDigit(passwordhere.charAt(r))){
                    f2=1;
                }
            }
            for (int s=0; s<passwordhere.length(); s++){
                char c = passwordhere.charAt(s);
                if (!Character.isLetterOrDigit(c)){
                    f3=1;
                }
            }
            if (f1==1 && f2==1 && f3==1)
                return true;
            return false;
        }
    };
}