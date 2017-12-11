package com.siriusdev.passwordkeeper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PasswordKeeper extends AppCompatActivity implements OnClickListener {

    Button switchBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        switchBt = (Button) findViewById(R.id.viewPass);
        switchBt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.viewPass:
                Intent intent = new Intent(this, AllPasswords.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

}





