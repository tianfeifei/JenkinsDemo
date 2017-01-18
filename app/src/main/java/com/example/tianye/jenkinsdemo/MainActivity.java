package com.example.tianye.jenkinsdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        printfDeviceInfo();
        //你好
        //第三次
    }

    private void printfDeviceInfo() {
        WindowManager wm = (WindowManager)getSystemService(WINDOW_SERVICE);
        android.view.Display display = wm.getDefaultDisplay();
        Log.e("Tag",display.toString());
    }
}
