package com.example.serialkiller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.renderscript.Script;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView listv;
    private ArrayList<BarisKontak> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listv = findViewById(R.id.rv_killers);

        list.addAll(KillersData.getListData());
        showDaftar();
    }

    private void showDaftar(){
        listv.setLayoutManager(new LinearLayoutManager(this));
        KillerAdapter dftrAdapter =  new KillerAdapter(list);
        listv.setAdapter(dftrAdapter);

    }



}