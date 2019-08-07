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

/**
 * {@link Shop} represents a shop in one of Cardiff's arcades.
 * It contains resource IDs for the default translation, Miwok translation, audio file, and
 * optional image file for that word.
 */
public class Shop {

    /** String resource ID for a short description of the shop */
    private int mShopDescription;

    /** String resource ID for the name of the shop */
    private int mShopName;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Shop object.
     *
     * @param shopName is the string resource ID of the shop's name
     * @param shopDescription is the string resource ID for a short description of
     *                        the shop
     */
    public Shop(int shopName, int shopDescription) {
        mShopDescription = shopDescription;
        mShopName = shopName;
    }

    /**
     * Create a new Shop object.
     *
     * @param shopDescription is the string resource ID for a short description of
     *                        the shop
     * @param shopName is the string resource ID for the shop's name
     * @param imageResourceId is the drawable resource ID for the image associated with the shop
     */
    public Shop(int shopDescription, int shopName, int imageResourceId) {
        mShopDescription = shopDescription;
        mShopName = shopName;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the string resource ID for the shop's description.
     */
    public int getShopDescription() {
        return mShopDescription;
    }

    /**
     * Get the string resource ID for the shop's name.
     */
    public int getShopName() {
        return mShopName;
    }

    /**
     * Return the image resource ID of the shop.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this shop.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}