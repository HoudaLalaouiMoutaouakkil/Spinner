package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.app.Activity;
import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import com.example.spinner.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Spinner Subjects_spinner=findViewById(R.id.planets_spinner);
        ArrayList<com.example.spinner.Data_Item> list= new ArrayList<com.example.spinner.Data_Item>();
        list.add(new com.example.spinner.Data_Item("Iphone s4", R.drawable.p1,"work with high speed"));
        list.add(new com.example.spinner.Data_Item("Iphone 3",R.drawable.p2,"work with max high speed"));
        list.add(new com.example.spinner.Data_Item("Iphone 5",R.drawable.p3,"work with bloooth"));
        list.add(new com.example.spinner.Data_Item("Iphone 6 plus",R.drawable.p4,"work with item s"));
        SpinnerAdapter adapter1 = new Spinner_Adapter(this, R.id.mainview,list);

        Subjects_spinner.setAdapter(adapter1);

    }
}