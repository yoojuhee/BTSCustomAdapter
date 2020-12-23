package kr.or.womanup.nambu.yjh.btscustomadapter;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;

import java.util.ArrayList;


public class BTSAdapter1 extends BaseAdapter {
    Context context;
    ArrayList<BTS> members;
    int layout;

    public BTSAdapter1(Context context, ArrayList<BTS> members, int layout) {
        this.context = context;
        this.members = members;
        this.layout = layout;
    }


    @Override
    public int getCount() {
        return members.size();
    }

    @Override
    public Object getItem(int position) {
        return members.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        LayoutInflater inflater = LayoutInflater.from(context);
        View view1 = inflater.inflate(layout,parent,false);
        return view1;
    }
}
