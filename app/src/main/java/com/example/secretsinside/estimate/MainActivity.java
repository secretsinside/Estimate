package com.example.secretsinside.estimate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText EditTextTransformerAmount= (EditText)findViewById(R.id.editTextTransformerAmount);
        final EditText TwoPercentOfAmount = (EditText)findViewById(R.id.twoPercentOfAmount);
        EditText FourPercentOfAmount = (EditText)findViewById(R.id.fourPercentOfAmount);
        EditText FortyPercentOfAmount = (EditText)findViewById(R.id.fortyPercentOfAmount);
        Button ButtonCalculate = (Button)findViewById(R.id.buttonCalculate) ;

        ButtonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String TransformerAmount= EditTextTransformerAmount.getText().toString();

                float transformerAmount = Float.parseFloat(TransformerAmount);
                float twoPercent,fourPercent,fortyPercent;
                twoPercent = (float) (0.02*transformerAmount);
                fourPercent = (float) (0.04*transformerAmount);
                fortyPercent = (float) (0.4*transformerAmount);

                TwoPercentOfAmount.setText(String.valueOf(twoPercent));

            }
        });

    }
}
