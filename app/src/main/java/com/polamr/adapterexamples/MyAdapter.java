package com.polamr.adapterexamples;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Rajareddy on 04/12/15.
 */
public class MyAdapter extends BaseAdapter {

    private Context mContext ;
    private ArrayList<String> listData;

    public MyAdapter(Context context , ArrayList<String> data) {
        super();
        //LogUtils.show("MyAdapter");
        this.mContext = context;
        this.listData = data;
    }
    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        LogUtils.show("getView : "+position);
        //LogUtils.show("getView : "+listData[position]);
        if(view == null) {
            LogUtils.show("getView null view : "+position);
            view = LayoutInflater.from(mContext).inflate(R.layout.layout, parent, false);
        }
        TextView tv = (TextView) view.findViewById(R.id.textView);
        tv.setText(listData.get(position));
        return view;
    }
}
