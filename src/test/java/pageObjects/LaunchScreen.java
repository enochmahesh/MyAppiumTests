package pageObjects;
import com.testAppium.TestSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.net.MalformedURLException;

public class LaunchScreen {
       TestSetUp setUp = new TestSetUp();

       public WebElement setLanguage() throws MalformedURLException, InterruptedException {
           setUp.settingUp();
           if(ExpectedConditions.alertIsPresent()==null){
               return setUp.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.RelativeLayout/android.widget.ImageView[1]"));
           }else{
               setUp.driver.switchTo().alert().accept();
               return setUp.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.RelativeLayout/android.widget.ImageView[1]"));
           }

       }
        public WebElement btnContinue() throws MalformedURLException, InterruptedException {
            return  setUp.driver.findElement(By.id("com.flipkart.android:id/select_btn"));

    }
        public WebElement denySignUp() throws MalformedURLException, InterruptedException {
            return  setUp.driver.findElement(By.id("com.google.android.gms:id/cancel"));

    }
        public WebElement iconClose() throws MalformedURLException, InterruptedException {
            return  setUp.driver.findElement(By.id("com.flipkart.android:id/custom_back_icon"));

    }

}
