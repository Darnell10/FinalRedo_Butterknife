package com.example.d.finalbutterknife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity {

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
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verify();

            }
        });
    }

    public void verify(){
        Toast.makeText(this,"Clicked",Toast.LENGTH_LONG).show();
    }
}
