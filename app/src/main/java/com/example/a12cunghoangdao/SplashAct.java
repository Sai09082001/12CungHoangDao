package com.example.a12cunghoangdao;

import android.content.Intent;
import android.os.Handler;

public class SplashAct extends BaseAct {
    @Override
    protected int getLayoutID() {
        return R.layout.act_splash;
    }

    @Override
    protected void initView() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                gotoMainAct();
            }
        },5000);
        finish();
    }

    private void gotoMainAct() {
        Intent intent =new Intent();
        intent.setClass(this,MainAct.class);
        startActivity(intent);
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
    }
}
