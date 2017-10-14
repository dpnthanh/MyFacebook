package com.project.my.thanh.nhat.pham.dang.myfacebook;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toolbar;

public class CreateAccountActivity extends AppCompatActivity {

    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toobar_custom_createAccount);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        fragmentManager = getSupportFragmentManager();

        CreateAccount1IntroFragment createAccount1IntroFragment = new CreateAccount1IntroFragment();
        fragmentManager.beginTransaction().add(R.id.frameLayout_InputFragment_createAccountActivity, createAccount1IntroFragment).commit();


    }

}
