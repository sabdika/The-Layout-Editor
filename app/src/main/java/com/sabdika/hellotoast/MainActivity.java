package com.sabdika.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button countButton,button_zero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        countButton = (Button) findViewById(R.id.button_count);
        button_zero = (Button) findViewById(R.id.button_zero);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        ++mCount;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
        if(mCount%2 !=0){
            countButton.setBackgroundColor(getResources().getColor(R.color.teal_700));
            button_zero.setBackgroundColor(getResources().getColor(R.color.pink));
        }
        else{
            countButton.setBackgroundColor(getResources().getColor(R.color.blue));
        }
    }


    public void zeroBtn(View view) {
        mCount = 0;
        mShowCount.setText(Integer.toString(mCount));
        button_zero.setBackgroundColor(getResources().getColor(R.color.grey));
    }
}