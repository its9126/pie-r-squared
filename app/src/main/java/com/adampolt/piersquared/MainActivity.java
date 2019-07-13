package com.adampolt.piersquared;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button calculate = findViewById(R.id.calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView p1 = findViewById(R.id.pizza1);
                TextView p2 = findViewById(R.id.pizza2);

                String p1DiameterString = p1.getText().toString();
                String p2DiameterString = p2.getText().toString();

                if(p1DiameterString.equals("") || p2DiameterString.equals("")) {
                    Toast.makeText(MainActivity.this, "Enter both numbers", Toast.LENGTH_SHORT).show();
                    return;
                }

                double p1DiameterDouble = Double.parseDouble(p1DiameterString);
                double p2DiameterDouble = Double.parseDouble(p2DiameterString);

                double p1radius = p1DiameterDouble / 2;
                double p2radius = p2DiameterDouble / 2;

                double p1area = Math.PI * p1radius * p1radius;
                double p2area = Math.PI * p2radius * p2radius;

                String resultString = "Pizza 1: " + p1area + ", Pizza 2: " + p2area;

                TextView resultView = findViewById(R.id.result);

                resultView.setText(resultString);
            }
        });
    }
}







