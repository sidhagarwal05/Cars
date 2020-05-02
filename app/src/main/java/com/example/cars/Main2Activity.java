package com.example.cars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ListView listView = findViewById(R.id.model);
        ArrayList<String> model = new ArrayList<String>();
            model.add("Audi R8");
            model.add("Audi A3");
            model.add("Audi Q7");
            model.add("Audi A8");
            model.add("Audi TT");
            model.add("Audi Q3");
            model.add("Audi A4");
            model.add("Audi A6");
            model.add("Audi A5");
            model.add("Audi Q5");
            model.add("Audi Q8");
            model.add("Audi RS5 Coupe");
            model.add("Audi RS7 Sportback");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.model, model);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int num= 100+position;
                Intent intent = new Intent(getApplicationContext(), Webview.class);
                intent.putExtra("car", num);
                startActivity(intent);
            }
        });




    }
}
