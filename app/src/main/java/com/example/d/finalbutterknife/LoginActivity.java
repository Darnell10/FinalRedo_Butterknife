package com.example.d.finalbutterknife;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity {

    private static final String SHARED_PREFS_KEY = "sharedPrefsKey";
    private SharedPreferences login;


    @BindView(R.id.user_name)
    EditText editTextUsername;

    @BindView(R.id.password)
    EditText editTextPassword;

    @BindView(R.id.submit_button)
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        login = getApplicationContext().getSharedPreferences(SHARED_PREFS_KEY,MODE_PRIVATE);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verify();

            }
        });
    }

    public void verify(){
        Toast.makeText(this,"Clicked",Toast.LENGTH_LONG).show();
        SharedPreferences.Editor editor = login.edit();

        String checkUserName = editTextUsername.getText().toString();
        String checkPassword = editTextPassword.getText().toString();

        if(checkUserName.isEmpty()){
            editTextUsername.setError("Oops , You forgot the Username");
            editTextUsername.requestFocus();
        } else if (checkPassword.isEmpty()) {
            editTextPassword.setError("Oops, You forgot to enter a password");
            editTextPassword.requestFocus();
        } else if (checkPassword.contains(checkUserName)){
            editTextPassword.setError("Password cannot be the same as Username");
            editTextPassword.requestFocus();
        } else {
            Intent intent = new Intent(LoginActivity.this, BreedsActivity.class);
            intent.putExtra("username",editTextUsername.getText().toString());
            editor.putString("email", checkUserName);
            editor.apply();
            startActivity(intent);
        }
    }
}
