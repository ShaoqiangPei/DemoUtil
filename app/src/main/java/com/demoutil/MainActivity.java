package com.demoutil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.util.LogUtil;
import com.util.ToastUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LogUtil.setDebug(true);
        LogUtil.i("=======kk=======");
        ToastUtil.shortShow("=====kk======");
    }
}
