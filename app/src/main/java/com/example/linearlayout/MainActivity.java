package com.example.linearlayout;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.linearlayout.systembar.StatusBarCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StatusBarCompat.setStatusBarFullTransparent(this);
        StatusBarCompat.setStatusBarLightMode(this, false);
//        StatusBarCompat.setStatusBarColor(this, 6,1);
    }

}
