package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.loginClockifyConstants;
import org.testng.Assert;


public class loginClockifyService {
    public static void loginVisible() {
        MobileActionManager.waitVisibility(loginClockifyConstants.LOGIN_TEXT);
        Assert.assertTrue(MobileActionManager.isVisible(loginClockifyConstants.LOGIN_TEXT), "No se encuentra el texto Login");
    }

    public static void loginTextVisible() {
        MobileActionManager.waitVisibility(loginClockifyConstants.TIME_ENTRIES_TEXT);
        Assert.assertTrue(MobileActionManager.isVisible(loginClockifyConstants.TIME_ENTRIES_TEXT), "No se encuentra el texto Time Entries");
    }

    public static void loginRegisterVisible() {
        MobileActionManager.waitVisibility(loginClockifyConstants.LOGIN_REGISTER_TEXT);
        Assert.assertTrue(MobileActionManager.isVisible(loginClockifyConstants.LOGIN_REGISTER_TEXT), "No se encuentra el texto Login");
    }
}
