package com.example.chatapp_resume_project;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class viewpageradapter extends FragmentStateAdapter {
    public viewpageradapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull

    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0 : return new fragment1();
            case 1 : return new fragment2();
            case 3 : return new fragment3();
            default: return new fragment1();

        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
