package com.vexigon.libraries.onboarding.obj.selfselect;

import java.io.Serializable;
import java.util.ArrayList;

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

public class SSPage implements Serializable {
    private String title, subtitle;
    private ArrayList<BundledListItem> bundledListItems;
    private ArrayList<GridViewItem> gridViewItems;
    private ArrayList<ListItem> listItems;

    public SSPage(String title, String subtitle, ArrayList<BundledListItem> bundledListItems, ArrayList<GridViewItem> gridViewItems, ArrayList<ListItem> listItems) {
        this.title = title;
        this.subtitle = subtitle;
        this.bundledListItems = bundledListItems;
        this.gridViewItems = gridViewItems;
        this.listItems = listItems;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public ArrayList<BundledListItem> getBundledListItems() {
        return bundledListItems;
    }

    public void setBundledListItems(ArrayList<BundledListItem> bundledListItems) {
        this.bundledListItems = bundledListItems;
    }

    public ArrayList<GridViewItem> getGridViewItems() {
        return gridViewItems;
    }

    public void setGridViewItems(ArrayList<GridViewItem> gridViewItems) {
        this.gridViewItems = gridViewItems;
    }

    public ArrayList<ListItem> getListItems() {
        return listItems;
    }

    public void setListItems(ArrayList<ListItem> listItems) {
        this.listItems = listItems;
    }
}
