package com.bohappy;

import android.content.Intent;
import android.os.Bundle;

import com.bohappy.base.BaseActivity;
import com.bohappy.index.IndexActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, IndexActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected int ContentView() {
        return 0;
    }
}
