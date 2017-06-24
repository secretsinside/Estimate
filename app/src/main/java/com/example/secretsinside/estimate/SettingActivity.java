package com.example.secretsinside.estimate;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by secretsinside on 23/6/17.
 */

public class SettingActivity extends AppCompatActivity {

    String[] SettingItems={ "Contingency rate","T & P rate", "Transportation rate", "Old Material rate"};

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        ArrayAdapter adapter = new ArrayAdapter<>(this,R.layout.activity_setting_listview, SettingItems);

        ListView listView= (ListView) findViewById(R.id.settingList);
        listView.setAdapter(adapter);
    }
}
