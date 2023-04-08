package com.example.spinner;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.spinner.R;

import java.util.ArrayList;

public class Spinner_Adapter extends ArrayAdapter<com.example.spinner.Data_Item> {
    Activity context;
    ArrayList<com.example.spinner.Data_Item> list;
    LayoutInflater inflater;
    public Spinner_Adapter(Activity context,int id,ArrayList<com.example.spinner.Data_Item> list){
        super(context,id,list);
        this.list=list;
        inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    public View getView(int position, View convertView , ViewGroup parent){
        View itemView = inflater.inflate(R.layout.Spinner_Row,parent,false);
        ImageView imageView=(ImageView)itemView.findViewById(R.id.imageView);
        TextView txtname= itemView.findViewById(R.id.txtname);
        TextView txtdetails=itemView.findViewById(R.id.txtdetails);
        com.example.spinner.Data_Item rowd =list.get(position);
        txtname.setText(rowd.name);
        txtdetails.setText(rowd.Details);
        imageView.setImageResource(rowd.image);
        return itemView;

    }
    public View getDropDownView(int position,View convertView,ViewGroup parent){
        return getView(position,convertView,parent);
    }
}