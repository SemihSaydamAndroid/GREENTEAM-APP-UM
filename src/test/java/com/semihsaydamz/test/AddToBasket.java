package com.semihsaydamz.test;

import com.thoughtworks.gauge.Step;
import driver.Driver;
import io.appium.java_client.MobileElement;
import static Constants.Constants.*;

public class AddToBasket extends Driver {
//
    @Step("Üründen <key> adet ekle")
    public void increaseProduct(String key) {
        if (key.equals("iki")) {
            MobileElement increaseProduct = (MobileElement) appiumDriver.findElementById("com.gittigidiyormobil:id/btnPlusVariant");
            increaseProduct.click();
        } else if (key.equals("üç")) {
            for (int i = 0; i < 2; i++) {
                MobileElement increaseProduct = (MobileElement) appiumDriver.findElementById("com.gittigidiyormobil:id/btnPlusVariant");
                increaseProduct.click();
            }
        } else if (key.equals("dört")) {
            for (int i = 0; i < 3; i++) {
                MobileElement increaseProduct = (MobileElement) appiumDriver.findElementById("com.gittigidiyormobil:id/btnPlusVariant");
                increaseProduct.click();
            }
        }
    }//

    @Step("Sepete ekle butonuna basılır")
    public void clickBasket() {
        MobileElement clickToBasket = (MobileElement) appiumDriver.findElementById("com.gittigidiyormobil:id/btnAddBasket");
        clickToBasket.click();
    }

    @Step("Sepetim sekmesine gidilir")
    public void goToBasket() {
        MobileElement goTotBasket = (MobileElement) appiumDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[3]");
        goTotBasket.click();
    }

}



    //2 yapma id :
    // com.gittigidiyormobil:id/btnPlusVariant
    // /hierarchy/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ImageView[2]

    //sepete ekle
    // com.gittigidiyormobil:id/btnAddBasket
    // hierarchy/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.Button[2]

    // sepet sekmesine tıkla
    // /hierarchy/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[3]

