package com.example.recyclerview_activty;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RcyclerAdapter extends RecyclerView.Adapter<RcyclerAdapter.ViewHolder> {
    Context context;
    ArrayList<ContactModal> arrayList;
   RcyclerAdapter(Context context, ArrayList<ContactModal> arrayList){
       this.context= context;
       this.arrayList=arrayList;
   }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

      View v = LayoutInflater.from(context).inflate(R.layout.contact_row ,parent , false);
      ViewHolder viewHolder=new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
       holder.img.setImageResource(arrayList.get(position).img);
       holder.textname.setText(arrayList.get(position).name);
       holder.textnumber.setText(arrayList.get(position).number);


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder{
       TextView textname , textnumber;
       ImageView img;
        public ViewHolder(@NonNull  View itemview){
            super(itemview);

            textname=itemview.findViewById(R.id.textname);
            textnumber=itemview.findViewById(R.id.textnumber);
            img=itemview.findViewById(R.id.imgContact);
        }

    }
}

