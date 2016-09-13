package com.example.markos.baisicuicontrols1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectButtonAction(View view){
        RadioGroup rg = (RadioGroup) findViewById(R.id.foodRadioGroup);
        int id = rg.getCheckedRadioButtonId();
        RadioButton rb = (RadioButton) findViewById(id);
        String text = rb.getText().toString();
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }
}
