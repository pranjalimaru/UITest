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
public class one extends Fragment {

    Context context;

    public one() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_one, container, false);
        context = rootView.getContext();

        Button graph11 = (Button)rootView.findViewById(R.id.button);
        Button graph12 = (Button)rootView.findViewById(R.id.button2);
        Button graph13 = (Button)rootView.findViewById(R.id.button3);
        Button graph21 = (Button)rootView.findViewById(R.id.button4);
        Button graph22 = (Button)rootView.findViewById(R.id.button5);
        Button graph23 = (Button)rootView.findViewById(R.id.button6);
        Button graph31 = (Button)rootView.findViewById(R.id.button7);
        Button graph32 = (Button)rootView.findViewById(R.id.button8);
        Button graph33 = (Button)rootView.findViewById(R.id.button9);


        graph11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Graph11.class);
                startActivity(intent);
            }
        });

        graph12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Graph12.class);
                startActivity(intent);
            }
        });

        graph13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Graph13.class);
                startActivity(intent);
            }
        });

        graph21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Graph21.class);
                startActivity(intent);
            }
        });

        graph22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Graph22.class);
                startActivity(intent);
            }
        });

        graph23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Graph23.class);
                startActivity(intent);
            }
        });

        graph31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Graph31.class);
                startActivity(intent);
            }
        });

        graph32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Graph32.class);
                startActivity(intent);
            }
        });

        graph33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Graph33.class);
                startActivity(intent);
            }
        });

        return rootView;
    }


}
