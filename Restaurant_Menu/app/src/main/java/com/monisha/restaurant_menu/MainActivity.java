package com.monisha.restaurant_menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    Button button;
    RadioButton r1,r2,r3,r4,r5,r6,r7,r8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.bt);
        r1=(RadioButton) findViewById(R.id.r1);
        r2=(RadioButton) findViewById(R.id.r2);
        r3=(RadioButton) findViewById(R.id.r3);
        r4=(RadioButton) findViewById(R.id.r4);
        r5=(RadioButton) findViewById(R.id.r5);
        r6=(RadioButton) findViewById(R.id.r6);
        r7=(RadioButton) findViewById(R.id.r7);
        r8=(RadioButton) findViewById(R.id.r8);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this,Order.class);

                if (r1.isChecked()){
                    in.putExtra("r1","1");
                }else {
                    in.putExtra("r1","0");
                }
                if (r2.isChecked()){
                    in.putExtra("r2","2");
                }else {
                    in.putExtra("r2","0");
                }
                if (r3.isChecked()){
                    in.putExtra("r3","3");
                }else {
                    in.putExtra("r3","0");
                }
                if (r4.isChecked()){
                    in.putExtra("r4","4");
                }else {
                    in.putExtra("r4","0");
                }
                if (r5.isChecked()){
                    in.putExtra("r5","5");
                }else {
                    in.putExtra("r5","0");
                }
                if (r6.isChecked()){
                    in.putExtra("r6","6");
                }else {
                    in.putExtra("r6","0");
                }
                if (r7.isChecked()){
                    in.putExtra("r7","7");
                }else {
                    in.putExtra("r7","0");
                }
                if (r8.isChecked()){
                    in.putExtra("r8","8");
                }else {
                    in.putExtra("r8","0");
                }

                startActivity(in);

            }
        });
    }
}
