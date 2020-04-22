package com.example.android.uitest.ui.tools;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.android.uitest.R;

public class ToolsFragment extends AppCompatActivity {

    private TextView hi;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_app);
        hi = findViewById(R.id.text_tools);
    }
}