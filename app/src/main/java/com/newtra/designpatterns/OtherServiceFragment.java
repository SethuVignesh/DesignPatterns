//package com.newtra.designpatterns;
//
//import android.os.Bundle;
//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentManager;
//import android.support.v4.app.FragmentPagerAdapter;
//import android.support.v4.view.ViewPager;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import java.util.Locale;
//
//public class OtherServiceFragment extends Fragment {
//
//	/**
//	 * The {@link android.support.v4.view.PagerAdapter} that will provide
//	 * fragments for each of the sections. We use a
//	 * {@link FragmentPagerAdapter} derivative, which
//	 * will keep every loaded fragment in memory. If this becomes too memory
//	 * intensive, it may be best to switch to a
//	 * {@link android.support.v4.app.FragmentStatePagerAdapter}.
//	 */
//	SectionsPagerAdapter mSectionsPagerAdapter;
//
//	public static final String TAG = OtherServiceFragment.class.getSimpleName();
//
//	/**
//	 * The {@link ViewPager} that will host the section contents.
//	 */
//	ViewPager mViewPager;
//
//
//	public static OtherServiceFragment newInstance() {
//		return new OtherServiceFragment();
//	}
//
//	@Override
//	public void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//	}
//
//	@Override
//	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//		View v = inflater.inflate(R.layout.activity_item_one, container, false);
//		mSectionsPagerAdapter = new SectionsPagerAdapter(
//				getChildFragmentManager());
//
//		mViewPager = (ViewPager) v.findViewById(R.id.pager);
//		mViewPager.setAdapter(mSectionsPagerAdapter);
//
//		return v;
//	}
//
//	/**
//	 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
//	 * one of the sections/tabs/pages.
//	 */
//	public class SectionsPagerAdapter extends FragmentPagerAdapter {
//
//		public SectionsPagerAdapter(FragmentManager fm) {
//			super(fm);
//		}
//
//		@Override
//		public Fragment getItem(int position) {
//			// getItem is called to instantiate the fragment for the given page.
//			// Return a DummySectionFragment (defined as a static inner class
//			// below) with the page number as its lone argument.
////			Fragment fragment = new DummySectionFragment();
////			Bundle args = new Bundle();
////			args.putInt(DummySectionFragment.ARG_SECTION_NUMBER, position + 1);
////			fragment.setArguments(args);
//
//			switch (position) {
//				case 0:
//					// Top Rated fragment activity
//					return new HospitalFragment();
//				case 1:
//					// Games fragment activity
//					return new KennelFragment();
//				case 2:
//					// Movies fragment activity
//					return new ClinicFragment();
//				case 3:
//					// Movies fragment activity
//					return new PetSpaFragment();
//				case 4:
//					// Movies fragment activity
//					return new DoctorFragment();
//			}
//
//			return null;
//
//		}
//
//		@Override
//		public int getCount() {
//			// Show 3 total pages.
//			return 5;
//		}
//
//		@Override
//		public CharSequence getPageTitle(int position) {
//			Locale l = Locale.getDefault();
//			switch (position) {
//			case 0:
//				return "Hospital".toUpperCase(l);
//			case 1:
//				return "Kennel".toUpperCase(l);
//			case 2:
//				return "Clinic".toUpperCase(l);
//				case 3:
//					return "Pet Spa".toUpperCase(l);
//				case 4:
//					return "Doctor".toUpperCase(l);
//			}
//			return null;
//		}
//	}
//
//	/**
//	 * A dummy fragment representing a section of the app, but that simply
//	 * displays dummy text.
//	 */
//	public static class DummySectionFragment extends Fragment {
//		/**
//		 * The fragment argument representing the section number for this
//		 * fragment.
//		 */
//		public static final String ARG_SECTION_NUMBER = "section_number";
//
//		public DummySectionFragment() {
//		}
//
//		@Override
//		public View onCreateView(LayoutInflater inflater, ViewGroup container,
//				Bundle savedInstanceState) {
//			View rootView = inflater.inflate(R.layout.fragment_other_service_tabbed_dummy,
//					container, false);
//			TextView dummyTextView = (TextView) rootView
//					.findViewById(R.id.section_label);
//			dummyTextView.setText(Integer.toString(getArguments().getInt(
//					ARG_SECTION_NUMBER)));
//			return rootView;
//		}
//	}
//
//}
