package com.example.android.uitest.LoginFiles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.android.uitest.R;
import com.example.android.uitest.ui.share.ShareViewModel;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class DisplayProfile extends AppCompatActivity {

    private ShareViewModel shareViewModel;
    private TextView profileName,profileEmail,profileNumber;
    private Button profileUpdate,changePassword;
    private FirebaseAuth firebaseAuth;
    private FirebaseDatabase firebaseDatabase;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_profile);
           //shareViewModel = ViewModelProviders.of(this).get(ShareViewModel.class);
        //final TextView textView = root.findViewById(R.id.text_share);
       /* shareViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/

        profileName = (TextView) findViewById(R.id.ProfileName);
        profileEmail=(TextView) findViewById(R.id.ProfileEmail);
        changePassword = (Button) findViewById(R.id.changePassword);
        profileNumber = (TextView) findViewById(R.id.ProfileNumber);
        profileUpdate = (Button)findViewById(R.id.editProfile) ;
        firebaseAuth = FirebaseAuth.getInstance();
        firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = firebaseDatabase.getReference(firebaseAuth.getUid());
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Profile profile = dataSnapshot.getValue(Profile.class);
                profileName.setText("Name :"+profile.getUserName());

                profileEmail.setText("Email :"+profile.getUserEmail());
                profileNumber.setText("Mobile Number. :" +profile.getUserNo());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(DisplayProfile.this,databaseError.getCode(),Toast.LENGTH_SHORT).show();


            }
        });
        profileUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DisplayProfile.this, UpdateProfile.class));
            }
        });
        changePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DisplayProfile.this, Password.class));
            }
        });

    }
}