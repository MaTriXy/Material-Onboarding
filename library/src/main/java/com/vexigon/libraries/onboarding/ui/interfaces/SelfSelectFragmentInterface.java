package com.vexigon.libraries.onboarding.ui.interfaces;

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

import com.vexigon.libraries.onboarding.obj.selfselect.BundledListItem;
import com.vexigon.libraries.onboarding.obj.selfselect.GridViewItem;
import com.vexigon.libraries.onboarding.obj.selfselect.ListItem;
import com.vexigon.libraries.onboarding.obj.selfselect.User;

import java.util.ArrayList;

/**
 * Created by Andrew Quebe on 3/2/2017.
 */

public interface SelfSelectFragmentInterface {
    int getUserPageImage(int position);

    ArrayList<User> getLoggedInUsers();

    String getSelfSelectTitle(int position);

    String getSelfSelectSubtitle(int position);

    ArrayList<BundledListItem> getBundledListItems();

    ArrayList<GridViewItem> getGridviewItems();

    ArrayList<ListItem> getListItems();
}
