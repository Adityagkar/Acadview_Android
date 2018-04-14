package com.acadview.miniproject_currency_calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button login,reset;
    EditText username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login=findViewById(R.id.button);
        reset=findViewById(R.id.button2);

        username=findViewById(R.id.editText);
        password=findViewById(R.id.editText2);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            String name=username.getText().toString();
            String pwd=password.getText().toString();

        if(name.equals("student")&&pwd.equalsIgnoreCase("acadview"))
            {
                Intent intent=new Intent(MainActivity.this,StudentActivity.class);
                startActivity(intent);
            }
            else
                Toast.makeText(getApplicationContext(),"SORRY WRONG LOGIN CREDENTIALS !",Toast.LENGTH_LONG).show();
            }
        });


        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username.setText("");
                password.setText("");
            }
        });
    }
}
