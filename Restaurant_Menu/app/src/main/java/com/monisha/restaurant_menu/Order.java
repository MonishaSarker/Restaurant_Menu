package com.monisha.restaurant_menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Order extends AppCompatActivity {

    TextView t1,t2,t3;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        t1=(TextView) findViewById(R.id.t1);
        t2=(TextView) findViewById(R.id.t2);
        t3=(TextView) findViewById(R.id.t3);
        button=(Button) findViewById(R.id.b1);

        String r1 = getIntent().getExtras().getString("r1");
        String r2 = getIntent().getExtras().getString("r2");
        String r3 = getIntent().getExtras().getString("r3");
        String r4 = getIntent().getExtras().getString("r4");
        String r5 = getIntent().getExtras().getString("r5");
        String r6 = getIntent().getExtras().getString("r6");
        String r7 = getIntent().getExtras().getString("r7");
        String r8 = getIntent().getExtras().getString("r8");
        String Items = "";
        int Price=0,UsdPrice;
        if (r1.equals("1")){
            Items+="Big Beef\n";
            Price+=230;
        }

        if (r2.equals("2")){
            Items+="Cheese Fries\n";
            Price+=180;
        }
        if (r3.equals("3")){
            Items+="Chili Cheese Fries\n";
            Price+=340;
        }
        if (r4.equals("4")){
            Items+="Chili Bowl\n";
            Price+=350;
        }
        if (r5.equals("5")){
            Items+="Garden Salad\n";
            Price+=200;
        }
        if (r6.equals("6")){
            Items+="Beef Burger\n";
            Price+=300;
        }
        if (r7.equals("7")){
            Items+="House Beef Burger\n";
            Price+=340;
        }
        if (r8.equals("8")){
            Items+="Chicken Burger\n";
            Price+=300;
        }
        t1.setText(Items);
        t2.setText(Integer.toString(Price)+" TK/-\n"+Integer.toString(Price/80)+"$ USD");
    }
}
