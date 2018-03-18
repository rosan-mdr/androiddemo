package com.example.rosan.myapplication.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rosan.myapplication.R;

/**
 * Created by Dell on 3/17/2018.
 */

public class LoginActivity extends AppCompatActivity {
    TextView signup;
    EditText email, password;
    Button login;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        signup = findViewById(R.id.signup);
        password = findViewById(R.id.password);
        email = findViewById(R.id.email);
        login = findViewById(R.id.loginbutton);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String e =email.getText().toString();
                String p = password.getText().toString();
                if (e.length()>0 && p.length()>0) {
                    Toast.makeText(LoginActivity.this, "Successfully logged in!", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(i);
                    finish();
                } else {
                    email.setError("Please enter email");
                    password.setError("Please enter password");
                }
            }
        });


        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this,SignUpActivity.class);
                startActivity(i);
                finish();
                Toast.makeText(LoginActivity.this,"Sign up page",Toast.LENGTH_LONG).show();
            }
        });


    }
}
