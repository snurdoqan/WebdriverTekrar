package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Driver {
    public static  void main(String[] args) {
        System.setProperty("chromedriver","src/resources/drivers/chromedriver.exe");
   //System.setProperty() methodu java uygulamalarında sistem özelliklerini ayarlamak için kullanılır
  //Key olarak bir isim sonrasında bu key'e ait değer olan driver'ımızın fiziki yolunu belirtiriz
 /* Bunun için projemezime drivers package'ı altına koyduğumuz chromedriver.exe dosyasının yolunu
   üzerine sağ tıklayarak copy path seçeneği ile content root sekmesiyle yolunu alabiliriz.  */
        System.out.println(System.getProperty("chromedriver"));
        WebDriver driver = new ChromeDriver();//-->Boş bir browser açar
        driver.get("https://techproeducation.com");//-->get() methodu string olarak belittiğimiz sayfaya gider

    }
}
