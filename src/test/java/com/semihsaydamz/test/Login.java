package com.semihsaydamz.test;

import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;
import driver.Driver;
import io.appium.java_client.MobileElement;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Login extends Driver{

    @Step("Take a screenshot with the name <pictureName>.")
    public void takesScreenshot(String pictureName) throws IOException {
            String fileName = "images/"+(pictureName)+".png";
            File file = new File("reports/html-report/"+fileName);
            if(file.exists()) {
                file.delete();
            }
            File scrFile = ((TakesScreenshot)appiumDriver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, file);
            Gauge.writeMessage("<img src='../"+fileName+"' width='800' height='480'");

    }

    @Step("Hesabım kısmına tıklanır.")
    public void clickSearch() {
        MobileElement elementOne = (MobileElement) appiumDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[4]");
        elementOne.click();
    }

    @Step("Email bilgisi <key> olarak girilir")
    public void email(String key){
        MobileElement elementEmail = (MobileElement) appiumDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText");
        elementEmail.sendKeys(key);
    }


    @Step("Şifre bilgisi <key> olarak girilir")
    public void password(String key) {
        MobileElement elementTwo = (MobileElement) appiumDriver.findElementById("password");
        elementTwo.sendKeys(key);


    }

    @Step("Giriş yap butonuna tıklanır")
    public void clickLoginButton(){
        MobileElement elementLoginClick = (MobileElement) appiumDriver.findElementById("loginBtn");
        elementLoginClick.click();
    }




    //CAPTCHA'ya atacağı için senaryo burada sonlandırılır.



    //Hesabım —> bottomBarTab
   // Email —> til_signInEmail
   // Önce tıklat sonra yaz
    //Görünme butonu —> text_input_end_icon
    //Id—> password

 }

