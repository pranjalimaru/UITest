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
import com.example.android.uitest.Gujarat.Gujarat11;
import com.example.android.uitest.Gujarat.Gujarat12;
import com.example.android.uitest.Gujarat.Gujarat13;
import com.example.android.uitest.Gujarat.Gujarat21;
import com.example.android.uitest.Gujarat.Gujarat22;
import com.example.android.uitest.Gujarat.Gujarat23;
import com.example.android.uitest.Gujarat.Gujarat31;
import com.example.android.uitest.Gujarat.Gujarat32;
import com.example.android.uitest.Gujarat.Gujarat33;
import com.example.android.uitest.Jharkhand.jh11;
import com.example.android.uitest.Jharkhand.jh12;
import com.example.android.uitest.Jharkhand.jh13;
import com.example.android.uitest.Jharkhand.jh21;
import com.example.android.uitest.Jharkhand.jh22;
import com.example.android.uitest.Jharkhand.jh23;
import com.example.android.uitest.Jharkhand.jh31;
import com.example.android.uitest.Jharkhand.jh32;
import com.example.android.uitest.Jharkhand.jh33;
import com.example.android.uitest.Karnataka.kt11;
import com.example.android.uitest.Karnataka.kt12;
import com.example.android.uitest.Karnataka.kt13;
import com.example.android.uitest.Karnataka.kt21;
import com.example.android.uitest.Karnataka.kt22;
import com.example.android.uitest.Karnataka.kt23;
import com.example.android.uitest.Karnataka.kt31;
import com.example.android.uitest.Karnataka.kt32;
import com.example.android.uitest.Karnataka.kt33;
import com.example.android.uitest.Kerala.Kerala11;
import com.example.android.uitest.Kerala.Kerala12;
import com.example.android.uitest.Kerala.Kerala13;
import com.example.android.uitest.Kerala.Kerala21;
import com.example.android.uitest.Kerala.Kerala22;
import com.example.android.uitest.Kerala.Kerala23;
import com.example.android.uitest.Kerala.Kerala31;
import com.example.android.uitest.Kerala.Kerala32;
import com.example.android.uitest.Kerala.Kerala33;
import com.example.android.uitest.MadhyaPradesh.mp11;
import com.example.android.uitest.MadhyaPradesh.mp12;
import com.example.android.uitest.MadhyaPradesh.mp13;
import com.example.android.uitest.MadhyaPradesh.mp21;
import com.example.android.uitest.MadhyaPradesh.mp22;
import com.example.android.uitest.MadhyaPradesh.mp23;
import com.example.android.uitest.MadhyaPradesh.mp31;
import com.example.android.uitest.MadhyaPradesh.mp32;
import com.example.android.uitest.MadhyaPradesh.mp33;
import com.example.android.uitest.R;

public class MadhyaPradeshFront extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madhya_pradesh_front);

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
                Intent intent = new Intent(MadhyaPradeshFront.this, mp11.class);
                startActivity(intent);
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MadhyaPradeshFront.this, mp12.class);
                startActivity(intent);

            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MadhyaPradeshFront.this, mp13.class);
                startActivity(intent);

            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MadhyaPradeshFront.this, mp21.class);
                startActivity(intent);

            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MadhyaPradeshFront.this, mp22.class);
                startActivity(intent);

            }
        });

        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MadhyaPradeshFront.this, mp23.class);
                startActivity(intent);

            }
        });


        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MadhyaPradeshFront.this, mp31.class);
                startActivity(intent);
            }
        });

        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MadhyaPradeshFront.this, mp32.class);
                startActivity(intent);
            }
        });


        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MadhyaPradeshFront.this, mp33.class);
                startActivity(intent);

            }
        });

    }
}
