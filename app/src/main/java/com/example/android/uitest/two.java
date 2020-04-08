package com.example.android.uitest;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


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
        View rootView = inflater.inflate(R.layout.fragment_two, container, false);
        context = rootView.getContext();

        Button graph112 = (Button)rootView.findViewById(R.id.button);
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
                Intent intent = new Intent(context, Graph112.class);
                startActivity(intent);
            }
        });

        graph122.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Graph122.class);
                startActivity(intent);
            }
        });

        graph132.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Graph132.class);
                startActivity(intent);
            }
        });

        graph212.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Graph212.class);
                startActivity(intent);
            }
        });

        graph222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Graph222.class);
                startActivity(intent);
            }
        });

        graph232.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Graph232.class);
                startActivity(intent);
            }
        });

        graph312.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Graph312.class);
                startActivity(intent);
            }
        });

        graph322.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Graph322.class);
                startActivity(intent);
            }
        });

        graph332.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Graph332.class);
                startActivity(intent);
            }
        });

        return rootView;
    }


}
