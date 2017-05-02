package com.vexigon.libraries.onboarding.ui.models;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

import com.vexigon.libraries.onboarding.obj.selfselect.SSPage;
import com.vexigon.libraries.onboarding.obj.selfselect.UserPage;
import com.vexigon.libraries.onboarding.ui.activity.SelfSelectActivity;
import com.vexigon.libraries.onboarding.util.SelfSelectKeys;

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
public class SelfSelectModel {
    private Context context;
    private UserPage userPage;
    private SSPage ssPage;

    public SelfSelectModel(@NonNull Activity context) {
        this.context = context;
    }

    public SelfSelectModel setupSlides(UserPage userPage, SSPage ssPage) {
        this.userPage = userPage;
        this.ssPage = ssPage;
        return this;
    }

    private Intent getIntent() {
        return new Intent(context, SelfSelectActivity.class)
                .putExtra(SelfSelectKeys.USER_PAGE_DRAWABALE_RES, userPage.getDrawableRes())
                .putExtra(SelfSelectKeys.USER_PAGE_USERS, userPage.getUsers())
                .putExtra(SelfSelectKeys.SELF_SELECT_PAGE_TITLE, ssPage.getTitle())
                .putExtra(SelfSelectKeys.SELF_SELECT_PAGE_SUBTITLE, ssPage.getSubtitle())
                .putExtra(SelfSelectKeys.SELF_SELECT_BUNDLED_ITEMS, ssPage.getBundledListItems())
                .putExtra(SelfSelectKeys.SELF_SELECT_GRIDVIEW_ITEMS, ssPage.getGridViewItems())
                .putExtra(SelfSelectKeys.SELF_SELECT_LIST_ITEMS, ssPage.getListItems());
    }

    public void launch() {
        context.startActivity(getIntent());
    }
}
