package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.view.View;

import com.jpardogo.android.googleprogressbar.library.GoogleProgressBar;

public class Utils {

    public static void inflateCommonLayout(){

    }

    static void tellJoke(GoogleProgressBar progressBar, Context context) {
        progressBar.setVisibility(View.VISIBLE);
        new EndpointsAsyncTask().execute(context);
    }

}
