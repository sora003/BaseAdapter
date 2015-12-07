package com.sora.baseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Sora on 2015/12/6.
 */
public class MyAdapter extends BaseAdapter{

    private LayoutInflater mInfalter;
    private List<Bean> mlist;

    public MyAdapter(Context context,List<Bean> list) {
        mInfalter = LayoutInflater.from(context);
        mlist = list;
    }

    @Override
    public int getCount() {
        return mlist.size();
    }

    @Override
    public Object getItem(int position) {
        return mlist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null){
            convertView = mInfalter.inflate(R.layout.item_listview,parent,false);
            holder = new ViewHolder();
            holder.mTitle = (TextView) convertView.findViewById(R.id.id_title);
            holder.mDesc = (TextView) convertView.findViewById(R.id.id_desc);
            holder.mTime = (TextView) convertView.findViewById(R.id.id_time);
            holder.mPhone = (TextView) convertView.findViewById(R.id.id_phone);
            convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder) convertView.getTag();
        }

        Bean bean = mlist.get(position);
        holder.mTitle.setText(bean.getTitle());
        holder.mDesc.setText(bean.getDesc());
        holder.mTitle.setText(bean.getTime());
        holder.mPhone.setText(bean.getPhone());

        return convertView;
    }

    private class ViewHolder{
        TextView mTitle;
        TextView mDesc;
        TextView mTime;
        TextView mPhone;
    }
}
