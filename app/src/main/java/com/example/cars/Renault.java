package com.example.cars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Renault extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_renault);
        ListView listView = findViewById(R.id.model);
        ArrayList<String> model = new ArrayList<String>();

        model.add("Renault Kwid");
        model.add("Renault Triber");
        model.add("Renault Duster");
        model.add("Renault Captur");
        model.add("Renault Lodgy");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.model, model);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int num= 500+position;
                Intent intent = new Intent(getApplicationContext(), Webview.class);
                intent.putExtra("car", num);
                startActivity(intent);
            }
        });
    }
}
