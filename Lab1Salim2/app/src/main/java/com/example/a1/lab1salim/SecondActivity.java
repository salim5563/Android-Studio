package com.example.a1.lab1salim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button button = (Button) findViewById(R.id.second_form1_button);
        final TextView textView = (TextView) findViewById(R.id.second_val_view);
        final EditText edText = (EditText) findViewById(R.id.second_val_enter);

        Intent mainActivityIntent = getIntent();
        textView.setText(mainActivityIntent.getStringExtra("message"));


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = "";
                if(edText.getText().toString().equals("")){
                    value = "0";
                } else {
                    value = edText.getText().toString();
                }
                int valToSend = Integer.parseInt(textView.getText().toString()) + Integer.parseInt(value);

                Intent toMainActivityIntent = new Intent(SecondActivity.this, MainActivity.class);
                toMainActivityIntent.putExtra("result", Integer.toString(valToSend));
                startActivity(toMainActivityIntent);
            }
        });

    }
}
