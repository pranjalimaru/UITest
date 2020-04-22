package com.example.android.uitest.ViewPager;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.android.uitest.India.India11;
import com.example.android.uitest.India.India12;
import com.example.android.uitest.India.India13;
import com.example.android.uitest.India.India21;
import com.example.android.uitest.India.India22;
import com.example.android.uitest.India.India23;
import com.example.android.uitest.India.India31;
import com.example.android.uitest.India.India32;
import com.example.android.uitest.India.India33;
import com.example.android.uitest.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class two extends Fragment {

    Context context;

    public two() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.actitvity_country, container, false);
        context = rootView.getContext();

        Button graph112 = (Button)rootView.findViewById(R.id.button1);
        Button graph122 = (Button)rootView.findViewById(R.id.button2);
        Button graph132 = (Button)rootView.findViewById(R.id.button3);
        Button graph212 = (Button)rootView.findViewById(R.id.button4);
        Button graph222 = (Button)rootView.findViewById(R.id.button5);
        Button graph232 = (Button)rootView.findViewById(R.id.button6);
        Button graph312 = (Button)rootView.findViewById(R.id.button7);
        Button graph322 = (Button)rootView.findViewById(R.id.button8);
        Button graph332 = (Button)rootView.findViewById(R.id.button9);


        graph112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, India11.class);
                startActivity(intent);
            }
        });

        graph122.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, India12.class);
                startActivity(intent);
            }
        });

        graph132.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, India13.class);
                startActivity(intent);
            }
        });

        graph212.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, India21.class);
                startActivity(intent);
            }
        });

        graph222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, India22.class);
                startActivity(intent);
            }
        });

        graph232.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, India23.class);
                startActivity(intent);
            }
        });

        graph312.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, India31.class);
                startActivity(intent);
            }
        });

        graph322.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, India32.class);
                startActivity(intent);
            }
        });

        graph332.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, India33.class);
                startActivity(intent);
            }
        });

        return rootView;
    }


}
