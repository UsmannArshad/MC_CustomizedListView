package com.example.customizedlistview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListAdaptor extends ArrayAdapter<User> {
public ListAdaptor(@NonNull Context context,int resource,@NonNull ArrayList<User> userArrayList)
{
    super(context,R.layout.list_item,resource,userArrayList);
}

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
    User user =getItem(position);
        convertView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        ImageView imageView=convertView.findViewById(R.id.imageView);
    TextView contact=convertView.findViewById(R.id.textView2);
        TextView msg=convertView.findViewById(R.id.textView);
        TextView date= convertView.findViewById(R.id.textView5);
        imageView.setImageResource(user.getImageId());
        contact.setText(user.getName());
        msg.setText(user.getLastMessage());
        date.setText(user.lastmsgtime);
        return convertView;
    }
}
