package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {

    Button btnsubmit;
    EditText edtname,edtsurname,edtbirth,edtage,edtfather,edtmother,edtbrother,edtsister,edtmobile,edtemail,edtaddress,edtqualification,edtoccupation;
    CheckBox chkwrite,chkswim,chkread,chkcricket,chkc,chkcc,chkjava;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        initBinding();
        initOnClick();
    }
    void initBinding()
    {
        btnsubmit=findViewById(R.id.btnsubmit);
        edtname=findViewById(R.id.edtname);
        edtsurname=findViewById(R.id.edtsurname);
        edtbirth=findViewById(R.id.edtbirth);
        edtage=findViewById(R.id.edtage);
        edtfather=findViewById(R.id.edtfather);
        edtmother=findViewById(R.id.edtmother);
        edtbrother=findViewById(R.id.edtbrother);
        edtsister=findViewById(R.id.edtsister);
        edtmobile=findViewById(R.id.edtmobile);
        edtemail=findViewById(R.id.edtemail);
        edtaddress=findViewById(R.id.edtaddress);
        edtqualification=findViewById(R.id.edtqualification);
        edtoccupation=findViewById(R.id.edtoccupation);
        chkwrite=findViewById(R.id.chkwrite);
        chkswim=findViewById(R.id.chkswim);
        chkread=findViewById(R.id.chkread);
        chkcricket=findViewById(R.id.chkcricket);
        chkc=findViewById(R.id.chkc);
        chkcc=findViewById(R.id.chkcc);
        chkjava=findViewById(R.id.chkjava);



    }
    void initOnClick()
    {

    }

}