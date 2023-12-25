package com.example.smartcity.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;

import com.example.smartcity.R;


public class SUserJianlIFragment extends BaseFragment {
    private Toolbar toolbar;
    private TextView tv_title;


    @Override
    public View initView() {
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.service_jianli_record, null);
        toolbar = view.findViewById(R.id.toolbar);
        tv_title = view.findViewById(R.id.tv_title);
        return view;
    }

    @Override
    public void initData() {
        super.initData();
    }
}
