package com.polamr.adapterexamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> mList = loadData();

        LogUtils.show("onCreate");

        ListView lv = (ListView) findViewById(R.id.listView);

        // custom base adapter
        MyAdapter adapter = new MyAdapter(this, mList );
        //lv.setAdapter(adapter);

        // custom array adapter
        MyArrayAdapter newAap = new MyArrayAdapter(this, R.layout.layout, mList);
        lv.setAdapter(newAap);
        //LogUtils.show("onCreate size : "+mList.size());
    }

    private ArrayList<String> loadData() {
        ArrayList<String> vList = new ArrayList<>();
        for(int i =0;i<30;i++) {
            vList.add("Items "+i);
        }
        return vList;
    }
}
