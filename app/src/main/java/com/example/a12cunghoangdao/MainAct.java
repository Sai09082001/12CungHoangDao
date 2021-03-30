package com.example.a12cunghoangdao;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainAct extends BaseAct {
    private static final String TAG = "Log";
    int idIvDetail = R.drawable.ic_bocap, idTvTitelDetailM002 = R.string.bo_cap_title1, idTvDetailM002 = R.string.bo_cap_text;

    @Override
    protected int getLayoutID() {
        return R.layout.act_menu;
    }

    @Override
    protected void initView() {
        findViewById(R.id.iv_bo_cap, this);
        findViewById(R.id.iv_bach_duong, this);
        findViewById(R.id.iv_bao_binh, this);
        findViewById(R.id.iv_cu_giai, this);
        findViewById(R.id.iv_kim_nguu, this);
        findViewById(R.id.iv_ma_ket, this);
        findViewById(R.id.iv_nhan_ma, this);
        findViewById(R.id.iv_song_ngu, this);
        findViewById(R.id.iv_su_tu, this);
        findViewById(R.id.iv_thien_binh, this);
        findViewById(R.id.iv_xu_nu, this);
        findViewById(R.id.iv_song_tu, this);
        findViewById(R.id.tv_xem_them, this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        ImageView imvDetail = findViewById(R.id.iv_detail);
        TextView tvDetail = findViewById(R.id.tv_detail);
        TextView tvTitelDetail = findViewById(R.id.tv_title_detail);


        switch (id) {
            case R.id.iv_song_tu: {
                imvDetail.setBackgroundResource(R.drawable.ic_song_tu);
                tvTitelDetail.setText(R.string.song_tu_title2);
                idTvTitelDetailM002 = R.string.song_tu_title1;
                tvDetail.setText(R.string.song_tu_text);
                idTvDetailM002 = R.string.song_tu_text;
                idIvDetail = R.drawable.ic_song_tu;
                break;
            }

            case R.id.iv_bach_duong: {
                imvDetail.setBackgroundResource(R.drawable.ic_bach_duong);
                tvTitelDetail.setText(R.string.bach_duong_title2);
                idTvTitelDetailM002 = R.string.bach_duong_title1;
                tvDetail.setText(R.string.bach_duong_text);
                idTvDetailM002 = R.string.bach_duong_text;
                idIvDetail = R.drawable.ic_bach_duong;
                break;
            }
            case R.id.iv_bao_binh: {
                imvDetail.setBackgroundResource(R.drawable.ic_bao_binh);
                tvTitelDetail.setText(R.string.bao_binh_title2);
                idTvTitelDetailM002 = R.string.bao_binh_title1;
                tvDetail.setText(R.string.bao_binh_text);
                idTvDetailM002 = R.string.bao_binh_text;
                idIvDetail = R.drawable.ic_bao_binh;
                break;
            }
            case R.id.iv_bo_cap: {
                imvDetail.setBackgroundResource(R.drawable.ic_bocap);
                tvTitelDetail.setText(R.string.bo_cap_title2);
                idTvTitelDetailM002 = R.string.bo_cap_title1;
                tvDetail.setText(R.string.bo_cap_text);
                idTvDetailM002 = R.string.bo_cap_text;
                idIvDetail = R.drawable.ic_bocap;
                break;
            }
            case R.id.iv_cu_giai: {
                imvDetail.setBackgroundResource(R.drawable.ic_cu_giai);
                tvTitelDetail.setText(R.string.cu_giai_title2);
                idTvTitelDetailM002 = R.string.cu_giai_title1;
                tvDetail.setText(R.string.cu_giai_text);
                idTvDetailM002 = R.string.cu_giai_text;
                idIvDetail = R.drawable.ic_cu_giai;
                break;
            }
            case R.id.iv_kim_nguu: {
                imvDetail.setBackgroundResource(R.drawable.ic_kim_nguu);
                tvTitelDetail.setText(R.string.kim_nguu_title2);
                idTvTitelDetailM002 = R.string.kim_nguu_title1;
                tvDetail.setText(R.string.kim_nguu_text);
                idTvDetailM002 = R.string.kim_nguu_text;
                idIvDetail = R.drawable.ic_kim_nguu;
                break;
            }
            case R.id.iv_ma_ket: {
                imvDetail.setBackgroundResource(R.drawable.ic_ma_ket);
                tvTitelDetail.setText(R.string.ma_ket_title2);
                idTvTitelDetailM002 = R.string.ma_ket_title1;
                tvDetail.setText(R.string.ma_ket_text);
                idTvDetailM002 = R.string.ma_ket_text;
                idIvDetail = R.drawable.ic_ma_ket;
                break;
            }
            case R.id.iv_nhan_ma: {
                imvDetail.setBackgroundResource(R.drawable.ic_nhan_ma);
                tvTitelDetail.setText(R.string.nhan_ma_title2);
                idTvTitelDetailM002 = R.string.nhan_ma_title1;
                tvDetail.setText(R.string.nhan_ma_text);
                idTvDetailM002 = R.string.nhan_ma_text;
                idIvDetail = R.drawable.ic_nhan_ma;
                break;
            }
            case R.id.iv_song_ngu: {
                imvDetail.setBackgroundResource(R.drawable.ic_song_ngu);
                tvTitelDetail.setText(R.string.song_ngu_title2);
                idTvTitelDetailM002 = R.string.song_ngu_title1;
                tvDetail.setText(R.string.song_ngu_text);
                idTvDetailM002 = R.string.song_ngu_text;
                idIvDetail = R.drawable.ic_song_ngu;
                break;
            }
            case R.id.iv_su_tu: {
                imvDetail.setBackgroundResource(R.drawable.ic_su_tu);
                tvTitelDetail.setText(R.string.su_tu_title2);
                idTvTitelDetailM002 = R.string.su_tu_title1;
                tvDetail.setText(R.string.su_tu_text);
                idTvDetailM002 = R.string.su_tu_text;
                idIvDetail = R.drawable.ic_su_tu;
                break;
            }
            case R.id.iv_thien_binh: {
                imvDetail.setBackgroundResource(R.drawable.ic_thien_binh);
                tvTitelDetail.setText(R.string.thien_binh_title2);
                idTvTitelDetailM002 = R.string.thien_binh_title1;
                tvDetail.setText(R.string.thien_binh_text);
                idTvDetailM002 = R.string.thien_binh_text;
                idIvDetail = R.drawable.ic_thien_binh;
                break;
            }
            case R.id.iv_xu_nu: {
                imvDetail.setBackgroundResource(R.drawable.ic_xu_nu);
                tvTitelDetail.setText(R.string.xu_nu_title2);
                idTvTitelDetailM002 = R.string.xu_nu_title1;
                tvDetail.setText(R.string.xu_nu_text);
                idTvDetailM002 = R.string.xu_nu_text;
                idIvDetail = R.drawable.ic_xu_nu;
                break;
            }
        }

        if (id == R.id.tv_xem_them) {
            Intent intent = new Intent();
            intent.setClass(this, DetailAct.class);
            Bundle bundle = new Bundle();
            bundle.putInt("key_1", idIvDetail);
            bundle.putInt("key_2", idTvTitelDetailM002);
            bundle.putInt("key_3", idTvDetailM002);
            Log.i(TAG, idIvDetail + "");
            intent.putExtras(bundle);
            startActivity(intent);
            finish();
            overridePendingTransition(R.anim.slide_out_up, R.anim.slide_in_up);
        }

    }
}
