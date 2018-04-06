package com.example.aditya.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;
import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity {
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = (Button) findViewById(R.id.button);
        TextView t = (TextView) findViewById(R.id.tt);
        final Toast toast;
        toast = makeText(this, "CREATED", Toast.LENGTH_SHORT);
        toast.show();


    }


    @Override
    protected void onStart() {
        super.onStart();
        TextView t = (TextView) findViewById(R.id.tt);
        final Toast toast;
        toast = makeText(this, "STARTED", Toast.LENGTH_SHORT);
        toast.show();

    }

    @Override
    protected void onResume() {
        super.onResume();

        TextView t = (TextView) findViewById(R.id.tt);
        final Toast toast;
        toast = makeText(this, "RESUMED", Toast.LENGTH_SHORT);


                toast.show();



    }

    @Override
    protected void onPause() {
        super.onPause();

        TextView t = (TextView) findViewById(R.id.tt);
        final Toast toast;
        toast = makeText(this, "PAUSED", Toast.LENGTH_SHORT);
        toast.show();

    }

    @Override
    protected void onStop() {
        super.onStop();

        TextView t = (TextView) findViewById(R.id.tt);
        final Toast toast;
        toast = makeText(this, "STOPPED", Toast.LENGTH_SHORT);
        toast.show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        TextView t = (TextView) findViewById(R.id.tt);
        final Toast toast;
        toast = makeText(this, "DESTROYED", Toast.LENGTH_SHORT);
        toast.show();
    }

}