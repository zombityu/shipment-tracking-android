package com.example.shipmenttracking;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegistrationActivity extends AppCompatActivity {
    private static final String SHARED_KEY = RegistrationActivity.class.getPackage().toString();
    private static final int SECRET_KEY = 1010;

    EditText userNameEditText;
    EditText emailEditText;
    EditText passwordEditText;
    EditText passwordAgainEditText;

    private SharedPreferences sharedPreferences;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Bundle bundle = getIntent().getExtras();
        int secretKey = bundle.getInt("SECRET_KEY");

        if (secretKey != 1010){
            finish();
        }

        userNameEditText = findViewById(R.id.userNameEditText);
        emailEditText= findViewById(R.id.emailEditText);
        passwordEditText= findViewById(R.id.passwordEditText);
        passwordAgainEditText= findViewById(R.id.passwordAgainEditText);

        sharedPreferences = getSharedPreferences(SHARED_KEY, MODE_PRIVATE);
        String userName = sharedPreferences.getString("userName", "");
        String password = sharedPreferences.getString("password", "");

        userNameEditText.setText(userName);
        passwordEditText.setText(password);

        mAuth = FirebaseAuth.getInstance();

    }

    public void registration(View view) {
        String userName = userNameEditText.getText().toString();
        String email = emailEditText.getText().toString();
        String pass = passwordEditText.getText().toString();
        String passAgain = passwordAgainEditText.getText().toString();

        if(!pass.equals(passAgain)){
            return;
        }

        mAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(RegistrationActivity.this, "Success", Toast.LENGTH_SHORT).show();
                    startListing();
                } else {
                    Toast.makeText(RegistrationActivity.this, "Error: "+task.getException().getMessage(), Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void cancel(View view) {
        finish();
    }

    private void startListing(){
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}