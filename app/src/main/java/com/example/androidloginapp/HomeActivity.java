package com.example.androidloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    Button logout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        String user = null;

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            user = extras.getString("username");
            //The key argument here must match that used in the other activity
            Log.e("username", user);
        }

        TextView hellouser = (TextView)findViewById(R.id.hellouser);
        hellouser.setText("Hello " + user + "! Welcome to NT213");

        logout = (Button) findViewById(R.id.logout);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
    }


}