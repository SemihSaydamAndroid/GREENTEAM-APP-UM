package com.semihsaydamz.test;

import com.thoughtworks.gauge.Step;
import driver.Driver;
import io.appium.java_client.MobileElement;


public class StepImplementation extends Driver{

    @Step("Arama alanına tıklanır")
    public void clickSearch() {
        MobileElement elementOne = (MobileElement) appiumDriver.findElementById("actionSearchBoxACT");
        elementOne.click();
    }

    @Step("Arama alanına <key> değeri girilir.")
    public void Search(String key){
        MobileElement elementTwo = (MobileElement) appiumDriver.findElementById("actionSearchBoxACT");
        elementTwo.sendKeys(key);
    }

    @Step("Açılan sekmeye tıklanır")
    public void clickCancel() {
            MobileElement elementThree = (MobileElement) appiumDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout");
            elementThree.click();
    }

    @Step("Açılan ürünlerden ilk ürün seçilir")
    public void selectItem(){
        MobileElement elementSelect = (MobileElement) appiumDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]");
        elementSelect.click();

    }



}




