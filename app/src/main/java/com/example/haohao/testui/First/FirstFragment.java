package com.example.haohao.testui.First;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.haohao.testui.R;

/**
 * Created by haohao on 2017/3/16.
 */

public class FirstFragment extends Fragment {

    private RecyclerView recyclerView;
    private FirstAdapter firstAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_first, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.first_recycler_view);
        firstAdapter = new FirstAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(firstAdapter);

        return view;
    }
}
