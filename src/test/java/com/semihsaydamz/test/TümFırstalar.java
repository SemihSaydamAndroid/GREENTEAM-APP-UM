package com.semihsaydamz.test;

import com.thoughtworks.gauge.Step;
import driver.Driver;
import io.appium.java_client.MobileElement;

public class TümFırstalar extends Driver {

    @Step("Tüm fırsatlar butonuna tıklanır")
    public void clickFırsat(){
        MobileElement fırsat = (MobileElement) appiumDriver.findElementById("com.gittigidiyormobil:id/seeAllContainer");
        fırsat.click();

    }






}
