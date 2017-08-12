package com.example.morgan.app_002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void about(View view){
        //Button btn=(Button)findViewById(R.id.button_about);
        setContentView(R.layout.about);
    }
    public void returnHome(View view){
        setContentView(R.layout.activity_main);
    }
}
