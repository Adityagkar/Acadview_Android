package com.acadview.miniproject_currency_calculator;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class StudentActivity extends AppCompatActivity {

    Button calling, upload,webexplorer,calculator,converter,exit;
    ImageView profile;
    String url_string;
    EditText url_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        calling = findViewById(R.id.button6);
        upload = findViewById(R.id.button5);
        profile = findViewById(R.id.imageView);
        url_text=findViewById(R.id.editText3);
        calculator=findViewById(R.id.button6);
        converter=findViewById(R.id.button7);

        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 101);
            }
        });


        webexplorer = findViewById(R.id.browsebtn);
        exit=findViewById(R.id.buttonexit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        webexplorer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                url_string=url_text.getText().toString();
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(url_string));
                startActivity(intent);
            }
        });


        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.acadview.calculatorapp");
                if (launchIntent != null) {
                    startActivity(launchIntent);//null pointer check in case package name was not found
                }

            }
        });

        converter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(StudentActivity.this,Converter.class);
                startActivity(intent);
            }
        });



    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 101 && resultCode == RESULT_OK) {
            Bundle bundle=data.getExtras();
            Bitmap bitmap=(Bitmap) bundle.get("data");
            profile.setImageBitmap(bitmap);
        }
        else{
            Toast.makeText(getApplicationContext(),"No Image Taken !",Toast.LENGTH_LONG).show();
        }
    }
}
