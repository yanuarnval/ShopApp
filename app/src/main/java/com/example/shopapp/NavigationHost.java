package com.example.shopapp;

import androidx.fragment.app.Fragment;

public interface NavigationHost {

    void navigateTo(Fragment fragment,boolean addBackStack);
}
