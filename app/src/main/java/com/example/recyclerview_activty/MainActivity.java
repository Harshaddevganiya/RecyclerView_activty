package com.example.recyclerview_activty;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ContactModal> arrModals =new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      RecyclerView recyclerView=findViewById(R.id.recyclerview);

      recyclerView.setLayoutManager(new LinearLayoutManager(this));


    arrModals.add(new ContactModal(R.drawable.a,"ABC","7894561230"));
    arrModals.add(new ContactModal(R.drawable.b,"QWE","1234561790"));
    arrModals.add(new ContactModal(R.drawable.c,"RTY","1245679350"));
    arrModals.add(new ContactModal(R.drawable.d,"IPP","1245679350"));
    arrModals.add(new ContactModal(R.drawable.e,"ABC","1245679350"));
    arrModals.add(new ContactModal(R.drawable.b,"RTY","1245679350"));
    arrModals.add(new ContactModal(R.drawable.c,"ERT","1245679350"));
    arrModals.add(new ContactModal(R.drawable.d,"IPP","1245679350"));
    arrModals.add(new ContactModal(R.drawable.e,"ABC","1245679350"));
    arrModals.add(new ContactModal(R.drawable.b,"RTY","1245679350"));
    arrModals.add(new ContactModal(R.drawable.c,"ERT","1245679350"));

    RcyclerAdapter adapter=new RcyclerAdapter(this,arrModals);
    recyclerView.setAdapter(adapter);

    }
}