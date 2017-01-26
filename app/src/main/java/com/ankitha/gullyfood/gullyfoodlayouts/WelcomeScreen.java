package com.ankitha.gullyfood.gullyfoodlayouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WelcomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_screen);
    }

    public void getStarted(View view){
        Intent intent = new Intent(this,GetStarted.class);
        startActivity(intent);
    }

    public void termsOfUse(View view){
        Intent intent = new Intent(WelcomeScreen.this,TermsOfUse.class);
        startActivity(intent);
    }

    public void privacyPolicy(View view){
        Intent intent = new Intent(WelcomeScreen.this,PrivacyPolicy.class);
        startActivity(intent);
    }
}
