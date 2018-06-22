package com.haitaow.baseutils.Dateutils;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.haitaow.baseutils.R;

/**
 * @Class:
 * @Description:
 * @Author: haitaow(haitaow @ hpe.com)
 * @Date: 6/11/2018-10:17 PM.
 * @Version 1.0
 */
public class TestActivity extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.support_simple_spinner_dropdown_item);
    }
}
