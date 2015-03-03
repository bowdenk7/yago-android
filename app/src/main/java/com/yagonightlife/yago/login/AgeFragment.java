package com.yagonightlife.yago.login;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yagonightlife.yago.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AgeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AgeFragment extends Fragment {

    private View rootView;

    public static AgeFragment newInstance() {
        AgeFragment fragment = new AgeFragment();
        return fragment;
    }

    public AgeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_age, container, false);

        rootView.findViewById(R.id.login_button_over_21).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((LoginActivity) getActivity()).loadFragment(new FacebookFragment());
            }
        });

        rootView.findViewById(R.id.login_button_under_21).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((LoginActivity) getActivity()).loadFragment(new SorryFragment());
            }
        });
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

}
