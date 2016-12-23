package com.example.administrator.login;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

import com.example.administrator.login.com.example.login.fragment.fragment.Fragment0;

public class MainActivity extends AppCompatActivity {

    private Fragment0 fragment0;
    private Fragment fragment;
    private FragmentManager fm ;
    // 开启Fragment事务
    private FragmentTransaction transaction;
    private void init() {
        fm = getFragmentManager();
        // 开启Fragment事务
        transaction = fm.beginTransaction();
        fragment0=new Fragment0();
        transaction.replace(R.id.id_content,fragment0);
        transaction.commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        init();
    }

    @Override
    public void onBackPressed() {
        //获取当前Fragment的实例
        fragment=getFragmentManager().findFragmentById(R.id.id_content);
        if (fragment instanceof Fragment0){
            finish();
        }
        fm = getFragmentManager();
        // 开启Fragment事务
        transaction = fm.beginTransaction();
        fragment0=new Fragment0();
        transaction.replace(R.id.id_content,fragment0);
        transaction.commit();
    }


}
