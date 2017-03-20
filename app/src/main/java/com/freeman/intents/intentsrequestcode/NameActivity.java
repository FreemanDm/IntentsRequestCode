package com.freeman.intents.intentsrequestcode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NameActivity extends AppCompatActivity implements View.OnClickListener {
    EditText inputName;
    Button saveBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
        inputName = (EditText) findViewById(R.id.input_name_text);
        saveBtn = (Button) findViewById(R.id.save_name_btn);
        saveBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.save_name_btn){
            Intent intent = new Intent();
            intent.putExtra("NAME", String.valueOf(inputName.getText()));
            setResult(RESULT_OK, intent);
            finish();
        }
    }
}
