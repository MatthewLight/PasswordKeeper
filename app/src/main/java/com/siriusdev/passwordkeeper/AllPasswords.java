package com.siriusdev.passwordkeeper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AllPasswords extends AppCompatActivity implements View.OnClickListener {

    Button switchBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_passwords);

        switchBt = (Button) findViewById(R.id.back);
        switchBt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.back:
                Intent intent = new Intent(this, PasswordKeeper.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
