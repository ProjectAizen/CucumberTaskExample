package stepDefinitions.HepsiBurada;

import groovyjarjarantlr4.v4.codegen.model.Action;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.HepsiBuradaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class hepsiBuradaSetepdefinition {

    WebElement driver;

    HepsiBuradaPage hepsiBurada = new HepsiBuradaPage();

    @Given("Kullanici Hepsiburada.com sitesini ziyaret eder.")
    public void kullaniciHepsiburadaComSitesiniZiyaretEder() {
        Driver.getDriver().get(ConfigReader.getProperty("hepsiBuradaUrl"));
    }



    @Then("Kullanici giris islemi yapilir.")
    public void kullaniciGirisIslemiYapilir() {
        Actions actions = new Actions(Driver.getDriver());
        actions.clickAndHold(hepsiBurada.girisAccount);
    }

    @And("Yonlendirmeden sonra anasayfada kullanici giris isleminin yapildigi dogrulanir")
    public void yonlendirmedenSonraAnasayfadaKullaniciGirisIslemininYapildigiDogrulanir() {

    }

    @And("Kullanici, burada satin almak istedigi urun icin Ana sayfadaki filtreleme bolumunden secim yapacaktir.")
    public void kullaniciBuradaSatinAlmakIstedigiUrunIcinAnaSayfadakiFiltrelemeBolumundenSecimYapacaktir() {

    }

    @And("Kullanici, Secim sonucunda ekrana gelen urun listesinden urun secer.")
    public void kullaniciSecimSonucundaEkranaGelenUrunListesindenUrunSecer() {

    }

    @And("Secilen urun icin {int} tane farkli saticidan urun secilip sepete eklenir.")
    public void secilenUrunIcinTaneFarkliSaticidanUrunSecilipSepeteEklenir(int arg0) {

    }

    @And("Secilen urunun dogru olarak eklendigi ‘Sepetim’ sayfasinda dogrulanmalidir.")
    public void secilenUrununDogruOlarakEklendigiSepetimSayfasindaDogrulanmalidir() {

    }


    //TC002

    @Given("Kullanici Hepsiburada.com sitesini gider")
    public void kullaniciHepsiburadaComSitesiniGider() {
    }

    @Then("Kullanici, Arama sonucunda ekrana gelen urun listesinden urun secer.")
    public void kullaniciAramaSonucundaEkranaGelenUrunListesindenUrunSecer() {
    }

    @And("Secilen urun icin {int} tane farkli saticidan urun secilip sepete ekler")
    public void secilenUrunIcinTaneFarkliSaticidanUrunSecilipSepeteEkler(int arg0) {

    }

    @And("Secilen urunun doğru olarak eklendigi ‘Sepetim’ sayfasinda dogrulanmalidir.")
    public void secilenUrununDoğruOlarakEklendigiSepetimSayfasindaDogrulanmalidir() {
    }
}
