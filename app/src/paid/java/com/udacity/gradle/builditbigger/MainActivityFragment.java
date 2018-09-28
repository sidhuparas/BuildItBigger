package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.jpardogo.android.googleprogressbar.library.GoogleProgressBar;

import mehdi.sakout.fancybuttons.FancyButton;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private GoogleProgressBar progressBar;
    private FancyButton tellJokeBtn;

    public MainActivityFragment() { }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        progressBar = root.findViewById(R.id.progress_bar_google);
        tellJokeBtn = root.findViewById(R.id.tell_joke_btn);

        tellJokeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.tellJoke(progressBar, requireContext());
            }
        });
        return root;
    }

    @Override
    public void onPause() {
        super.onPause();
        progressBar.setVisibility(View.GONE);
    }
}
