package com.example.cars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class hyundai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hyundai);
        ListView listView = findViewById(R.id.model);
        ArrayList<String> model = new ArrayList<String>();

            model.add("Hyundai Creta");
            model.add("Hyundai Venue");
            model.add("New Hyundai Verna");
            model.add("Hyundai i20");
            model.add("Hyundai Grand i10 Nios");
            model.add("Hyundai Aura");
            model.add("Hyundai Santro");
            model.add("Hyundai i20 Active");
            model.add("Hyundai Kona Electric");
            model.add("Hyundai Xcent");
            model.add("Hyundai Tucson");
            model.add("Hyundai Grand i10");
            model.add("Hyundai Elantra");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.model, model);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int num= 200+position;
                Intent intent = new Intent(getApplicationContext(), Webview.class);
                intent.putExtra("car", num);
                startActivity(intent);
            }
        });

    }
}
