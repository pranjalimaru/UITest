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
import com.example.android.uitest.Bihar.Bihar11;
import com.example.android.uitest.Bihar.Bihar12;
import com.example.android.uitest.Bihar.Bihar13;
import com.example.android.uitest.Bihar.Bihar21;
import com.example.android.uitest.Bihar.Bihar22;
import com.example.android.uitest.Bihar.Bihar23;
import com.example.android.uitest.Bihar.Bihar31;
import com.example.android.uitest.Bihar.Bihar32;
import com.example.android.uitest.Bihar.Bihar33;
import com.example.android.uitest.Chhatisgarh.Chhatisgarh11;
import com.example.android.uitest.Chhatisgarh.Chhatisgarh12;
import com.example.android.uitest.Chhatisgarh.Chhatisgarh13;
import com.example.android.uitest.Chhatisgarh.Chhatisgarh21;
import com.example.android.uitest.Chhatisgarh.Chhatisgarh22;
import com.example.android.uitest.Chhatisgarh.Chhatisgarh23;
import com.example.android.uitest.Chhatisgarh.Chhatisgarh31;
import com.example.android.uitest.Chhatisgarh.Chhatisgarh32;
import com.example.android.uitest.Chhatisgarh.Chhatisgarh33;
import com.example.android.uitest.Gujarat.Gujarat11;
import com.example.android.uitest.Gujarat.Gujarat12;
import com.example.android.uitest.Gujarat.Gujarat13;
import com.example.android.uitest.Gujarat.Gujarat21;
import com.example.android.uitest.Gujarat.Gujarat22;
import com.example.android.uitest.Gujarat.Gujarat23;
import com.example.android.uitest.Gujarat.Gujarat31;
import com.example.android.uitest.Gujarat.Gujarat32;
import com.example.android.uitest.Gujarat.Gujarat33;
import com.example.android.uitest.R;

public class ChhatisgarhFront extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chhatisgarh_front);

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
                Intent intent = new Intent(ChhatisgarhFront.this, Chhatisgarh11.class);
                startActivity(intent);
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChhatisgarhFront.this, Chhatisgarh12.class);
                startActivity(intent);

            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChhatisgarhFront.this, Chhatisgarh13.class);
                startActivity(intent);

            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChhatisgarhFront.this, Chhatisgarh21.class);
                startActivity(intent);

            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChhatisgarhFront.this, Chhatisgarh22.class);
                startActivity(intent);

            }
        });

        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChhatisgarhFront.this, Chhatisgarh23.class);
                startActivity(intent);

            }
        });


        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChhatisgarhFront.this, Chhatisgarh31.class);
                startActivity(intent);
            }
        });

        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChhatisgarhFront.this, Chhatisgarh32.class);
                startActivity(intent);
            }
        });


        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChhatisgarhFront.this, Chhatisgarh33.class);
                startActivity(intent);

            }
        });

    }
}
