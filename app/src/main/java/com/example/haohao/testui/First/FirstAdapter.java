package com.example.haohao.testui.First;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.haohao.testui.R;

/**
 * Created by haohao on 2017/3/16.
 */

public class FirstAdapter extends RecyclerView.Adapter<FirstAdapter.ViewHolder> {

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.first_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.button.setText(position + "");

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private Button button;

        public ViewHolder(View itemView) {
            super(itemView);

            button = (Button) itemView.findViewById(R.id.text_button);
        }
    }
}
