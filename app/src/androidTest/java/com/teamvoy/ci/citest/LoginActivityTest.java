package com.teamvoy.ci.citest;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by dmytro on 10/20/15.
 */
public class LoginActivityTest extends ActivityInstrumentationTestCase2<LoginActivity> {

    private LoginActivity activity;

    public LoginActivityTest() {
        super(LoginActivity.class);
    }

    public void setUp() throws Exception {
        super.setUp();
        setActivityInitialTouchMode(false);
        activity = getActivity();
    }

    public void testACt() {
        assertNotNull("activity", activity);
    }

    public void testACt2() {
        assertNull("activity", activity);
    }
}