package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.entradaHorasConstants;
import com.crowdar.examples.constants.loginClockifyConstants;
import com.sun.jna.WString;
import org.testng.Assert;

public class entradaHorasService {

    public static void addEntriesVisible() {
        MobileActionManager.waitVisibility(entradaHorasConstants.ADD_ENTRY_TEXT);
        Assert.assertTrue(MobileActionManager.isVisible(entradaHorasConstants.ADD_ENTRY_TEXT), "No se encuentra el texto Add entry");
    }

    public static void thisWeekTextVisible() {
        MobileActionManager.waitVisibility(entradaHorasConstants.THISWEEK_TEXT);
        Assert.assertTrue(MobileActionManager.isVisible(entradaHorasConstants.THISWEEK_TEXT), "No se encuentra el texto This Week");
    }

    public static void contadorClicsHora(String hora) {
        int numHora = Integer.parseInt(hora);
        for (int i = 0; i < numHora; i++) {
            MobileActionManager.click(entradaHorasConstants.HORA_SCROLL);
        }
    }

    public static void contadorClicsMin(String min) {
        int numHora = Integer.parseInt(min);
        for (int i = 0; i < numHora; i++) {
            MobileActionManager.click(entradaHorasConstants.MIN_SCROLL);
        }
    }

    public static String setFecha(String fecha) {
        return String.format("xpath://android.view.View[@content-desc='%s']", fecha);

    }

    public static void enableDarkModeVisible() {
        Assert.assertTrue(MobileActionManager.isVisible(entradaHorasConstants.ENABLE_DARKMODE_TEXT), "No se encuentra el texto Add entry");
    }
}
