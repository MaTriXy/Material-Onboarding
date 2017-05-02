package com.vexigon.libraries.onboarding.ui.adapters;

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

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.vexigon.libraries.onboarding.ui.fragments.SelfSelectFragment;

/**
 * Created by Andrew Quebe on 3/2/2017.
 */

public class SelfSelectViewpagerAdapter extends FragmentStatePagerAdapter {
    public SelfSelectViewpagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new SelfSelectFragment(position);
    }

    @Override
    public int getCount() {
        /*
         * A maximum of three illustrations should auto-rotate every two to three seconds and display pagination navigation.
         * https://material.io/guidelines/growth-communications/onboarding.html#onboarding-top-user-benefits
         */
        return 2;
    }
}
