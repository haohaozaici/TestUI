package com.example.haohao.testui.Second;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.haohao.testui.R;

import cn.zhouchaoyuan.excelpanel.BaseExcelPanelAdapter;

/**
 * Created by haohao on 2017/3/16.
 */

public class Adapter extends BaseExcelPanelAdapter<RowTitle, ColTitle, Cell> {

    private Context context;
    private View.OnClickListener block;

    public Adapter(Context context) {
        super(context);
        this.context = context;
    }

    //======================normal cell=====================================
    @Override
    public RecyclerView.ViewHolder onCreateCellViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.room_status_normal, parent, false);

        return new CellHolder(view);
    }

    @Override
    public void onBindCellViewHolder(RecyclerView.ViewHolder holder, int verticalPosition, int horizontalPosition) {

    }

    public class CellHolder extends RecyclerView.ViewHolder {

        public CellHolder(View itemView) {
            super(itemView);
        }
    }


    //=======================top cell===========================================

    @Override
    public RecyclerView.ViewHolder onCreateTopViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.room_status_top_header, parent, false);

        return new TopHolder(view);
    }

    @Override
    public void onBindTopViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    public class TopHolder extends RecyclerView.ViewHolder {

        public TopHolder(View itemView) {
            super(itemView);
        }
    }

    //=======================left cell===========================================

    @Override
    public RecyclerView.ViewHolder onCreateLeftViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.room_status_left_header, parent, false);

        return new LeftHolder(view);
    }

    @Override
    public void onBindLeftViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    public class LeftHolder extends RecyclerView.ViewHolder {


        public LeftHolder(View itemView) {
            super(itemView);
        }
    }

    //=======================top left cell=======================================

    @Override
    public View onCreateTopLeftView() {
        return LayoutInflater.from(context).inflate(R.layout.empty_layout, null);
    }
}
