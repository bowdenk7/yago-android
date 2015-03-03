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
 * Use the {@link FacebookFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FacebookFragment extends Fragment {
    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     * @return A new instance of fragment FacebookFragment.
     */
    public static FacebookFragment newInstance() {
        FacebookFragment fragment = new FacebookFragment();
        return fragment;
    }

    public FacebookFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_facebook, container, false);
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
