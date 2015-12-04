package com.polamr.adapterexamples;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Rajareddy on 04/12/15.
 */
public class MyArrayAdapter extends ArrayAdapter<String> {

    private Context mContext ;
    private ArrayList<String> listData;

    public MyArrayAdapter(Context context, int resource, ArrayList<String> list) {
        super(context, resource, list);
        LogUtils.show("MyArrayAdapter");
        this.listData = list;
        this.mContext = context;
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
