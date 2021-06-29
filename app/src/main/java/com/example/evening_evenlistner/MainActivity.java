package com.example.evening_evenlistner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    protected TextView tv_1;
    protected Button btn_1;
    protected EditText etv_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_1 = findViewById(R.id.tv_1);
        btn_1 = findViewById(R.id.btn_1);
        etv_1 = findViewById(R.id.etv_1);
        etv_1.addTextChangedListener(textWatcher);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_1.setText("ButtonClicked");
            }
        });


    }

    TextWatcher textWatcher=new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            if(s.toString().length()>6){
                Toast.makeText(MainActivity.this,"entered characters",Toast.LENGTH_SHORT).show();

            }
            if(s.toString().equals( "MasaiSchool")){
                Toast.makeText(MainActivity.this,"MasaiSchool",Toast.LENGTH_SHORT).show();
            }
        }
    };

}