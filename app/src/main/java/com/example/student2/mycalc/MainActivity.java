package com.example.student2.mycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button plusButton, minusButton;
    EditText first, second;
    TextView result;

    int a, b, c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("MY APP");

        plusButton = (Button) findViewById(R.id.PlusButton);
        minusButton = (Button) findViewById(R.id.MinusButton);
        first = (EditText) findViewById(R.id.First);
        second = (EditText) findViewById(R.id.Second);
        result = (TextView) findViewById((R.id.Result));


        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.valueOf(String.valueOf(first.getText()));
                b = Integer.valueOf(String.valueOf(second.getText()));
                c = a + b;
//                Toast.makeText(getApplicationContext(), a + " + " + b, Toast.LENGTH_LONG).show();
                result.setText(String.valueOf(c));
            }
        });
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.valueOf(String.valueOf(first.getText()));
                b = Integer.valueOf(String.valueOf(second.getText()));
                c = a - b;
//                Toast.makeText(getApplicationContext(), a + " + " + b, Toast.LENGTH_LONG).show();
                result.setText(String.valueOf(c));
            }
        });
    }
}
