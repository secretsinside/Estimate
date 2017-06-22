


package com.example.secretsinside.estimate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText EditTextTransformerAmount, EditTextLabourCost ;
    TextView TwoPercentOfAmount, TotalCost, FourPercentOfAmount, FortyPercentOfAmount, GrandTotalAmount;
    Button ButtonCalculate, ButtonGrandTotal,ButtonClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditTextTransformerAmount= (EditText)findViewById(R.id.editTextTransformerAmount);
        EditTextLabourCost = (EditText) findViewById(R.id.labourCostAmount);
        GrandTotalAmount = (TextView) findViewById(R.id.grandTotalAmount);
        TwoPercentOfAmount = (TextView) findViewById(R.id.contingencyAmount);
        FourPercentOfAmount = (TextView) findViewById(R.id.transportationAmount);
        FortyPercentOfAmount = (TextView) findViewById(R.id.oldMaterialAmount);
        TotalCost = (TextView) findViewById(R.id.totalCostAmount);


        ButtonCalculate = (Button)findViewById(R.id.buttonCalculate) ;
        ButtonGrandTotal = (Button) findViewById(R.id.buttonGrandTotal);



        ButtonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String TransformerAmount= EditTextTransformerAmount.getText().toString();
                float transformerAmount = Float.parseFloat(TransformerAmount);


                    float twoPercent, fourPercent, fortyPercent;
                    float total;
                    twoPercent = (float) (0.02 * transformerAmount);
                    fourPercent = (float) (0.04 * transformerAmount);
                    fortyPercent = (float) (0.4 * transformerAmount);
                    total = (transformerAmount + 2 * twoPercent + fourPercent - fortyPercent);

                    TwoPercentOfAmount = (TextView) findViewById(R.id.contingencyAmount);
                    TwoPercentOfAmount.setText(String.valueOf(twoPercent));
                    TwoPercentOfAmount = (TextView) findViewById(R.id.tAndPAmount);
                    TwoPercentOfAmount.setText(String.valueOf(twoPercent));
                    FourPercentOfAmount.setText(String.valueOf(fourPercent));
                    FortyPercentOfAmount.setText(String.valueOf(fortyPercent));
                    TotalCost.setText(String.valueOf(total));

            }
        });



        ButtonGrandTotal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                String LabourCost = EditTextLabourCost.getText().toString();
                String Total = TotalCost.getText().toString();
                float labourCost = Float.parseFloat(LabourCost);

                float grandTotal, total= Float.parseFloat(Total);

                grandTotal = (labourCost + total);

                GrandTotalAmount.setText(String.valueOf(grandTotal));
            }
        });




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.actionErase :

                EditTextTransformerAmount.setText("");
                TwoPercentOfAmount = (TextView) findViewById(R.id.contingencyAmount);
                TwoPercentOfAmount.setText("");
                TwoPercentOfAmount = (TextView) findViewById(R.id.tAndPAmount);
                TwoPercentOfAmount.setText("");
                FourPercentOfAmount.setText("");
                FortyPercentOfAmount.setText("");
                TotalCost.setText("");
                EditTextLabourCost.setText("");
                GrandTotalAmount.setText("");

                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
