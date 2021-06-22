package com.androidavanzadox.cake;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextEmail, editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextEmail = findViewById(R.id.editTextTextEmailAddress);
        editTextPassword = findViewById(R.id.editTextTextPassword);
    }

    public void iniciarSesion(View view) {

        Log.i("APP","Click en login");

        String email = editTextEmail.getText().toString();
        String pass = editTextPassword.getText().toString();

        if(!email.isEmpty() && !pass.isEmpty()){
            Intent intentLogin = new Intent(this,HomeActivity.class);
            //envia parametro valor email
            intentLogin.putExtra("valoremail",email);
            startActivity(intentLogin);
        }else{
            editTextEmail.setError("Complete el email y contraseña");
        }
    }
}