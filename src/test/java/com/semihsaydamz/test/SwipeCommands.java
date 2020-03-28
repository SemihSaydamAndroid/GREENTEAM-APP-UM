package com.semihsaydamz.test;

import com.thoughtworks.gauge.Step;
import driver.Driver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;

import java.awt.*;

public class SwipeCommands extends Driver {
    //Kaydırma fonksiyonları

    @Step("<yon> yönüne kaydırma")
    public void swipe(String yon){

        TouchAction action = new TouchAction(appiumDriver);
        PointOption p1= new PointOption();
        Dimension dimensions = appiumDriver.manage().window().getSize();
        // Dimension dimen = appiumDriver.manage().window().getSize();
     //   int height = dimen.height;
     //   int width = dimen.width;

        if (yon.equals("AŞAĞI")){

            Double screenHeightStart = dimensions.getHeight() * 0.5;
            int h1 = screenHeightStart.intValue();
            Double screenHeightEnd = dimensions.getHeight() * 0.2;
            int h2 = screenHeightEnd.intValue();
            action.press(p1.point(0, h1)).moveTo(p1.point(0,-h2)).release().perform();

        } else if(yon.equals("YUKARI")){

            Double screenHeightStart = dimensions.getHeight() * 0.2;
            int h1 = screenHeightStart.intValue();
            Double screenHeightEnd = dimensions.getHeight() * 0.5;
            int h2 = screenHeightEnd.intValue();
            action.press(p1.point(0, h2)).moveTo(p1.point(0,-h1)).release().perform();

        }else if(yon.equals("SAĞ")) {

            Double screenWidthStart = dimensions.getWidth() * 0.5;
            int w1 = screenWidthStart.intValue();
            Double screenWidthEnd = dimensions.getWidth() * 0.2 ;
            int w2 = screenWidthEnd.intValue();
            action.press(p1.point(0,w1)).moveTo(p1.point(0,-w2)).release().perform();

        } else if(yon.equals("SOL")){

            Double screenWidthStart = dimensions.getWidth() * 0.2;
            int w1 = screenWidthStart.intValue();
            Double screenWidthEnd = dimensions.getWidth() * 0.5;
            int w2 = screenWidthEnd.intValue();
            action.press(p1.point(0,w2)).moveTo(p1.point(0,-w1)).release().perform();

        }
    }


}
