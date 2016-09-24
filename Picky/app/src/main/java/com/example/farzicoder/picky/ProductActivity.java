package com.example.farzicoder.picky;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductActivity extends AppCompatActivity {
    String [] arrProduct = {
            "Broccoli",
            "Vegetables",
            "Drinks",
            "Bakery Products",
            "Produces",
            "Grains"
    };
    Integer [] arrProductImage = {
            R.drawable.broccoli,
            R.drawable.carrot,
            R.drawable.coffee_cup,
            R.drawable.doughnut,
            R.drawable.food,
            R.drawable.fruit
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        Bundle extra = getIntent().getExtras();
        int i = Integer.parseInt(extra.getString("id"));
        ImageView img = (ImageView)findViewById(R.id.itemImage);
        img.setImageResource(arrProductImage[i]);

        TextView tv = (TextView) findViewById(R.id.itemName);
        tv.setText(arrProduct[i]);

//        switch (){
//            case 0:
//                ImageView img = (ImageView)findViewById(R.id.itemImage);
//                img.setImageResource(arrProductImage[0]);
//                TextView tv = (TextView) findViewById(R.id.itemName);
//                tv.setText(arrProduct[0]);
//
//                break;
//            case 1:
//                break;
//            case 2:
//                break;
//            case 3:
//                break;
//            case 4:
//                break;
//            case 5:
//                break;
//        }
    }
}
