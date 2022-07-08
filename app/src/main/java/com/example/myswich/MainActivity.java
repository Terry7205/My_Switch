package com.example.myswich;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout layout1 ; 
    RadioButton radio_bt1, radio_bt2, radio_bt3 ; 
    ImageView img_view ; 
    Button btn_exit, btn_begin ;
    Boolean visible = false ;
    Switch sw1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        layout1 = findViewById(R.id.layout_1) ; 
        img_view = findViewById(R.id.img_view) ; 
        sw1 = findViewById(R.id.switch1) ;
        findViewById(R.id.radio_button1).setOnClickListener(this);
        findViewById(R.id.radio_button2).setOnClickListener(this);
        findViewById(R.id.radio_button3).setOnClickListener(this);
        findViewById(R.id.btn_begin).setOnClickListener(this);
        findViewById(R.id.btn_exit).setOnClickListener(this);
        
        findViewById(R.id.switch1).setOnClickListener(this);
    
    
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.radio_button1:
                img_view.setImageResource(R.drawable.an8);
                break ;
            case R.id.radio_button2:
                img_view.setImageResource(R.drawable.an9);
                break ;
            case R.id.radio_button3:
                img_view.setImageResource(R.drawable.an10);
                break ;
            case R.id.btn_begin:
                //sw1.setChecked(false);
                sw1.performClick() ;
                break ;
            case R.id.btn_exit:
                break ;
            case R.id.switch1:
                if(sw1.isChecked()){
                    layout1.setVisibility(view.VISIBLE);
                }
                else {
                    layout1.setVisibility(view.INVISIBLE);
                }

                //if (visible == false) {
                //layout1.setVisibility(View.VISIBLE);
                //visible = true ;
                //}
                //else {
                //layout1.setVisibility(view.INVISIBLE);
                //visible = false ;
                //}
                break ;

        }
            
    }
}