package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvTeam;
    private ArrayList<Model> listTeam = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvTeam = findViewById(R.id.rv_company_list);
        rvTeam.setHasFixedSize(true);
        listTeam.addAll(Data.getListData());

        showRecyclerList();
    }

    private void showRecyclerList() {
        rvTeam.setLayoutManager(new LinearLayoutManager(this));
        Adapter footbalAdapter = new Adapter(Data.getListData(), this);
        footbalAdapter.setModels(listTeam);
        rvTeam.setAdapter(footbalAdapter);
    }
}