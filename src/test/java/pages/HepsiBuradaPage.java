package pages;

import org.junit.AfterClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HepsiBuradaPage {

    public HepsiBuradaPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@id='myAccount']")
    public WebElement girisAccount;

    @FindBy(xpath = "//a[@id='login']")
    public WebElement girisButton;

    @FindBy(xpath = "//input[@id='txtUserName']")
    public WebElement emailUserName;

    @FindBy(xpath = "//button[@id='btnLogin']")
    public WebElement loginButton;

    @FindBy(xpath = "//input[@id='txtPassword']")
    public WebElement passwordButton;

    @FindBy(xpath = "//button[@id='btnEmailSelect']")
    public WebElement loginButton2;

    @FindBy(xpath = "//span[text()='Elektronik']")
    public WebElement elektronikEsyaButton;

    @FindBy(xpath = "//a[text()='Bilgisayar/Tablet']")
    public WebElement bilgisayarTabletButton;

    @FindBy(xpath = "//div[text()='Dell']")
    public WebElement dellBilgisayarButton;

    @FindBy(xpath = "(//div[text()='4 yıldız ve üzeri'])[1]")
    public WebElement degerlendirmePuani;

    @FindBy(xpath = "//div[@class='horizontalSortingBar-vJPnTMeyShn8REmw3_On']")
    public WebElement sirlamaFiltre;

    @FindBy(xpath = "//div[text()='Çok satanlar']")
    public WebElement cokSatanlarButton;

    @FindBy(xpath = "(//div[@type='comfort'])[4]")
    public WebElement urun1;

    @FindBy(xpath = "//button[@id='addToCart']")
    public WebElement sepeteEkleButton;

    @FindBy(xpath = "//button[text()='Alışverişe devam et']")
    public WebElement alisveriseDevamEtButton;

    @FindBy(xpath = "//div[text()='Monster']")
    public WebElement monsertBilgisayarButton;

    @FindBy(xpath = "(//div[@type='comfort'])[1]")
    public WebElement monsertBilgisayarUrun1;

    @FindBy(xpath = "//button[text()='Sepete git']")
    public WebElement sepeteGitButton;


    @FindBy(xpath = "(//div[@class='product_item_wfDPt'])[1]")
    public WebElement sepetUrunDogrulama1;



    @FindBy(xpath = "(//div[@class='product_item_wfDPt'])[2]")
    public WebElement sepetUrunDogrulama2;





    }

