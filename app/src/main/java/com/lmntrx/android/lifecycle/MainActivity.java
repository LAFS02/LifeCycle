package com.lmntrx.android.lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Hi User :)", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Bye, " + userName, Toast.LENGTH_SHORT).show();
    }

    public void saveName(View view) {
        editText = (EditText) findViewById(R.id.nameET);
        userName = editText.getText().toString();


        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("NAME",userName);
        startActivity(intent);

    }
}
