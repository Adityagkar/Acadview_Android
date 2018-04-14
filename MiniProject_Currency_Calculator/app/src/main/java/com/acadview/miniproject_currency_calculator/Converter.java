package com.acadview.miniproject_currency_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Converter extends AppCompatActivity {

    EditText amount;
    TextView converted_amount;
    RadioGroup conversion_rules;
    RadioButton USD,INR;
    Button convert;
    Double rupees;
    int flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);


        converted_amount=findViewById(R.id.textView5);
        conversion_rules=findViewById(R.id.rg);
        USD=findViewById(R.id.radioButton);
        INR=findViewById(R.id.radioButton2);
        amount=findViewById(R.id.editText3);

        convert=findViewById(R.id.button4);


       conversion_rules.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(RadioGroup radioGroup, int id_checked) {
               if (id_checked==R.id.radioButton){
                   //USD to INR
                  Integer amount_new=Integer.parseInt(amount.getText().toString());
                  rupees=amount_new*65.21;
                  flag=1;


           }else if(id_checked==R.id.radioButton2){
                   //INR to USD
                   Integer amount_new=Integer.parseInt(amount.getText().toString());
                   rupees=amount_new/65.21;
                   flag=0;

               }
           }
       });

       convert.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if(flag==1)
               converted_amount.setText("INR = Rs."+rupees);
               else
                   converted_amount.setText("USD = $."+rupees);
           }
       });


    }
}
