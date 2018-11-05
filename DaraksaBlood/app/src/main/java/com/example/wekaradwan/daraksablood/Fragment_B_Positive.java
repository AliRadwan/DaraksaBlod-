package com.example.wekaradwan.daraksablood;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weka radwan on 6/26/2018.
 */

public class Fragment_B_Positive extends Fragment {

    View view;
    private RecyclerView mRecyclerView;
    private List<Data> listData;

    public Fragment_B_Positive() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_design,container,false);

        mRecyclerView = view.findViewById(R.id.a_negative_recyclerView);
        RecyclerviewAdapter recyclerviewAdapter = new RecyclerviewAdapter(getActivity(),listData);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(recyclerviewAdapter);
        return view;

    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listData = new ArrayList<>();
    }
}
