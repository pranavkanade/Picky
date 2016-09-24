package com.example.farzicoder.picky;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ItemListActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_item_list);

        ListView listView = (ListView) findViewById(R.id.listOfProducts);
        CustomList adapter = new CustomList(this, arrProduct, arrProductImage);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            //adapterView => listview which is being clicked
            // view => perticular item on which we clicked
            // int i => index which is being clicked
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ItemListActivity.this, ProductActivity.class).putExtra("id", Integer.toString(i));
                startActivity(intent);
            }
        });
    }
}
