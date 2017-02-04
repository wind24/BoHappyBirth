package com.bohappy;

import android.content.Intent;

import com.bohappy.base.BaseActivity;
import com.bohappy.index.IndexActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected int ContentView() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        super.initView();
        Intent intent = new Intent(this, IndexActivity.class);
        startActivity(intent);
        finish();
    }
}
