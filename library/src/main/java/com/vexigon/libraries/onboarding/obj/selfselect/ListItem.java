package com.vexigon.libraries.onboarding.obj.selfselect;

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
public class ListItem {
    private String title;
    private int drawableRes, checkedDrawableRes, uncheckedDrawableRes;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDrawableRes() {
        return drawableRes;
    }

    public void setDrawableRes(int drawableRes) {
        this.drawableRes = drawableRes;
    }

    public int getCheckedDrawableRes() {
        return checkedDrawableRes;
    }

    public void setCheckedDrawableRes(int checkedDrawableRes) {
        this.checkedDrawableRes = checkedDrawableRes;
    }

    public int getUncheckedDrawableRes() {
        return uncheckedDrawableRes;
    }

    public void setUncheckedDrawableRes(int uncheckedDrawableRes) {
        this.uncheckedDrawableRes = uncheckedDrawableRes;
    }
}
