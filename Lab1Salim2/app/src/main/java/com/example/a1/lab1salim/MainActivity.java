package com.example.a1.lab1salim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.main_form2_button);
        final TextView tView = (TextView) findViewById(R.id.main_val_view);
        final EditText edText = (EditText) findViewById(R.id.main_val_enter);
        Intent secondActivityIntent = getIntent();
        if( secondActivityIntent.getStringExtra("result") != null){
            tView.setText(secondActivityIntent.getStringExtra("result"));
        }


        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String value = "";
                if(edText.getText().toString().equals("")){
                    value = "0";
                } else {
                    value = edText.getText().toString();
                }
                int valToSend = Integer.parseInt(tView.getText().toString()) + Integer.parseInt(value);
                Intent toSecondActivityIntent = new Intent(MainActivity.this, SecondActivity.class);
                toSecondActivityIntent.putExtra("message", Integer.toString(valToSend));
                startActivity(toSecondActivityIntent);
            }
        });

    }
}
