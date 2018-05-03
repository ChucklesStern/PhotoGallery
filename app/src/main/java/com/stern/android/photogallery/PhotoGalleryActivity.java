package com.stern.android.photogallery;

import android.support.v4.app.Fragment;

/*
Lab 13
Adamstern@my.smccd.edu
April 30, 2017
PhotoGalleryActivity.java


 */
public class PhotoGalleryActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return PhotoGalleryFragment.newInstance();
    }
}
