package kr.or.womanup.nambu.yjh.btscustomadapter;

import android.content.Context;
import android.media.Image;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;

public class BTSadapter extends BaseAdapter {
    Context context;
    ArrayList<BTS> members;
    int layout;

    public BTSadapter(Context context, ArrayList<BTS> members, int layout) {
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
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(layout, parent, false);
            holder = new ViewHolder();
            holder.txtNick = convertView.findViewById(R.id.txt_nick_item);
            holder.txtName = convertView.findViewById(R.id.txt_name_item);
            holder.imageView = convertView.findViewById(R.id.imageView_item);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder)convertView.getTag();

        }
        BTS member = members.get(position);
        String nick = member.nick;
        String name = member.name;
        int image = member.image;

        ImageView imageView = convertView.findViewById(R.id.imageView_item);
        TextView txtNick = convertView.findViewById(R.id.txt_nick_item);
        TextView txtName = convertView.findViewById(R.id.txt_name_item);

        holder.txtNick.setText(nick);
        holder.txtName.setText(name);
        holder.imageView.setImageResource(image);

        return convertView;
    }
    class ViewHolder{
        ImageView imageView;
        TextView txtNick;
        TextView txtName;

    }

}
