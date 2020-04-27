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
import com.example.android.uitest.Sikkim.sik11;
import com.example.android.uitest.Sikkim.sik12;
import com.example.android.uitest.Sikkim.sik13;
import com.example.android.uitest.Sikkim.sik21;
import com.example.android.uitest.Sikkim.sik22;
import com.example.android.uitest.Sikkim.sik23;
import com.example.android.uitest.Sikkim.sik31;
import com.example.android.uitest.Sikkim.sik32;
import com.example.android.uitest.Sikkim.sik33;
import com.example.android.uitest.TamilNadu.tn11;
import com.example.android.uitest.TamilNadu.tn12;
import com.example.android.uitest.TamilNadu.tn13;
import com.example.android.uitest.TamilNadu.tn21;
import com.example.android.uitest.TamilNadu.tn22;
import com.example.android.uitest.TamilNadu.tn23;
import com.example.android.uitest.TamilNadu.tn31;
import com.example.android.uitest.TamilNadu.tn32;
import com.example.android.uitest.TamilNadu.tn33;
import com.example.android.uitest.Tripura.tri11;
import com.example.android.uitest.Tripura.tri12;
import com.example.android.uitest.Tripura.tri13;
import com.example.android.uitest.Tripura.tri21;
import com.example.android.uitest.Tripura.tri22;
import com.example.android.uitest.Tripura.tri23;
import com.example.android.uitest.Tripura.tri31;
import com.example.android.uitest.Tripura.tri32;
import com.example.android.uitest.Tripura.tri33;
import com.example.android.uitest.Uttrakhand.utr11;
import com.example.android.uitest.Uttrakhand.utr12;
import com.example.android.uitest.Uttrakhand.utr13;
import com.example.android.uitest.Uttrakhand.utr21;
import com.example.android.uitest.Uttrakhand.utr22;
import com.example.android.uitest.Uttrakhand.utr23;
import com.example.android.uitest.Uttrakhand.utr31;
import com.example.android.uitest.Uttrakhand.utr32;
import com.example.android.uitest.Uttrakhand.utr33;

public class UttrakhandFront extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uttrakhand_front);

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
                Intent intent = new Intent(UttrakhandFront.this, utr11.class);
                startActivity(intent);
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UttrakhandFront.this, utr12.class);
                startActivity(intent);

            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UttrakhandFront.this, utr13.class);
                startActivity(intent);

            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UttrakhandFront.this, utr21.class);
                startActivity(intent);

            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UttrakhandFront.this, utr22.class);
                startActivity(intent);

            }
        });

        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UttrakhandFront.this, utr23.class);
                startActivity(intent);

            }
        });


        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UttrakhandFront.this, utr31.class);
                startActivity(intent);
            }
        });

        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UttrakhandFront.this, utr32.class);
                startActivity(intent);
            }
        });


        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UttrakhandFront.this, utr33.class);
                startActivity(intent);

            }
        });

    }
}
