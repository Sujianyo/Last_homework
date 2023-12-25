package com.example.smartcity.fragment;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.smartcity.R;


// 新闻类别：时政，电视，旅游，视频，广播，基层


public class NTVFragment extends BaseFragment {
    private static final String TAG = NTVFragment.class.getSimpleName();


    @Override
    public View initView() {
        Log.i(TAG, "电视的视图被实例化了");
        View view = View.inflate(getContext(), R.layout.news_tv, null);

        findView(view);

        return view;
    }

    private void findView(View view) {
        TextView tv2 = view.findViewById(R.id.tv2);
    }


    @Override
    public void initData() {
        super.initData();
        Log.e(TAG, "电视的Fragment的数据被初始化了");



    }



}
