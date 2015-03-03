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
 * Use the {@link SorryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SorryFragment extends Fragment {

    View rootView;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     * @return A new instance of fragment SorryFragment.
     */
    public static SorryFragment newInstance() {
        SorryFragment fragment = new SorryFragment();
        return fragment;
    }

    public SorryFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_sorry, container, false);
        rootView.findViewById(R.id.actually_21_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((LoginActivity) getActivity()).loadFragment(new FacebookFragment());
            }
        });

        rootView.findViewById(R.id.exit_app_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().finish();
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
