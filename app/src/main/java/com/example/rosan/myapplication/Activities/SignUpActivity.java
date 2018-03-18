package com.example.rosan.myapplication.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.rosan.myapplication.R;

/**
 * Created by Dell on 3/17/2018.
 */

public class SignUpActivity extends AppCompatActivity {
    EditText email, password, confirm_password;
    Button signup;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        email = findViewById(R.id.email1);
        password = findViewById(R.id.password1);
        confirm_password = findViewById(R.id.password2);
        signup = findViewById(R.id.signupbtn);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String e = email.getText().toString();
                String pass1 = password.getText().toString();
                String pass2 = confirm_password.getText().toString();

                if (e.length() <= 0) {
                    email.setError("Please enter email");
                } else if (pass1.length() > 0 && pass2.length() > 0) {

                    Toast.makeText(SignUpActivity.this, "Sign up Successfull", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(SignUpActivity.this, LoginActivity.class);
                    startActivity(i);
                    finish();

                } else {
                    password.setError("Please enter matching password");
                    confirm_password.setError("Please enter matching password");
                }
            }
        });

    }
}
