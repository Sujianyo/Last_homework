package com.example.smartcity.fragment;

import android.util.Log;
import android.view.View;

import com.example.smartcity.R;


public class JLearnFragment extends BaseFragment {
    private static final String TAG = JLearnFragment.class.getSimpleName();
    @Override
    public View initView() {
        Log.i(TAG,"建党学习");
        View view = View.inflate(getActivity(), R.layout.jd_learn,null);
        return view;
    }

    @Override
    public void initData() {
        super.initData();
    }
}
