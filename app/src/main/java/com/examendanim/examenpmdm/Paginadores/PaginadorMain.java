package com.examendanim.examenpmdm.Paginadores;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.examendanim.examenpmdm.fragmentos.FragBoton;
import com.examendanim.examenpmdm.fragmentos.FragDos;
import com.examendanim.examenpmdm.fragmentos.FragTres;


public class PaginadorMain extends FragmentPagerAdapter {

    private final Context mContext;

    public PaginadorMain(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FragBoton();
            case 1:
                return new FragDos();
            case 2:
                return new FragTres();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}