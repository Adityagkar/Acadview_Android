package com.acadview.loginform_assignment3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

            if(name.equals("ADITYA")&&pwd.equalsIgnoreCase("ADITYA123")){
                Toast.makeText(getApplicationContext(),"LOGIN SUCCESSFULL !",Toast.LENGTH_LONG).show();}
                else
                    Toast.makeText((getApplicationContext()),"LOGIN FAILED !",Toast.LENGTH_SHORT).show();
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
