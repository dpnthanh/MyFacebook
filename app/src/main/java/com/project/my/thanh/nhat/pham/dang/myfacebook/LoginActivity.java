package com.project.my.thanh.nhat.pham.dang.myfacebook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    TextView txtLanguage1, txtLanguage2, txtLanguage3, txtForgotPass;
    EditText edtID, edtPass;
    Button btnLogin, btnCreatePass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtLanguage1 = (TextView) findViewById(R.id.textView_Language1_loginActivity);
        txtLanguage2 = (TextView) findViewById(R.id.textView_Language2_loginActivity);
        txtLanguage3 = (TextView) findViewById(R.id.textView_Language3_loginActivity);
        txtForgotPass = (TextView) findViewById(R.id.textView_forgotPass_loginActivity);
        edtID = (EditText) findViewById(R.id.editText_id_loginActivity);
        edtPass = (EditText) findViewById(R.id.editText_pass_loginActivity);
        btnLogin = (Button) findViewById(R.id.button_login_loginActivity);
        btnCreatePass = (Button) findViewById(R.id.button_createPassword_loginActivity);

        txtLanguage1.setOnClickListener(this);
        txtLanguage2.setOnClickListener(this);
        txtLanguage3.setOnClickListener(this);
        txtForgotPass.setOnClickListener(this);
        edtID.setOnClickListener(this);
        edtPass.setOnClickListener(this);
        btnLogin.setOnClickListener(this);
        btnCreatePass.setOnClickListener(this);

        edtID.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                Toast.makeText(LoginActivity.this, "thanh", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onClick(View view) {

        Intent intent;

        switch (view.getId()) {
            case R.id.textView_Language1_loginActivity:
                break;
            case R.id.textView_Language2_loginActivity:
                break;
            case R.id.textView_Language3_loginActivity:
                break;
            case R.id.textView_forgotPass_loginActivity:
                break;
            case R.id.editText_id_loginActivity:
                break;
            case R.id.editText_pass_loginActivity:
                break;
            case R.id.button_login_loginActivity:

                 intent = new Intent(LoginActivity.this, HomeActivity.class);
                 startActivity(intent);

                break;
            case R.id.button_createPassword_loginActivity:

                intent = new Intent(LoginActivity.this, CreateAccountActivity.class);
                startActivity(intent);

                break;
        }
    }
}
