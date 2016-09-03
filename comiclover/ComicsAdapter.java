package com.kunalmadan.android.comiclover;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by KUNAL on 03-09-2016.
 */
public class ComicsAdapter extends RecyclerView.Adapter<ComicsAdapter.MyViewHolder> {

    private List<String> mdata;

    public ComicsAdapter(Context context,List<String> data) {
mdata = data;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, price;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.text1);
            price = (TextView) view.findViewById(R.id.text2);
        }
    }
    @Override
    public ComicsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ComicsAdapter.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
