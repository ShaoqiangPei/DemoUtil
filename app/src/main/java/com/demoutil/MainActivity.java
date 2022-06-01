package com.demoutil;

import android.Manifest;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.permision.PermissionHelper;
import com.util.LogUtil;
import kr.co.namee.permissiongen.PermissionFail;
import kr.co.namee.permissiongen.PermissionSuccess;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        LogUtil.setDebug(true);
//        LogUtil.i("=======kk=======");
//        ToastUtil.shortShow("=====kk======");
        //我是测试


    }


}
