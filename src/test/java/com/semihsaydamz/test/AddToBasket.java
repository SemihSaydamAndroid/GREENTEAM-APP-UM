package com.semihsaydamz.test;

import com.thoughtworks.gauge.Step;
import driver.Driver;
import io.appium.java_client.MobileElement;

public class AddToBasket extends Driver {

    @Step("Fırsat ürünü almak için tüm fırsatlar'a tıklanır")
    public void clickFırsat() {
        MobileElement elementFırsat = (MobileElement) appiumDriver.findElementById("rollerSeeAll");
        elementFırsat.click();
    }

    @Step("Ürüne tıklanır")
    public void clickProduct(){
        MobileElement elementProduct = (MobileElement) appiumDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]");
        elementProduct.click();
    }

}
