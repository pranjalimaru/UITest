package com.example.android.uitest.LoginFiles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.android.uitest.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Register extends AppCompatActivity {

    private EditText userName, userPassword, userConfirmPassword, userEmail, userNo;
    private TextView userLogin;
    private Button regButton;
    private FirebaseAuth firebaseAuth;

    String name, password, confirmPassword, email, mobileNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        setupUIviews();
        FirebaseApp.initializeApp(this);

        firebaseAuth = FirebaseAuth.getInstance();

        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validate()) {
                    String user_email = userEmail.getText().toString().trim();
                    String user_password = userPassword.getText().toString().trim();
                    firebaseAuth.createUserWithEmailAndPassword(user_email,user_password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                sendEmailVerification();
                                finish();
                            } else
                            {
                                FirebaseAuthException e = (FirebaseAuthException )task.getException();
                                Toast.makeText(Register.this, "Failed Registration: "+e.getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });

        userLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abc= new Intent(Register.this, Login.class);
                startActivity(abc);

            }
        });


    }

    private void setupUIviews(){
        userName = (EditText) findViewById(R.id.name);
        userPassword = (EditText) findViewById(R.id.password);
        userEmail= (EditText)findViewById(R.id.emailID);
        regButton = (Button) findViewById(R.id.signup);
        userLogin = (TextView) findViewById(R.id.login_now);
        userConfirmPassword = (EditText)findViewById(R.id.confirm_password);
        userNo = (EditText)findViewById(R.id.mobileNo);


    }


    public boolean validate()
    {

        Boolean result = false;

        name = userName.getText().toString();
        password = userPassword.getText().toString();
        email = userEmail.getText().toString();
        mobileNo = userNo.getText().toString();
        final String EMAIL_PATTERN ="^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        final Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        final Matcher matcher = pattern.matcher(email);
        boolean isEmailValid=matcher.matches();

        if(name.isEmpty() || password.isEmpty() || email.isEmpty() || !isEmailValid) {

            if (!isEmailValid) {


                Toast.makeText(this, "Enter valid email id", Toast.LENGTH_LONG).show();
            }

            else {

                Toast.makeText(this, "Please enter all the details", Toast.LENGTH_SHORT);

                startActivity(new Intent(Register.this, Login.class));

            }

        }

        else
        {
            if(password.length()<6)
                Toast.makeText(this,"Password should be of at least 6 characters",Toast.LENGTH_LONG).show();
             else
                result =true;
        }
        return result;
    }

/*    ///VALIDATE FUNCTION FOR TESTING-----------------------------------------------------------
    public boolean validate()
    {
        Boolean result = false;
        String n = this.name;
       String p = this.password;
        String e = this.email;
        String a = this.age;

        final String EMAIL_PATTERN ="^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        final Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        final Matcher matcher = pattern.matcher(email);
        boolean isEmailValid=matcher.matches();
        if(name.isEmpty() || password.isEmpty() || email.isEmpty() || age.isEmpty() || !isEmailValid) {

            result=false;
        }
        else
        {
            if(password.length()<6)
                result = false;
            else if(Integer.parseInt(age) <= 0) {
                result = false;
                //Toast.makeText(this,"Age can't be non-positive number",Toast.LENGTH_LONG).show();
            } else
                result =true;
        }
        return result;
    }
//    ----------------------------------------------------------------------------------------

*/


    private void sendEmailVerification() {
        FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();
        if (firebaseUser != null) {
            firebaseUser.sendEmailVerification().addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {
                    if (task.isSuccessful()) {
                        sendUserData();
                        Toast.makeText(Register.this, "Registration successful,Verification mail sent", Toast.LENGTH_SHORT).show();
                        firebaseAuth.signOut();
                        finish();
                        startActivity(new Intent(Register.this, ProfileActivity.class));
                    } else {
                        Toast.makeText(Register.this, "Please enter Valid email id", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
    private void sendUserData()
    {
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference myRef = firebaseDatabase.getReference(Objects.requireNonNull(firebaseAuth.getUid()));
        Profile profile = new Profile(email,name,mobileNo);
        myRef.setValue(profile);
    }
}

