package com.rd.pageindicatorview.base;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.rd.pageindicatorview.sample.R;


public class BaseFragment extends Fragment {
    public static final String BACKGROUND_COLOR = "param1";
    private int backgroundColor;

    public BaseFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            backgroundColor = getArguments().getInt(BACKGROUND_COLOR);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_base, container, false);
        LinearLayout linearLayout = view.findViewById(R.id.linear_layout);
        linearLayout.setBackgroundColor(ContextCompat.getColor(getContext(), backgroundColor));
        return view;
    }

}
