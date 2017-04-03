package com.kpgn.sonarqubedemo.activity;

import com.kpgn.sonarqubedemo.BuildConfig;
import com.kpgn.sonarqubedemo.application.SonarQubeDemoApplication;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.util.ActivityController;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class MainActivityTest {

    MainActivity activity;
    ActivityController<MainActivity> controller;

    @Before
    public void setup() {
        SonarQubeDemoApplication.inject(this);
        activity = new MainActivity();
        controller = ActivityController.of(Robolectric.getShadowsAdapter(), activity);
        controller.setup();
    }

    @Test
    public void onCreate_shouldSetTitle() throws Exception {
        assertThat(activity.getTitle()).isEqualTo("SonarQube Demo");
    }

    @Test
    public void onBackPressed_whenNavDrawerOpened_shouldCloseNavDrawer() throws Exception {
        activity.onBackPressed();
    }
}
