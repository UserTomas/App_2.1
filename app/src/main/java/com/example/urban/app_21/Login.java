package com.example.urban.app_21;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        AutoCompleteTextView ac = (AutoCompleteTextView) findViewById(R.id.login);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, new String[]
                {"Pasi","Tomas","Kari","Jouni","Esa","Hannu"});
        ac.setAdapter(aa);
    }

    public void onBtnLoginClick(View view){
        EditText text = (EditText) findViewById(R.id.login);
        EditText pass = (EditText) findViewById(R.id.pass);
        StringBuilder sb = new StringBuilder();
        sb.append(text.getText().toString());
        sb.append(" ");
        sb.append(pass.getText().toString());
        Toast.makeText(getApplicationContext(),sb ,Toast.LENGTH_SHORT).show();
    }
}
