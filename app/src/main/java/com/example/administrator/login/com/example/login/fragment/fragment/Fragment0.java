package com.example.administrator.login.com.example.login.fragment.fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.login.R;
import com.example.administrator.login.com.example.login.fragment.main.BaseFragment;

/**
 * Created by Administrator on 2016/12/15.
 */

public class Fragment0 extends BaseFragment implements View.OnClickListener{
    private TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7;
    private Fragment1 fragment1;
    private Fragment2 fragment2;
    private Fragment3 fragment3;
    private Fragment4 fragment4;
    private FragmentManager fm;
    // 开启Fragment事务
    private FragmentTransaction transaction;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_login,container,false);
        init(view);
        return view;
    }
    private void init(View view){
        tv1= (TextView) view.findViewById(R.id.tv1);
        tv2= (TextView) view.findViewById(R.id.tv2);
        tv3= (TextView) view.findViewById(R.id.tv3);
        tv4= (TextView) view.findViewById(R.id.tv4);
        tv5= (TextView) view.findViewById(R.id.tv5);
        tv6= (TextView) view.findViewById(R.id.tv6);
        tv7= (TextView) view.findViewById(R.id.tv7);
        tv1.setOnClickListener(this);
        tv2.setOnClickListener(this);
        tv3.setOnClickListener(this);
        tv4.setOnClickListener(this);
        tv5.setOnClickListener(this);
        tv6.setOnClickListener(this);
        tv7.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        fm = getFragmentManager();
        // 开启Fragment事务
        transaction = fm.beginTransaction();
        transaction.setCustomAnimations(android.R.animator.fade_in,
                android.R.animator.fade_out);

        switch (v.getId()){
            case R.id.tv1:
                fragment1=new Fragment1();
                transaction.replace(R.id.id_content,fragment1);

                break;
            case R.id.tv2:
                fragment2=new Fragment2();
                transaction.replace(R.id.id_content,fragment2);

                break;
            case R.id.tv3:
                fragment3=new Fragment3();
                transaction.replace(R.id.id_content,fragment3);

                break;
            case R.id.tv4:
                fragment4=new Fragment4();
                transaction.replace(R.id.id_content,fragment4);

                break;
            case R.id.tv5:

                break;
            case R.id.tv6:

                break;
            case R.id.tv7:

                break;
        }
        transaction.commit();
    }
}
