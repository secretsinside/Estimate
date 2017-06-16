package com.example.secretsinside.estimate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText EditTextTransformerAmount= (EditText)findViewById(R.id.editTextTransformerAmount);
        final TextView TwoPercentOfAmount = (TextView) findViewById(R.id.twoPercentOfAmount);
        final TextView FourPercentOfAmount = (TextView) findViewById(R.id.fourPercentOfAmount);
        final TextView FortyPercentOfAmount = (TextView) findViewById(R.id.fortyPercentOfAmount);
        Button ButtonCalculate = (Button)findViewById(R.id.buttonCalculate) ;

        ButtonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String TransformerAmount= EditTextTransformerAmount.getText().toString();

                if(TransformerAmount.trim().length()==0){
                    Toast.makeText(MainActivity.this,"No input provided",Toast.LENGTH_SHORT).show();
                }

                else {
                    float transformerAmount = Float.parseFloat(TransformerAmount);
                    float twoPercent, fourPercent, fortyPercent;
                    twoPercent = (float) (0.02 * transformerAmount);
                    fourPercent = (float) (0.04 * transformerAmount);
                    fortyPercent = (float) (0.4 * transformerAmount);

                    TwoPercentOfAmount.setText(String.valueOf(twoPercent));
                    FourPercentOfAmount.setText(String.valueOf(fourPercent));
                    FortyPercentOfAmount.setText(String.valueOf(fortyPercent));
                }
            }
        });

    }
}
