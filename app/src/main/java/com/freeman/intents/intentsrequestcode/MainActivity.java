package com.freeman.intents.intentsrequestcode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView nameTxt, phoneTxt;
    Button setNameBtn, setPhoneBtn;
    public static final int ACTIVITY_NAME_REQUEST_CODE = 0x01;
    public static final int ACTIVITY_PHONE_REQUEST_CODE = 0x02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameTxt = (TextView) findViewById(R.id.name_txt);
        phoneTxt = (TextView) findViewById(R.id.phone_txt);
        setNameBtn = (Button) findViewById(R.id.set_name_btn);
        setPhoneBtn = (Button) findViewById(R.id.set_phone_btn);
        setNameBtn.setOnClickListener(this);
        setPhoneBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.set_name_btn){
            Intent intent = new Intent(this, NameActivity.class);
            startActivityForResult(intent, ACTIVITY_NAME_REQUEST_CODE);
        }
        else if (v.getId() == R.id.set_phone_btn){
            Intent intent = new Intent(this, PhoneActivity.class);
            startActivityForResult(intent, ACTIVITY_PHONE_REQUEST_CODE);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK){
            if (requestCode == ACTIVITY_NAME_REQUEST_CODE){
                nameTxt.setText(data.getExtras().getString("NAME"));
            }else if (requestCode == ACTIVITY_PHONE_REQUEST_CODE){
                phoneTxt.setText(data.getExtras().getString("PHONE"));
            }
        }
    }
}
