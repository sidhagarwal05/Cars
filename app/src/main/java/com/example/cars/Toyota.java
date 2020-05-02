package com.example.cars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Toyota extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toyota);
        ListView listView = findViewById(R.id.model);
        ArrayList<String> model = new ArrayList<String>();

        model.add("Toyota Fortuner");
        model.add("Toyota Innova Crysta");
        model.add("Toyota Glanza");
        model.add("Toyota Land Cruiser");
        model.add("Toyota Vellfire");
        model.add("Toyota Platinum Etios");
        model.add("Toyota Etios Liva");
        model.add("Toyota Land Cruiser Prado");
        model.add("Toyota Camry");
        model.add("Toyota Yaris");
        model.add("Toyota Corolla Altis");
        model.add("Toyota Etios Cross");
        model.add("Toyota Prius");
       
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.model, model);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int num= 400+position;
                Intent intent = new Intent(getApplicationContext(), Webview.class);
                intent.putExtra("car", num);
                startActivity(intent);
            }
        });
    }
}
