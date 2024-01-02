package com.meetting.billcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText Price, Items, Quantity;
    private TextView Amount, Result;
    private TableRow multiply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        Price = findViewById(R.id.Price);
        Items = findViewById(R.id.Items);
        Quantity = findViewById(R.id.Quantity);
        Amount = findViewById(R.id.Amount);
        Result = findViewById(R.id.Result);
        multiply = findViewById(R.id.multiply);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Price == null && Quantity == null) {
                    Toast.makeText(MainActivity.this, "Please fill that all", Toast.LENGTH_SHORT).show();
                }
                else {
                    double result = Integer.parseInt(Quantity.getText().toString()) * Double.parseDouble(Price.getText().toString());
                    Amount.setText("" + result);
                    Toast.makeText(MainActivity.this, "thanks", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}