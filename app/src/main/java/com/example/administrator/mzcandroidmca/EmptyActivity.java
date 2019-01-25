package com.example.administrator.mzcandroidmca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class EmptyActivity extends AppCompatActivity {
ListView lv;
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty);
        lv=(ListView)findViewById(R.id.listview);
        String[] Students={"rahul","ram","remya"};
        ArrayAdapter adapter=new ArrayAdapter(getApplicationContext(),R.layout.list_item,Students);
        lv.setAdapter(adapter);
    }
}
