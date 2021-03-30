package com.example.a12cunghoangdao;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class DetailAct extends BaseAct {
    private static final String TAG = "Log";

    @Override
    protected int getLayoutID() {
        return R.layout.act_detail;

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getIntent().getExtras();

        int idIvDetail, idTvTitleDetailM002, idTvDetailM002;

        idIvDetail = bundle.getInt("key_1");
        Log.i(TAG, idIvDetail + "");
        idTvTitleDetailM002 = bundle.getInt("key_2");
        idTvDetailM002 = bundle.getInt("key_3");

        ImageView imvDetail = findViewById(R.id.iv_detail_m002);
        TextView tvTitleDetail = findViewById(R.id.tv_title_detail_m002);
        TextView tvDetail = findViewById(R.id.tv_detail_m002);


        imvDetail.setBackgroundResource(idIvDetail);
        tvTitleDetail.setText(idTvTitleDetailM002);
        tvDetail.setText(idTvDetailM002);

    }

    @Override
    protected void initView() {
        findViewById(R.id.tv_quay_lai, this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.tv_quay_lai) {
            Intent intent = new Intent();
            intent.setClass(this, MainAct.class);
            finish();
            overridePendingTransition(R.anim.slide_out_up,R.anim.slide_in_up);
        }
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.setClass(this, MainAct.class);
        finish();
    }
}
