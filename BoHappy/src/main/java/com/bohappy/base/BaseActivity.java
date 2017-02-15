package com.bohappy.base;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.bohappy.R;

/**
 * Created by huangzefeng on 4/2/17.
 */
public abstract class BaseActivity extends AppCompatActivity {

    private boolean inited;
    private FrameLayout bc_container;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.base_activity);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        bc_container = (FrameLayout) findViewById(R.id.bc_container);
        int layoutRes = ContentView();
        if (layoutRes != 0) {
            setContentView(layoutRes);
        }
        initView();
    }

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        bc_container.removeAllViews();
        View view = getLayoutInflater().inflate(layoutResID, bc_container, false);
        bc_container.addView(view);
    }

    @Override
    public void setContentView(View view) {
        bc_container.removeAllViews();
        bc_container.addView(view);
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        bc_container.removeAllViews();
        bc_container.addView(view, params);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (!inited) {
            //未初始化数据，在这里初始化，只执行一次
            initData();
            inited = true;
        }
    }

    @Override
    public void setTitle(CharSequence title) {
        if (toolbar != null) {
            toolbar.setTitle(title);
        }
    }

    @Override
    public void setTitle(int titleId) {
        if (toolbar != null) {
            toolbar.setTitle(titleId);
        }
    }

    protected void initView() {

    }

    protected void initData() {

    }

    protected abstract int ContentView();

    public boolean isInited() {
        return inited;
    }

    public BaseActivity getActivity() {
        return this;
    }
}
