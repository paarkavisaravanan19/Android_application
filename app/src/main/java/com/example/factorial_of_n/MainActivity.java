package com.example.factorial_of_n;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText e=findViewById(R.id.number);
        TextView t=findViewById(R.id.fact);
        Button b1=findViewById(R.id.factorial);
        Editable s =e.getText();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int fact=1,i;
                int number=Integer.parseInt(String.valueOf(s));
                for(i=1;i<=number;i++){
                    fact= fact*i;
                }
               String result= String.valueOf(fact);
                t.setText(result);
            }
        });
    }
}