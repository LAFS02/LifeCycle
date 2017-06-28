package com.lmntrx.android.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String receivedName = getIntent().getStringExtra("NAME");
        Toast.makeText(this, receivedName, Toast.LENGTH_SHORT).show();

    }
}
