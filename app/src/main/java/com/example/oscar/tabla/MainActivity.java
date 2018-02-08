package com.example.oscar.tabla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button  button;
    EditText editText;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = (Button)findViewById(R.id.button);
        editText = (EditText)findViewById(R.id.editText);
        textView = (TextView)findViewById(R.id.textView);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText( editText.getText().toString() + " x "+ " 1" + " = "+ (Integer.parseInt(editText.getText().toString())*1)+"\n");
                textView.setText( editText.getText().toString() + " x "+ " 2" + " = "+ (Integer.parseInt(editText.getText().toString())*2)+"\n");
                textView.setText( editText.getText().toString() + " x "+ " 3" + " = "+ (Integer.parseInt(editText.getText().toString())*3)+"\n");
                textView.setText( editText.getText().toString() + " x "+ " 4" + " = "+ (Integer.parseInt(editText.getText().toString())*4)+"\n");
                textView.setText( editText.getText().toString() + " x "+ " 5" + " = "+ (Integer.parseInt(editText.getText().toString())*5)+"\n");
                textView.setText( editText.getText().toString() + " x "+ " 6" + " = "+ (Integer.parseInt(editText.getText().toString())*6)+"\n");
                textView.setText( editText.getText().toString() + " x "+ " 7" + " = "+ (Integer.parseInt(editText.getText().toString())*7)+"\n");
                textView.setText( editText.getText().toString() + " x "+ " 8" + " = "+ (Integer.parseInt(editText.getText().toString())*8)+"\n");
                textView.setText( editText.getText().toString() + " x "+ " 9" + " = "+ (Integer.parseInt(editText.getText().toString())*9)+"\n");
                textView.setText( editText.getText().toString() + " x "+ " 10" + " = "+ (Integer.parseInt(editText.getText().toString())*10)+"\n");

            }

        });

    }



}
