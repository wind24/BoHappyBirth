package com.bohappy.index;

import android.view.View;

import com.bohappy.R;
import com.bohappy.base.BaseActivity;

/**
 * Created by huangzefeng on 4/2/17.
 */
public class IndexActivity extends BaseActivity {

    private View capture;

    @Override
    protected int ContentView() {
        return R.layout.activity_index;
    }

    @Override
    protected void initView() {
        super.initView();
        capture = findViewById(R.id.capture);
        capture.setOnClickListener(clickListener);
    }

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
}
