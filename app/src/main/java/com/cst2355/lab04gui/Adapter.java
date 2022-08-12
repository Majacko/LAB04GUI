package com.cst2355.lab04gui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class Adapter extends BaseAdapter {
    private List<Message> MsgModel;
    private Context context;
    private LayoutInflater inflater;

    public Adapter(List<Message> MsgModel,Context context){
        this.MsgModel = MsgModel;
        this.context = context;
        this.inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return MsgModel.size();
    }

    @Override
    public Object getItem(int position) {
        return MsgModel.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        if(view==null){
            if(MsgModel.get(position).isSent()){
                view = inflater.inflate(R.layout.activity_send, null);
            }else {
                view = inflater.inflate(R.layout.activity_receive, null);
            }
            TextView TextMsg =  (TextView)view.findViewById(R.id.TxtViewMsg);
            TextMsg.setText(MsgModel.get(position).msg);
        }
        return view;
    }
}
