package com.example.administrator.login.com.example.login.fragment.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.login.R;
import com.example.administrator.login.com.example.login.fragment.main.BaseFragment;

/**
 * Created by Administrator on 2016/12/15.
 */

public class Fragment1 extends BaseFragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_login1,container,false);
    }
}
