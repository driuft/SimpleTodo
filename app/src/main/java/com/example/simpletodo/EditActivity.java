package com.example.simpletodo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class EditActivity extends AppCompatActivity {

    public static final int MAX_LENGTH = 140;

    EditText etItem;
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        // Hide status bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        etItem = findViewById(R.id.etItem);
        btnSave = findViewById(R.id.btnSave);

        getSupportActionBar().setTitle("Edit item");

        etItem.setText(getIntent().getStringExtra(MainActivity.KEY_ITEM_TEXT));

        // When the user is done editing, they click the save button
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etItem.length() < 1) {
                    Toasty.error(EditActivity.this, "Sorry, the item cannot be empty.", Toast.LENGTH_SHORT, true).show();
                } else if (etItem.length() > MAX_LENGTH) {
                    Toasty.error(EditActivity.this, "Sorry, the item is too long.", Toast.LENGTH_SHORT, true).show();
                } else {
                    // Create an intent which will contain the results
                    Intent intent = new Intent();

                    // Pass the data (results of editing)
                    intent.putExtra(MainActivity.KEY_ITEM_TEXT, etItem.getText().toString());
                    intent.putExtra(MainActivity.KEY_ITEM_POSITION, getIntent().getExtras().getInt(MainActivity.KEY_ITEM_POSITION));

                    // Set the result of the intent
                    setResult(RESULT_OK, intent);

                    // Finish activity, close screen and go back
                    finish();
                }
            }
        });
    }
}