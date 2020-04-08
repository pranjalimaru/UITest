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
public class three extends Fragment {

    Context context;

    public three() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_three, container, false);
        context = rootView.getContext();

        Button graph113 = (Button)rootView.findViewById(R.id.button);
        Button graph123 = (Button)rootView.findViewById(R.id.button2);
        Button graph133 = (Button)rootView.findViewById(R.id.button3);
        Button graph213 = (Button)rootView.findViewById(R.id.button4);
        Button graph223 = (Button)rootView.findViewById(R.id.button5);
        Button graph233 = (Button)rootView.findViewById(R.id.button6);
        Button graph313 = (Button)rootView.findViewById(R.id.button7);
        Button graph323 = (Button)rootView.findViewById(R.id.button8);
        Button graph333 = (Button)rootView.findViewById(R.id.button9);


        graph113.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Graph113.class);
                startActivity(intent);
            }
        });

        graph123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Graph123.class);
                startActivity(intent);
            }
        });

        graph133.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Graph133.class);
                startActivity(intent);
            }
        });

        graph213.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Graph213.class);
                startActivity(intent);
            }
        });

        graph223.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Graph223.class);
                startActivity(intent);
            }
        });

        graph233.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Graph233.class);
                startActivity(intent);
            }
        });

        graph313.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Graph313.class);
                startActivity(intent);
            }
        });

        graph323.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Graph323.class);
                startActivity(intent);
            }
        });

        graph333.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Graph333.class);
                startActivity(intent);
            }
        });

        return rootView;
    }


}
