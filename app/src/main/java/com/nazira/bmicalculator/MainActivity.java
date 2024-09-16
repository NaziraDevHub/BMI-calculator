package com.nazira.bmicalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText edWight,edFeet,edInch;
    Button buttonCal;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edWight = findViewById(R.id.edWight);
        edFeet = findViewById(R.id.edFeet);
        edInch = findViewById(R.id.edInch);
        buttonCal = findViewById(R.id.buttonCal);
        tvResult = findViewById(R.id.tvResult);

        buttonCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float weight = Float.parseFloat(edWight.getText().toString());
                float feet = Float.parseFloat(edFeet.getText().toString());
                float inch = Float.parseFloat(edInch.getText().toString());

                float height = (float) (feet*0.3048 + inch*0.0254);
                float bmiIndex = weight/ (height*height);

                tvResult.setText("BMI Index:"+bmiIndex);



            }
        });


    }
}