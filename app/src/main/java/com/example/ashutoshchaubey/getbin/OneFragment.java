package com.example.ashutoshchaubey.getbin;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class OneFragment extends Fragment {


    public OneFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_one, container, false);

        Typeface lobster = Typeface.createFromAsset(getContext().getAssets(), "fonts/lobster.otf");
        TextView tv = (TextView) rootView.findViewById(R.id.ftv1);
        tv.setTypeface(lobster);

        return rootView;

    }

}
