package com.example.sanbot;

import android.os.Bundle;
import android.view.WindowManager;

import com.sanbot.opensdk.base.BindBaseActivity;

public class MainActivity extends BindBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /** NECESSARY ON SANBOT ROBOT */

        /** Always use register to get app working*/
        register(MainActivity.class);
        /** Keep the app active and wont let it sleep from OS*/
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON, WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        /** Android System*/
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Dont write code here, unless needed to autostart a method */
    @Override
    protected void onMainServiceConnected() {

    }
}
