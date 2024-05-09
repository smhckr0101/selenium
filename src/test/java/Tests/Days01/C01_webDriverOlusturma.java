package Tests.Days01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_webDriverOlusturma {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("Webdriver.chrome.driver","kurulum dosyaları/chromedriver.exe");

        // selenıum 4 ile birlikte
        // selenium kendi webdriver ını kodların içine koydu.

        //selenium 4 sonrasında yukarıda 16. satırda yazdığımız driver ayarı
        // opsiyonel hale geldi.
        // eğer çalıştığımız şirket özel bir web driver kullanmamızı isterse
        // bize kullanacağımız web driver ın kurulum dosyasını verirler.
        // biz de 16.satırda verilen webdriver ı tanımlarız.

        //Eğer çalıştığımız şirket web driver seçimini bize bırakırsa
        // veya seleniumun kendi web driver ını kullan derslerse
        // 16. satırı hiiiiiç kullanmayız.

        WebDriver driver = new ChromeDriver();

        // Biz web de yapacağımız tüm testler için web driver objesine ihtiyaç duyarız.
        // Webdriver objesi bizim elimiz,gözümüz,lkavyemiz ve mosue'muzdur.
        // dolayısıyla bir test yazacaksak
        // Once webdriver objesi oluşturmalıyız.

        // biz 25.satırdaki kodu yazdığımızda
        // selenium eşitliğin sağında hangi constructor ı kullandı isek
        // o browser ın bir kopyasını oluşturur ve bizim kullanımımıza sunar

        // oluşturulan kopya browser'da
        // chrome is being conrolled by automated test software yazar.

        // test otomasyonu anasayfaya gidin
        driver.get("https://www.testotomasyonu.com");

        /*
        Bir web sayfasına gştmek istediğimizde
        webDriver.get("istenenurl") kullanılır.

        Gitmek istediğimiz web sayfasının url sinde www yazmasak da istnene sayfa açılır
        Ancak https:// yazılmazsa istenen sayfa açılmaz.
         */

        // 5 saniye bekleyin
        Thread.sleep(5000);
        /*
        Bu method java dan gelir ve kodları yazılan milisaniye kadar bekletir.

        Biz genelde bir testi ilk defa çalıştırmak istediğimizde
        adımların doğru şekilde ilerlediğini görmek için
        aralara thread.Sleep(....) koyarız.

        Testin üzerinde çalışmamız bittiğinde
        artık testimiz sorunsuz çalışıyoz dediğimizde
        Thread.sleep(...) ları silmeniz tavsiye olunur.

         */

        // sayfayı kapatın

        driver.quit();
        // driver.close da aynı işlemi yapar
        // ancak bazı sürümlerde sağlıklı çalışmayabilir.
        // onun için quit tercih edilebilir

        // Selenium bu kapatma işlemini 2 farklı metodla yapma sebebi
        // driver.close(); üzerinde çalışılan tek bir browser ı kapatır.
        // driver.quit() ise birden fazla browser açıldıysa açtığı tüm browser ları kapatır.

        /*
        25.satıda yazdığımızda oluşturulan webdriver objesini kapatır.


         */


    }
}
