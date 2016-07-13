package com.wordpress.jonyonandroidcraftsmanship.basicrecyclerviewtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvTest = null;
    private MyAdapter myAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
    }

    private void initialize() {
        rvTest = (RecyclerView) findViewById(R.id.rvTest);
        myAdapter=new MyAdapter(this,getData());
        rvTest.setAdapter(myAdapter);
        rvTest.setLayoutManager(new LinearLayoutManager(this));
    }

    private static List<Data> getData() {
        List<Data> datas = new ArrayList<>();
        int[] icons = {R.drawable.testy1, R.drawable.testy2, R.drawable.testy3, R.drawable.testy4, R.drawable.testy5};
        String[] titles = {"Jony", "Sony", "Tony", "Gony", "Rony"};
        for (int i = 0; i < titles.length && i < icons.length; i++) {
            Data data=new Data(icons[i],titles[i]);
            datas.add(data);
        }
        return datas;
    }
}
