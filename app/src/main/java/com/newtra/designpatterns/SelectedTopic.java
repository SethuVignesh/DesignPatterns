package com.newtra.designpatterns;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Locale;

public class SelectedTopic extends Fragment {

    SectionsPagerAdapter mSectionsPagerAdapter;

    public static final String TAG = SelectedTopic.class.getSimpleName();

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    ViewPager mViewPager;

    static BeanDesignPattern pattern;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        String strtext = getArguments().getString("topic");
        pattern = (BeanDesignPattern)getArguments().getParcelable("data");

        View v = inflater.inflate(R.layout.activity_item_one, container, false);
        mSectionsPagerAdapter = new SectionsPagerAdapter(
                getChildFragmentManager());

        mViewPager = (ViewPager) v.findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        return v;
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a DummySectionFragment (defined as a static inner class
            // below) with the page number as its lone argument.
//			Fragment fragment = new DummySectionFragment();
//			Bundle args = new Bundle();
//			args.putInt(DummySectionFragment.ARG_SECTION_NUMBER, position + 1);
//			fragment.setArguments(args);

            switch (position) {
                case 0:
                    // Top Rated fragment activity
                    return new FragmentPurpose();
                case 1:
                    // Games fragment activity
                    return new FragmentUseWhen();
                case 2:
                    // Movies fragment activity
                    return new FragmentExamples();
                case 3:
                    // Movies fragment activity
                    return new FragmentClassDiagram();

            }

            return null;

        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            Locale l = Locale.getDefault();
            switch (position) {
                case 0:
                    return "purpose".toUpperCase(l);
                case 1:
                    return "use when".toUpperCase(l);
                case 2:
                    return "examples".toUpperCase(l);
                case 3:
                    return "class diagram".toUpperCase(l);

            }
            return null;
        }
    }


}
