package me.blankm.indicatorseekbar;


import android.widget.TextView;


import com.google.android.material.tabs.TabLayout;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import me.blankm.indicatorseekbar.donation.BaseActivity;
import me.blankm.indicatorseekbar.donation.DonationFragment;
import me.blankm.indicatorseekbar.fragment.ContinuousFragment;
import me.blankm.indicatorseekbar.fragment.CustomFragment;
import me.blankm.indicatorseekbar.fragment.DiscreteFragment;
import me.blankm.indicatorseekbar.fragment.IndicatorFragment;
import me.blankm.indicatorseekbar.fragment.JavaBuildFragment;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends BaseActivity {

    private static String[] sType = new String[]{"continuous", "discrete", "custom", "java", "indicator"};
    private List<Fragment> mFragmentList = new ArrayList<>();

    @Override
    public int getLayoutResId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initCreate() {
        super.initCreate();
        initFragment();
        initViews();
    }

    private void initFragment() {
        mFragmentList.add(new ContinuousFragment());
        mFragmentList.add(new DiscreteFragment());
        mFragmentList.add(new CustomFragment());
        mFragmentList.add(new JavaBuildFragment());
        mFragmentList.add(new IndicatorFragment());
//        mFragmentList.add(new DonationFragment());
    }

    private void initViews() {
        ViewPager viewPager = findViewById(R.id.viewPager);
        TabLayout tabLayout = findViewById(R.id.tabLayout);

        viewPager.setAdapter(new PagerAdapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);

        for (String s : sType) {
            TextView textView = new TextView(this);
            textView.setText(s);
            tabLayout.newTab().setCustomView(textView);
        }

    }

    private class PagerAdapter extends FragmentPagerAdapter {

        public PagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return sType.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return sType[position];
        }
    }


}
