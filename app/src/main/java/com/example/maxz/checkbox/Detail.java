package com.example.maxz.checkbox;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Detail extends AppCompatActivity {

    Button SaveButton;

    EditText NameEditText,TelEditText, ProductEditText;
    String NameString,TelString, ProductString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        SaveButton = (Button) findViewById(R.id.button);
        NameEditText = (EditText) findViewById(R.id.editText);
        TelEditText = (EditText) findViewById(R.id.editText2);
        ProductEditText = (EditText) findViewById(R.id.editText3);
        SaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NameString = NameEditText.getText().toString().trim();
                TelString = TelEditText.getText().toString().trim();
                ProductString = ProductEditText.getText().toString().trim();


                if (NameString.equals("") || TelString.equals("") || ProductString.equals("")) {

                    Mydialog mydialog = new Mydialog();
                    mydialog.MyDialogDetail(Detail.this,"กรุณากรอกให้ครบ","ผิดพลาด");

//

                } else {
                    Mydialog mydialog = new Mydialog();
                    mydialog.MyDialogDetail(Detail.this,"ขอบคุณครับ","จองแล้ว");

//
                }



            }
        });

    }
//
}
