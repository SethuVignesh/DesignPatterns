package com.newtra.designpatterns;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by vset0001 on 6/20/2015.
 */
public class FragmentExamples extends Fragment {

    public FragmentExamples() {
    }

    private TextView lv1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_whats_hot, container, false);

        lv1 = (TextView) rootView.findViewById(R.id.listViewOne);
        lv1.setText(SelectedTopic.pattern.getExample());

        return rootView;
    }

    @Override
    public void setMenuVisibility(final boolean visible) {
        super.setMenuVisibility(visible);
        if (visible && getActivity() != null) {

        }
    }


}
