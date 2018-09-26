package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest {

    @Rule
    public ActivityTestRule mActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void checkForNonEmptyAsyncTaskResult(){
        String result;
        result = new EndpointsAsyncTask().doInBackground(mActivityTestRule.getActivity());

        Log.d("Test", "checkForNonEmptyAsyncTaskResult: Result Retrieved");

        assertNotNull(result);
    }
}
