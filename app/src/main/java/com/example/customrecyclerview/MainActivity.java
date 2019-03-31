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
        abcd2List.add(new abcd2("Oswald",R.drawable.head1));
        abcd2List.add(new abcd2("Winnie",R.drawable.head2));
        abcd2List.add(new abcd2("Henry",R.drawable.head3));
        abcd2List.add(new abcd2("Daisy",R.drawable.head4));
        abcd2List.add(new abcd2("Madame Butterfly",R.drawable.head5));
        abcd2List.add(new abcd2("Catrina",R.drawable.head6));
        abcd2List.add(new abcd2("Egbert",R.drawable.head7));
        abcd2List.add(new abcd2("Leo",R.drawable.head8));
        abcd2List.add(new abcd2("Steve Tree",R.drawable.head9));
        abcd2List.add(new abcd2("Jhonny Snowman",R.drawable.head10));

        abcd2List.add(new abcd2("Oswald",R.drawable.head1));
        abcd2List.add(new abcd2("Winnie",R.drawable.head2));
        abcd2List.add(new abcd2("Henry",R.drawable.head3));
        abcd2List.add(new abcd2("Daisy",R.drawable.head4));
        abcd2List.add(new abcd2("Madame Butterfly",R.drawable.head5));
        abcd2List.add(new abcd2("Catrina",R.drawable.head6));
        abcd2List.add(new abcd2("Egbert",R.drawable.head7));
        abcd2List.add(new abcd2("Leo",R.drawable.head8));
        abcd2List.add(new abcd2("Steve Tree",R.drawable.head9));
        abcd2List.add(new abcd2("Jhonny Snowman",R.drawable.head10));

        abcd2List.add(new abcd2("Oswald",R.drawable.head1));
        abcd2List.add(new abcd2("Winnie",R.drawable.head2));
        abcd2List.add(new abcd2("Henry",R.drawable.head3));
        abcd2List.add(new abcd2("Daisy",R.drawable.head4));
        abcd2List.add(new abcd2("Madame Butterfly",R.drawable.head5));
        abcd2List.add(new abcd2("Catrina",R.drawable.head6));
        abcd2List.add(new abcd2("Egbert",R.drawable.head7));
        abcd2List.add(new abcd2("Leo",R.drawable.head8));
        abcd2List.add(new abcd2("Steve Tree",R.drawable.head9));
        abcd2List.add(new abcd2("Jhonny Snowman",R.drawable.head10));

        abcd2List.add(new abcd2("Oswald",R.drawable.head1));
        abcd2List.add(new abcd2("Winnie",R.drawable.head2));
        abcd2List.add(new abcd2("Henry",R.drawable.head3));
        abcd2List.add(new abcd2("Daisy",R.drawable.head4));
        abcd2List.add(new abcd2("Madame Butterfly",R.drawable.head5));
        abcd2List.add(new abcd2("Catrina",R.drawable.head6));
        abcd2List.add(new abcd2("Egbert",R.drawable.head7));
        abcd2List.add(new abcd2("Leo",R.drawable.head8));
        abcd2List.add(new abcd2("Steve Tree",R.drawable.head9));
        abcd2List.add(new abcd2("Jhonny Snowman",R.drawable.head10));


        mAdapter = new ListAdapter(this, abcd2List);

        recyclerView.setAdapter(mAdapter);
    }
}
