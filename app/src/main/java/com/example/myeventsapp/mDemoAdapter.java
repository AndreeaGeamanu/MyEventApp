package com.example.myeventsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class mDemoAdapter extends RecyclerView.Adapter<mDemoAdapter.DemoViewHolder> {

    private String[][] mDataSet;
    private LayoutInflater mLayoutInflater;

    public mDemoAdapter(Context context, String[][] dataset)
    {
        mDataSet = dataset;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public DemoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) { //cum sa creeze elementele din lista
        View view = mLayoutInflater.inflate(R.layout.recycler_bucharest, parent, false);
        return new DemoViewHolder(view);

    }

    @Override
    public int getItemCount() {  //cate elemente sunt in lista

        return mDataSet.length;
    }

    @Override
    public void onBindViewHolder(@NonNull DemoViewHolder holder, int position) { //cum sa lege elementele
        String title = mDataSet[position][0];
        String subtitle = mDataSet[position][1];
        String time = mDataSet[position][2];
        String date = mDataSet[position][3];
        holder.update(title , subtitle, date, time);

    }

    public class DemoViewHolder extends RecyclerView.ViewHolder{  //cum arata fiecare element din lista

        private TextView mTitle;
        private TextView mSubTitle;
        private TextView mDate;
        private TextView mTime;

        public DemoViewHolder(@NonNull View itemView) {
            super(itemView);

            mTitle = itemView.findViewById(R.id.itemList_tvTitle);
            mSubTitle= itemView.findViewById(R.id.itemList_tvSubTitle);
            mDate=itemView.findViewById(R.id.itemList_tvDate);
            mTime=itemView.findViewById(R.id.itemList_tvTime);
        }

        public void update(String title, String subtitle, String date, String time)
        {
            mTitle.setText(title);
            mSubTitle.setText(subtitle);
            mDate.setText(date);
            mTime.setText(time);
        }
    }
}
