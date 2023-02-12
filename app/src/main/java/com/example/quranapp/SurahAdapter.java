package com.example.quranapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SurahAdapter extends RecyclerView.Adapter<SurahAdapter.SurahViewHolder> {

    private List<String> mSurahs;
    private MyOnClickListener myInterface;

    public SurahAdapter(List<String> surahs, MyOnClickListener listener) {
        mSurahs = surahs;
        myInterface = listener;
    }

    @Override
    public SurahViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_surah_recycler_view, parent, false);
        return new SurahViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(SurahViewHolder holder, int position) {
        String surahName = mSurahs.get(position);
        int incrementedPos = (position+1);
        holder.surahNumberTextView.setText(incrementedPos + " - ");
        holder.surahNameTextView.setText(surahName);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myInterface.onClick(incrementedPos);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mSurahs.size();
    }
    

    static class SurahViewHolder extends RecyclerView.ViewHolder {

        TextView surahNumberTextView;
        TextView surahNameTextView;

        SurahViewHolder(View itemView) {
            super(itemView);
            surahNumberTextView = itemView.findViewById(R.id.text_view_surah_number);
            surahNameTextView = itemView.findViewById(R.id.text_view_surah_name);
        }
    }
}

