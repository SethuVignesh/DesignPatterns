package com.newtra.designpatterns;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import java.util.ArrayList;

/**
 * Created by vset0001 on 6/20/2015.
 */
public class CustomAdapterFair extends BaseAdapter{

        private static ArrayList<BeanFair> searchArrayList;

        private LayoutInflater mInflater;

        public CustomAdapterFair(Context context, ArrayList<BeanFair> results) {
            searchArrayList = results;
            mInflater = LayoutInflater.from(context);
        }

        public int getCount() {
            return searchArrayList.size();
        }

        public Object getItem(int position) {
            return searchArrayList.get(position);
        }

        public long getItemId(int position) {
            return position;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder;
            if (convertView == null) {
                convertView = mInflater.inflate(R.layout.fare_list_item, null);
                holder = new ViewHolder();
                holder.tvCabType = (TextView) convertView.findViewById(R.id.textViewcabType);
                holder.tvMinRate = (TextView) convertView.findViewById(R.id.tvMinRate);
                holder.tvcabRate = (TextView) convertView.findViewById(R.id.tvCabRate);
                holder.tvMinKm = (TextView) convertView.findViewById(R.id.tvMinKm);

                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }

            holder.tvCabType.setText(searchArrayList.get(position).getCab());
            holder.tvMinRate.setText(searchArrayList.get(position).getMinRate());
            holder.tvcabRate.setText(searchArrayList.get(position).getRatePerKm());
            holder.tvMinKm.setText(searchArrayList.get(position).getRatePerKm());

            return convertView;
        }

        static class ViewHolder {
            TextView tvCabType;
            TextView tvMinRate;
            TextView tvcabRate;
            TextView tvMinKm;
        }

    }