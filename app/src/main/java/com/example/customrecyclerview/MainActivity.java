package com.example.customrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView;
        RecyclerView.Adapter mAdapter;
        RecyclerView.LayoutManager layoutManager;

        List<abcd2> abcd2List;

        recyclerView = (RecyclerView) findViewById(R.id.recycleViewContainer);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);

        abcd2List = new ArrayList<>();

        //Adding Data into ArrayList
        abcd2List.add(new abcd2("Todd Miller",R.drawable.ic_launcher_background));
        abcd2List.add(new abcd2("Bradley Matthews",R.drawable.ic_launcher_background));
        abcd2List.add(new abcd2("Harley Gibson",R.drawable.ic_launcher_background));
        abcd2List.add(new abcd2("Gary Thompson",R.drawable.ic_launcher_background));
        abcd2List.add(new abcd2("Corey Williamson",R.drawable.ic_launcher_background));
        abcd2List.add(new abcd2("Samuel Jones",R.drawable.ic_launcher_background));
        abcd2List.add(new abcd2("Michael Read",R.drawable.ic_launcher_background));
        abcd2List.add(new abcd2("Robert Phillips",R.drawable.ic_launcher_background));
        abcd2List.add(new abcd2("Albert Stewart",R.drawable.ic_launcher_background));
        abcd2List.add(new abcd2("Wayne Diaz",R.drawable.ic_launcher_background));

        mAdapter = new ListAdapter(this, abcd2List);

        recyclerView.setAdapter(mAdapter);
    }
}
