package com.codebakery.joan.trybuttontoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
/*
    public void onClickWidget(View view) {
        Button button = (Button) view;
        Toast.makeText(view.getContext(), button.getText().toString(), Toast.LENGTH_SHORT).show();
    }
*/

    public void onClickWidget(View view) {
        int id = view.getId();
        String text = null;
        switch(id) {
            case R.id.button1:
                text = ((Button)view).getText().toString();
                break;
            case R.id.button2:
                text = ((Button)view).getText().toString();
                break;
            case R.id.toggleButton:
                text = (((ToggleButton)view).isChecked())
                        ? ((ToggleButton)view).getTextOn().toString() : ((ToggleButton)view).getTextOff().toString();
                break;
                default: text = "Nothing";
        }
        Toast.makeText(view.getContext(), text, Toast.LENGTH_SHORT).show();
    }
}
