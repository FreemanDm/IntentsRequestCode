package com.freeman.intents.intentsrequestcode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PhoneActivity extends AppCompatActivity implements View.OnClickListener {
    EditText inputPhone;
    Button saveBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);
        inputPhone = (EditText) findViewById(R.id.input_phone);
        saveBtn = (Button) findViewById(R.id.save_phone_btn);
        saveBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.save_phone_btn){
            Intent intent = new Intent();
            intent.putExtra("PHONE",String.valueOf(inputPhone.getText()));
            setResult(RESULT_OK,intent);
            finish();
        }
    }
}
