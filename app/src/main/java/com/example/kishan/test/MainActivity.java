package com.example.kishan.test;

import android.app.Activity;
import android.inputmethodservice.KeyboardView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etjobid = (EditText) findViewById(R.id.et_jobid);
        KeyboardView mKeyBoardView = (KeyboardView) findViewById(R.id.keyboardview);
        final ViewGroup viewGroup = (ViewGroup) ((ViewGroup) this
                .findViewById(android.R.id.content)).getChildAt(0);
        CustomKeyboard mCustomKeyboard = new CustomKeyboard(this, viewGroup,
                R.id.keyboardview, R.xml.qwerty);
        mCustomKeyboard.registerEditText(etjobid.getId());
    }
}