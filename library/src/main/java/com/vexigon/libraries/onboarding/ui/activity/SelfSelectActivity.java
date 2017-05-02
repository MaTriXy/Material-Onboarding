package com.vexigon.libraries.onboarding.ui.activity;

/*
 * Copyright 2017 Vexigon, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.pixelcan.inkpageindicator.InkPageIndicator;
import com.vexigon.libraries.onboarding.R;
import com.vexigon.libraries.onboarding.ui.adapters.SelfSelectViewpagerAdapter;

/**
 * Created by Andrew Quebe on 3/2/2017.
 */

public class SelfSelectActivity extends AppCompatActivity {

    ViewPager viewPager;
    InkPageIndicator inkPageIndicator;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.self_select_activity);

        viewPager = (ViewPager) findViewById(R.id.selfSelectPager);
        viewPager.setAdapter(new SelfSelectViewpagerAdapter(getSupportFragmentManager()));

        inkPageIndicator = (InkPageIndicator) findViewById(R.id.indicator);
        inkPageIndicator.setViewPager(viewPager);
    }
}
