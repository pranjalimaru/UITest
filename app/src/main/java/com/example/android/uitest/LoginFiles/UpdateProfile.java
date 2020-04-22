package com.example.android.uitest.LoginFiles;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.android.uitest.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class UpdateProfile extends AppCompatActivity {


    private EditText newUserName,newProfileNumber;
    private Button save;
    FirebaseDatabase firebaseDatabase;
    FirebaseAuth firebaseAuth;
    String newUserEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_profile);

        newUserName=(EditText) findViewById(R.id.changeProfileName);
        newProfileNumber=findViewById(R.id.changeProfileNumber);
        save = (Button) findViewById(R.id.changeProfile);

        firebaseAuth = FirebaseAuth.getInstance();
        firebaseDatabase = FirebaseDatabase.getInstance();
        final DatabaseReference databaseReference = firebaseDatabase.getReference(firebaseAuth.getUid());
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Profile Profile = dataSnapshot.getValue(Profile.class);

                newUserName.setText(Profile.getUserName());
                newUserEmail = Profile.getUserEmail();
                newProfileNumber.setText(Profile.getUserNo());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(UpdateProfile.this,databaseError.getCode(),Toast.LENGTH_SHORT).show();


            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = newUserEmail;
                String name = newUserName.getText().toString();


                String number = newProfileNumber.getText().toString();
                Profile profile = new Profile(email,name,number);
                databaseReference.setValue(profile);
                finish();
            }
        });


    }
}
