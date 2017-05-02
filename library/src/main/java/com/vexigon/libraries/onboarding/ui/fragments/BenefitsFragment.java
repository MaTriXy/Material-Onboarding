package com.vexigon.libraries.onboarding.ui.fragments;

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

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.vexigon.libraries.onboarding.R;
import com.vexigon.libraries.onboarding.ui.interfaces.BenefitsFragmentInterface;
import com.vexigon.libraries.onboarding.util.BenefitsKeys;

/**
 * Created by Andrew Quebe on 3/2/2017.
 */

public class BenefitsFragment extends Fragment implements BenefitsFragmentInterface {

    LinearLayout layout;
    ImageView illustration;
    TextView titleText, subtitleText;
    Button getStarted;
    int position;

    public BenefitsFragment() {
    }

    @SuppressLint("ValidFragment")
    public BenefitsFragment(int position) {
        this.position = position;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.user_benefits_fragment, container, false);
    }

    @SuppressWarnings("ConstantConditions")
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        layout = (LinearLayout) getView().findViewById(R.id.userBenefitsLayout);
        illustration = (ImageView) getView().findViewById(R.id.illustrationRes);
        titleText = (TextView) getView().findViewById(R.id.titleText);
        subtitleText = (TextView) getView().findViewById(R.id.subtitleText);
        getStarted = (Button) getView().findViewById(R.id.getStarted);

        Glide.with(getActivity())
                .load(getIllustrationResource(position))
                .override(256, 256)
                .dontTransform()
                .dontAnimate()
                .into(illustration);

        titleText.setText(getTitleText(position));
        subtitleText.setText(getSubtitleText(position));

        getStarted.setText(getButtonText(position));
        getStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                 * Display a 'Get Started' button throughout the animation, and loop through the animation continuously until the 'Get Started' action is tapped.
                 * https://material.io/guidelines/growth-communications/onboarding.html#onboarding-top-user-benefits
                 */
                getActivity().finish();
            }
        });

        layout.setBackgroundColor(Color.parseColor(getBackgroundColor(position)));
    }

    @Override
    public String getTitleText(int position) {
        return getActivity().getIntent().getStringArrayExtra(BenefitsKeys.TITLE_TEXT)[position];
    }

    @Override
    public String getSubtitleText(int position) {
        return getActivity().getIntent().getStringArrayExtra(BenefitsKeys.SUBTITLE_TEXT)[position];
    }

    @Override
    public String getButtonText(int position) {
        if (getActivity().getIntent().getStringArrayExtra(BenefitsKeys.BUTTON_TEXT) == null)
            return getResources().getString(R.string.get_started);
        else
            return getActivity().getIntent().getStringArrayExtra(BenefitsKeys.BUTTON_TEXT)[position];
    }

    @Override
    public int getIllustrationResource(int position) {
        return getActivity().getIntent().getIntArrayExtra(BenefitsKeys.ILLUSTRATION_RES)[position];
    }

    @Override
    public String getBackgroundColor(int position) {
        if (getActivity().getIntent().getStringArrayExtra(BenefitsKeys.BACKGROUND_COLOR_RES) == null)
            return getString(R.string.white);
        else
            return getActivity().getIntent().getStringArrayExtra(BenefitsKeys.BACKGROUND_COLOR_RES)[position];
    }
}
