package com.puzzle.house;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class HomePageAdapter extends BaseAdapter {
    private Context mContext;

    private ArrayList<PersonGroup> groups;

    public HomePageAdapter(Context context, ArrayList<PersonGroup> groups) {
        this.mContext = context;
        this.groups = groups;
    }


    public int getCount() {
        return groups.size();
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(final int position, View convertView, ViewGroup parent) {
        ImageView profile_image;
        TextView packageNameTV;
        LinearLayout unavailableTV;
        TextView packageServicesTV;

        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            convertView = layoutInflater.inflate(R.layout.packagename, null);
        }
        packageNameTV = convertView.findViewById(R.id.PackageNameTV);
        packageServicesTV = convertView.findViewById(R.id.PackageServicesTV);
        profile_image = convertView.findViewById(R.id.profile_image);
        unavailableTV = convertView.findViewById(R.id.unavailableTV);
        packageNameTV.setText(groups.get(position).getGroupName());
       if(position==0) Picasso.with(mContext).load(R.drawable.game2).into(profile_image);
      else if(position==1) Picasso.with(mContext).load(R.drawable.game1).into(profile_image);
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(position==0){
                    mContext.startActivity(new Intent(mContext,MainActivity.class));
                } else if(position==1){
                    mContext.startActivity(new Intent(mContext,Puzzle2048Activity.class));
                }
            }
        });


        return convertView;
    }


}
