package com.it.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseTest {
    @Test
    public void test() throws InterruptedException {
        app.login.login(validUser);
        Assert.assertEquals(app.dashboard.getMailUser(), validUser.email);
        app.common.takeScreenshot();

    }
}
