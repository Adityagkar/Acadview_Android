package com.acadview.assignment9_registration_menu_storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    TextView details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        sharedPreferences = getSharedPreferences("myPrefs", Context.MODE_PRIVATE);
        details=findViewById(R.id.textView7);

        details.setText(""+ sharedPreferences.getAll());

    }
}
