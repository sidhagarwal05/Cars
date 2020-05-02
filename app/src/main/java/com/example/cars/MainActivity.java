package com.example.cars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.company);
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Audi");
        cars.add("Hyundai");
        cars.add("Tata");
        cars.add("Toyota");
        cars.add("Renault");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.random_textview, cars);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                intent.putExtra("item", position);
                startActivity(intent);}
                else if(position==1){
                    Intent intent = new Intent(getApplicationContext(), hyundai.class);
                    intent.putExtra("item", position);
                    startActivity(intent);}
                else if(position==2){
                    Intent intent = new Intent(getApplicationContext(), tata.class);
                    intent.putExtra("item", position);
                    startActivity(intent);}
                else if(position==3){
                    Intent intent = new Intent(getApplicationContext(), Toyota.class);
                    intent.putExtra("item", position);
                    startActivity(intent);}
                else if(position==4){
                    Intent intent = new Intent(getApplicationContext(), Renault.class);
                    intent.putExtra("item", position);
                    startActivity(intent);}
            }
        }
        );


    }
}
