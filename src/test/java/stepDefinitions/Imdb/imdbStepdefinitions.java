package stepDefinitions.Imdb;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.*;
import pages.ImdbPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.WriteToTxt;

import static org.junit.Assert.assertTrue;

public class imdbStepdefinitions {

    WebDriver driver;

    ImdbPage imdb = new ImdbPage();

    @Given("kullanici  imdb adresine gider")
    public void kullaniciImdbAdresineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("imdbUrl"));
    }

    @Then("Arama cubugunun sol tarafinda bulunan Menu butonuna basilir")
    public void aramaCubugununSolTarafindaBulunanMenuButonunaBasilir() throws InterruptedException {
        ReusableMethods.waitForVisibility(imdb.closeButton, 5);
        imdb.closeButton.click();
        imdb.menuButton.click();


    }


    @And("Gelen ekranda “Award & Events” başligi altinda bulunan “Oscars” butonuna tiklanir")
    public void gelenEkrandaAwardEventsBaşligiAltindaBulunanOscarsButonunaTiklanir() {
        ReusableMethods.waitFor(3);
        imdb.oscarsButton.click();
    }

    @And("Event History” basligi altinda “{int}” degeri secilir")
    public void eventHistoryBasligiAltindaDegeriSecilir(int arg0) {
        ReusableMethods.waitFor(4);
        imdb.eventhistroy.click();
    }

    @And("“Best Costume Design” basligi altinda “The God Father ” secilir")
    public void honoraryAwardBasligiAltindaTheCircusCharlesChaplinSecilir() {
        ReusableMethods.scrollIntoView(imdb.bestCostumedDesign);
        ReusableMethods.click(imdb.bestCostumedDesign);

    }

    @And("Gelen ekranda, The God Father’a ait Director: bilgisi kayit edilir. Writer: bilgisi kayit edilir. Stars: bilgisi kayit edilir.")
    public void gelenEkrandaTheCircusAAitDirectorBilgisiKayitEdilirWriterBilgisiKayitEdilirStarsBilgisiKayitEdilir() {

        WriteToTxt.writeDrictor(imdb.directorButton.getText());
        WriteToTxt.writeDrictor(imdb.writerButton.getText());
        WriteToTxt.writeDrictor(imdb.writerButton2.getText());
        WriteToTxt.writeDrictor(imdb.starsButton.getText());
        WriteToTxt.writeDrictor(imdb.starsButton2.getText());
        WriteToTxt.writeDrictor(imdb.starsButton3.getText());
        ReusableMethods.waitFor(4);


    }

    @And("Ekranin sol ustunde bulunan “IMDb” butonuna tiklanarak “Anasayfa’ya” donulur")
    public void ekraninSolUstundeBulunanIMDbButonunaTiklanarakAnasayfaYaDonulur() {
        imdb.menuButton2.click();
    }

    @And("Arama cubuguna “The God Father” yazilir.")
    public void aramaCubugunaTheCircusYazilir() {
        imdb.searchBoxButton.sendKeys("The Godfather");
        ReusableMethods.waitFor(3);
    }

    @And("Sonuclar arasinda gelen “The God Father’a” tiklanir.")
    public void sonuclarArasindaGelenTheCircusATiklanir() {
        imdb.theGodFatherSearchButton.click();
        //ReusableMethods.waitFor(2);
        //ReusableMethods.click(imdb.theCriusSearchButton2);
    }

    @And("Gelen ekranda; Director: bilgisi kayit edilen directorle ayni mi kontrol edilir.")
    public void gelenEkrandaDirectorBilgisiKayitEdilenDirectorleAyniMiKontrolEdilir() {
        WriteToTxt.writeDrictor(imdb.directorButton.getText());
        WriteToTxt.writeDrictor(imdb.writerButton.getText());
        WriteToTxt.writeDrictor(imdb.writerButton2.getText());
        WriteToTxt.writeDrictor(imdb.starsButton.getText());
        WriteToTxt.writeDrictor(imdb.starsButton2.getText());
        WriteToTxt.writeDrictor(imdb.starsButton3.getText());
        ReusableMethods.waitFor(4);
        assertTrue(imdb.directorButton.isEnabled());
        ReusableMethods.waitFor(2);

    }

    @And("Writer: bilgisi kayit edilen Writer’la ayni mi kontrol edilir.")
    public void writerBilgisiKayitEdilenWriterLaAyniMiKontrolEdilir() {
        assertTrue(imdb.writerButton.isEnabled());
        assertTrue(imdb.writerButton2.isEnabled());
        ReusableMethods.waitFor(2);
    }

    @And("Stars: bilgisi kayit edilen Starts’la ayni mi kontrol edilir.")
    public void starsBilgisiKayitEdilenStartsLaAyniMiKontrolEdilir() {
        assertTrue(imdb.starsButton.isEnabled());
        assertTrue(imdb.starsButton2.isEnabled());
        assertTrue(imdb.starsButton3.isEnabled());
        ReusableMethods.waitFor(2);
    }


    @And("Kontroller yapildiktan sonra “See all .. photos” linkine tiklanir")
    public void kontrollerYapildiktanSonraSeeAllPhotosLinkineTiklanir() {
        ReusableMethods.waitFor(4);
        ReusableMethods.scrollIntoView(imdb.photosButton);
        ReusableMethods.click(imdb.photosButton);
        ReusableMethods.waitForVisibility(imdb.linklist.get(0),10);

        System.out.println("tam baglantilarin ve görüntülerin boyutu-->" + imdb.linklist.size());
        for (int i = 0; i < imdb.linklist.size(); i++) {
            assertTrue(imdb.linklist.get(i).isEnabled());
        }
        ReusableMethods.waitFor(4);



    }


    }


   
