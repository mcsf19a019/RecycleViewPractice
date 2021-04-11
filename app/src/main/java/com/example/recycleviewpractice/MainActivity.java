package com.example.recycleviewpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    List<Grocery> groceryList = new ArrayList<Grocery>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setListAdapter();
    }
    private void setListAdapter() {
        Grocery g0 = new Grocery(1,"bread", 1980, "Rs.110");
        Grocery g1 = new Grocery(2,"milk", 1981, "Rs.150");
        Grocery g2 = new Grocery(3,"eggs", 1980, "Rs.180");
        Grocery g3 = new Grocery(4,"butter",1987,"Rs.120");
        Grocery g4 = new Grocery(5,"jam", 1980, "Rs.190");
        Grocery g5 = new Grocery(6,"pickle",1987,"Rs.90");
        Grocery g6 = new Grocery(7,"mayo", 1980, "Rs.180");
        Grocery g7 = new Grocery(8,"ketchup",1987,"Rs.170");

        groceryList.addAll(Arrays.asList(new Grocery[]{g0,g1,g2,g3,g4,g5,g6,g7,}));
        recyclerView = findViewById(R.id.recyclerView);

        //recyclerView.setHasFixedSize(true);

        //LinearLayoutManager GridLayoutManager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter(groceryList,MainActivity.this) {

        };

        recyclerView.setAdapter(adapter);
    }
}