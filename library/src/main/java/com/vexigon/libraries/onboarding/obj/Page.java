package com.vexigon.libraries.onboarding.obj;

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

public class Page {
    private String title, subtitle, buttonText;
    private int drawableRes;

    /**
     * Construct a new page with a title, subtitle, and drawable resource.
     *
     * @param title       the title for the page.
     * @param subtitle    the subtitle for the page.
     * @param drawableRes the drawable resource for the page.
     */
    public Page(String title, String subtitle, int drawableRes) {
        this.title = title;
        this.subtitle = subtitle;
        this.drawableRes = drawableRes;
    }

    /**
     * Construct a new page with a title, subtitle, custom button text, and a drawable resource.
     *
     * @param title       the title for the page.
     * @param subtitle    the subtitle for the page.
     * @param buttonText  the button text for the page.
     * @param drawableRes the drawable resource for the page.
     */
    public Page(String title, String subtitle, String buttonText, int drawableRes) {
        this.title = title;
        this.subtitle = subtitle;
        this.buttonText = buttonText;
        this.drawableRes = drawableRes;
    }

    /**
     * Gets the title of the page
     *
     * @return page title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the page
     * @param title page title.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the subtitle of the page.
     * @return page subtitle.
     */
    public String getSubtitle() {
        return subtitle;
    }

    /**
     * Sets the subtitle of the page.
     * @param subtitle page subtitle.
     */
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    /**
     * Gets the button text for the page.
     * @return button text.
     */
    public String getButtonText() {
        return buttonText;
    }

    /**
     * Sets the button text for the page.
     * @param buttonText button text.
     */
    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    /**
     * Gets the drawable resource for the page.
     * @return drawable resource.
     */
    public int getDrawableRes() {
        return drawableRes;
    }

    /**
     * Sets the drawable resource for the page.
     * @param drawableRes drawable resource.
     */
    public void setDrawableRes(int drawableRes) {
        this.drawableRes = drawableRes;
    }
}
