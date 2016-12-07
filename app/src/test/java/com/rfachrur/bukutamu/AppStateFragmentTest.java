package com.rfachrur.bukutamu;

import android.os.Build;

import com.rfachrur.bukutamu.fragments.AppStateFragment;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.*;


@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)
public class AppStateFragmentTest {

    private AppStateFragment fragment;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void shouldNotBeNull() throws Exception {
        assertNotNull(fragment);
    }

}