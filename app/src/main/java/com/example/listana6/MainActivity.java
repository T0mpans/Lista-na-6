package com.example.listana6;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Produkt>arrayListProdukty;
    private ArrayAdapter<Produkt>arrayAdapter;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        arrayListProdukty = new ArrayList<>();
        arrayListProdukty.add(new Produkt("chleb", 4.4));
        arrayListProdukty.add(new Produkt("bułki", 1.2));
        arrayListProdukty.add(new Produkt("jogurt", 3.6));

        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayListProdukty);
        listView = findViewById(R.id.listView);
        listView.setAdapter(arrayAdapter);

    }
}