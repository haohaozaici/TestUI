package com.example.haohao.testui.Second;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.haohao.testui.R;

import java.util.ArrayList;
import java.util.List;

import cn.zhouchaoyuan.excelpanel.ExcelPanel;

/**
 * Created by haohao on 2017/3/16.
 */

public class SecondFragment extends Fragment {

    private List<RowTitle> rowTitles;
    private List<ColTitle> colTitles;
    private List<List<Cell>> cells;
    private ExcelPanel panel;
    private Adapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_second, container, false);

        panel = (ExcelPanel) view.findViewById(R.id.excel_panel);
        adapter = new Adapter(getActivity());
        panel.setAdapter(adapter);

        colTitles = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            colTitles.add(new ColTitle("8:20-9:55", "first class"));
        }

        rowTitles = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            rowTitles.add(new RowTitle("3-16", "first week"));
        }



        cells = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            cells.add(new ArrayList<Cell>());
        }
        for (int i = 0; i < 5; i++) {
            cells.get(i).add(new Cell("3-16", "first week", ""));
            cells.get(i).add(new Cell("3-16", "first week", ""));
            cells.get(i).add(new Cell("3-16", "first week", ""));
            cells.get(i).add(new Cell("3-16", "first week", ""));
            cells.get(i).add(new Cell("3-16", "first week", ""));
            cells.get(i).add(new Cell("3-16", "first week", ""));
            cells.get(i).add(new Cell("3-16", "first week", ""));
        }



        adapter.setAllData(colTitles, rowTitles, cells);

        return view;
    }
}
