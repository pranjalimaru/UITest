package com.example.android.uitest.ui.send;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.android.uitest.LoginFiles.Login;
import com.example.android.uitest.R;
import com.google.firebase.auth.FirebaseAuth;

public class SendFragment extends AppCompatActivity {
    private Button logout;
    private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);

        logout = (Button) findViewById(R.id.LogoutButton);
        firebaseAuth = FirebaseAuth.getInstance();

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firebaseAuth.signOut();
                finish();
                startActivity(new Intent(com.example.android.uitest.ui.send.SendFragment.this, Login.class));
            }
        });
    }
}
