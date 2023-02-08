package com.example.recyclerview_activty;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      RecyclerView recyclerView=findViewById(R.id.recyclerview);

      recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}