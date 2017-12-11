package com.siriusdev.passwordkeeper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Authorization extends AppCompatActivity implements View.OnClickListener {

    Button switchBt;
    Button switchBt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.authorization);

        switchBt = (Button) findViewById(R.id.signInButton);
        switchBt.setOnClickListener(this);

        switchBt2 = (Button) findViewById(R.id.goRegistration);
        switchBt2.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.signInButton:
                Intent intent = new Intent(this, PasswordKeeper.class);
                startActivity(intent);
                break;

            case R.id.goRegistration:
                Intent intent2 = new Intent(this, Registration.class);
                startActivity(intent2);
                break;

            default:
                break;
        }
    }
}
