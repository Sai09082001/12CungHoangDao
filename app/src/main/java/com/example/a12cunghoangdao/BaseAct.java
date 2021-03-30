package com.example.a12cunghoangdao;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseAct extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutID());
        initView();
    }

    @Override
    public <T extends View> T findViewById(int id) {
        return findViewById(id, null);
    }

    protected <T extends View> T findViewById(int id, BaseAct baseAct) {
        View v = super.findViewById(id);
        if (baseAct != null) {
            v.setOnClickListener(baseAct);
        }
        return super.findViewById(id);
    }

    protected void initView() {
        //do nothing
    }

    protected abstract int getLayoutID();

    @Override
    public void onClick(View view) {
        //do nothing
    }

}

