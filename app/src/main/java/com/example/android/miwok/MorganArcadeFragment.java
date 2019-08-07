/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of phrases.
 */
public class MorganArcadeFragment extends Fragment {

    public MorganArcadeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.shop_list, container, false);

        // Create a list of shops
        final ArrayList<Shop> shops = new ArrayList<Shop>();
        shops.add(new Shop(R.string.morgan_one_name, R.string.morgan_one_description));
        shops.add(new Shop(R.string.morgan_two_name, R.string.morgan_two_description));
        shops.add(new Shop(R.string.morgan_three_name, R.string.morgan_three_description));
        shops.add(new Shop(R.string.morgan_four_name, R.string.morgan_four_description));
        shops.add(new Shop(R.string.morgan_five_name, R.string.morgan_five_description));

        // Create an {@link ShopAdapter}, whose data source is a list of {@link Shop}s. The
        // adapter knows how to create list items for each item in the list.
        ShopAdapter adapter = new ShopAdapter(getActivity(), shops, R.color.category_phrases);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ShopAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Shop} in the list.
        listView.setAdapter(adapter);


        return rootView;
    }

}
