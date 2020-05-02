package com.example.cars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class tata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tata);
        ListView listView = findViewById(R.id.model);
        ArrayList<String> model = new ArrayList<String>();

        model.add("Tata Altroz");
        model.add("Tata Nexon");
        model.add("Tata Tiago");
        model.add("Tata Harrier");
        model.add("Tata Nexon EV");
        model.add("Tata Nano");
        model.add("Tata Tigor");
        model.add("Tata Safari Storme");
        model.add("Tata Sumo");
        model.add("Tata Hexa");
        model.add("Tata Tiago NRG");
        model.add("Tata Tiago JTP");
        model.add("Tata Zest");
        model.add("Tata Tigor EV");
        model.add("Tata Bolt");
        model.add("Tata Tigor JTP");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.model, model);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int num= 300+position;
                Intent intent = new Intent(getApplicationContext(), Webview.class);
                intent.putExtra("car", num);
                startActivity(intent);
            }
        });
    }
}
