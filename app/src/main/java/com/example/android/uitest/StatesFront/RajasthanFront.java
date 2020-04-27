package com.example.android.uitest.StatesFront;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.android.uitest.AndamanNicobar.AndamanNicobar11;
import com.example.android.uitest.AndamanNicobar.AndamanNicobar12;
import com.example.android.uitest.AndamanNicobar.AndamanNicobar13;
import com.example.android.uitest.AndamanNicobar.AndamanNicobar21;
import com.example.android.uitest.AndamanNicobar.AndamanNicobar22;
import com.example.android.uitest.AndamanNicobar.AndamanNicobar23;
import com.example.android.uitest.AndamanNicobar.AndamanNicobar31;
import com.example.android.uitest.AndamanNicobar.AndamanNicobar32;
import com.example.android.uitest.AndamanNicobar.AndamanNicobar33;
import com.example.android.uitest.Delhi.Delhi11;
import com.example.android.uitest.Delhi.Delhi12;
import com.example.android.uitest.Delhi.Delhi13;
import com.example.android.uitest.Delhi.Delhi21;
import com.example.android.uitest.Delhi.Delhi22;
import com.example.android.uitest.Delhi.Delhi23;
import com.example.android.uitest.Delhi.Delhi31;
import com.example.android.uitest.Delhi.Delhi32;
import com.example.android.uitest.Delhi.Delhi33;
import com.example.android.uitest.Gujarat.Gujarat11;
import com.example.android.uitest.Gujarat.Gujarat12;
import com.example.android.uitest.Gujarat.Gujarat13;
import com.example.android.uitest.Gujarat.Gujarat21;
import com.example.android.uitest.Gujarat.Gujarat22;
import com.example.android.uitest.Gujarat.Gujarat23;
import com.example.android.uitest.Gujarat.Gujarat31;
import com.example.android.uitest.Gujarat.Gujarat32;
import com.example.android.uitest.Gujarat.Gujarat33;
import com.example.android.uitest.Odisha.odisha11;
import com.example.android.uitest.Odisha.odisha12;
import com.example.android.uitest.Odisha.odisha13;
import com.example.android.uitest.Odisha.odisha21;
import com.example.android.uitest.Odisha.odisha22;
import com.example.android.uitest.Odisha.odisha23;
import com.example.android.uitest.Odisha.odisha31;
import com.example.android.uitest.Odisha.odisha32;
import com.example.android.uitest.Odisha.odisha33;
import com.example.android.uitest.Puducherry.pdy11;
import com.example.android.uitest.Puducherry.pdy12;
import com.example.android.uitest.Puducherry.pdy13;
import com.example.android.uitest.Puducherry.pdy21;
import com.example.android.uitest.Puducherry.pdy22;
import com.example.android.uitest.Puducherry.pdy23;
import com.example.android.uitest.Puducherry.pdy31;
import com.example.android.uitest.Puducherry.pdy32;
import com.example.android.uitest.Puducherry.pdy33;
import com.example.android.uitest.Punjab.pj11;
import com.example.android.uitest.Punjab.pj12;
import com.example.android.uitest.Punjab.pj13;
import com.example.android.uitest.Punjab.pj21;
import com.example.android.uitest.Punjab.pj22;
import com.example.android.uitest.Punjab.pj23;
import com.example.android.uitest.Punjab.pj31;
import com.example.android.uitest.Punjab.pj32;
import com.example.android.uitest.Punjab.pj33;
import com.example.android.uitest.R;
import com.example.android.uitest.Rajasthan.rjs11;
import com.example.android.uitest.Rajasthan.rjs12;
import com.example.android.uitest.Rajasthan.rjs13;
import com.example.android.uitest.Rajasthan.rjs21;
import com.example.android.uitest.Rajasthan.rjs22;
import com.example.android.uitest.Rajasthan.rjs23;
import com.example.android.uitest.Rajasthan.rjs31;
import com.example.android.uitest.Rajasthan.rjs32;
import com.example.android.uitest.Rajasthan.rjs33;

public class RajasthanFront extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajasthan_front);

        Button button11 = findViewById(R.id.button1);
        Button button12 = findViewById(R.id.button2);
        Button button13 = findViewById(R.id.button3);
        Button button21 = findViewById(R.id.button4);
        Button button22 = findViewById(R.id.button5);
        Button button23 = findViewById(R.id.button6);
        Button button31 = findViewById(R.id.button7);
        Button button32 = findViewById(R.id.button8);
        Button button33 = findViewById(R.id.button9);

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RajasthanFront.this, rjs11.class);
                startActivity(intent);
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RajasthanFront.this, rjs12.class);
                startActivity(intent);

            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RajasthanFront.this, rjs13.class);
                startActivity(intent);

            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RajasthanFront.this, rjs21.class);
                startActivity(intent);

            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RajasthanFront.this, rjs22.class);
                startActivity(intent);

            }
        });

        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RajasthanFront.this, rjs23.class);
                startActivity(intent);

            }
        });


        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RajasthanFront.this, rjs31.class);
                startActivity(intent);
            }
        });

        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RajasthanFront.this, rjs32.class);
                startActivity(intent);
            }
        });


        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RajasthanFront.this, rjs33.class);
                startActivity(intent);

            }
        });

    }
}
