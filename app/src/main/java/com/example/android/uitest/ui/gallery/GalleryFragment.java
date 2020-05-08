package com.example.android.uitest.ui.gallery;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android.uitest.LoginFiles.Login;
import com.example.android.uitest.R;

import com.google.firebase.auth.FirebaseAuth;

public class GalleryFragment extends AppCompatActivity {
    private TextView call_now,mail_now;
    private Button logout;
    private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_gallery);
        firebaseAuth = FirebaseAuth.getInstance();
        call_now = (TextView)findViewById(R.id.call_now);
        mail_now = (TextView)findViewById(R.id.mail_now);
        call_now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "9426912731"));
                startActivity(intent);
            }
        });

        mail_now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                String[] to = {"pranjalimaru@gmail.com"};
                intent.setType("*/*");
                intent.putExtra(Intent.EXTRA_EMAIL,to);
                intent.putExtra(Intent.EXTRA_SUBJECT,"AA Data Issue");
                intent.putExtra(Intent.EXTRA_STREAM, "");
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });


    }
}
