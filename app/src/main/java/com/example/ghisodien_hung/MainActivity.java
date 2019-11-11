package com.example.ghisodien_hung;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView mMainNav;
    private FrameLayout mMainlayout;
    ActionBar actionBar;

    private Chitiet_KHFragment chitiet_khFragment;
    private Down_loadFragment downLoadFragment;
    private Up_LoadFragment upLoadFragment;
    private Loc_DSFragment locDsFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("");

        mMainlayout = (FrameLayout) findViewById(R.id.main_frame);
        mMainNav = (BottomNavigationView) findViewById(R.id.main_nav);

        chitiet_khFragment = new Chitiet_KHFragment();
        downLoadFragment = new Down_loadFragment();
        upLoadFragment = new Up_LoadFragment();
        locDsFragment = new Loc_DSFragment();

        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.nav_chitiet :
                        mMainNav.setItemBackgroundResource(R.color.colorAccent);
                        setFragment(chitiet_khFragment);
                        return true;
                    case R.id.nav_locds :
                        mMainNav.setItemBackgroundResource(R.color.colorAccent);
                        setFragment(locDsFragment);
                        return true;
                    case R.id.nav_down :
                        mMainNav.setItemBackgroundResource(R.color.colorAccent);
                        setFragment(downLoadFragment);
                        return true;
                    case R.id.nav_upload :
                        mMainNav.setItemBackgroundResource(R.color.colorAccent);
                        setFragment(upLoadFragment);
                        return true;

                        default:return false;

                }

            }

            private void setFragment(Fragment fragment) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main_frame, fragment);
                fragmentTransaction.commit();

            }


        });

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}
