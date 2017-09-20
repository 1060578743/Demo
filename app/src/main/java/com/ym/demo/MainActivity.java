package com.ym.demo;

import android.app.Instrumentation;
import android.os.Bundle;
import android.support.test.uiautomator.UiDevice;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements Runnable{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Thread thread = new Thread(this);
        thread.start();
        //wocao

    }
    @Override
    public void run() {
        Instrumentation instrumentation = new Instrumentation();
        UiDevice device = UiDevice.getInstance(instrumentation);
        device.pressHome();
    }
}
