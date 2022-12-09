package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ImdbPage {
    public ImdbPage() { //1.constructor
        //2 PageFactory
        //3 iniElements methodunu
        //4 Driver.getDriver()
        //5 this
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[text()='Menu']")
    public WebElement menuButton;

    @FindBy(xpath = "(//button[@title='Close'])[1]")
    public WebElement closeButton;



    @FindBy(xpath = "//Span[text()='Oscars']")
    public WebElement oscarsButton;

    @FindBy(xpath = "(//a[@class='ipc-metadata-list-item__list-content-item ipc-metadata-list-item__list-content-item--link'])[1]")
    public WebElement directorButton;
    @FindBy(xpath = "(//a[@class='ipc-metadata-list-item__list-content-item ipc-metadata-list-item__list-content-item--link'])[2]")
    public WebElement writerButton;
    @FindBy(xpath = "(//a[@class='ipc-metadata-list-item__list-content-item ipc-metadata-list-item__list-content-item--link'])[3]")
    public WebElement writerButton2;
    @FindBy(xpath = "(//a[@class='ipc-metadata-list-item__list-content-item ipc-metadata-list-item__list-content-item--link'])[4]")
    public WebElement starsButton;
    @FindBy(xpath = "(//a[@class='ipc-metadata-list-item__list-content-item ipc-metadata-list-item__list-content-item--link'])[5]")
    public WebElement starsButton2;
    @FindBy(xpath = "(//a[@class='ipc-metadata-list-item__list-content-item ipc-metadata-list-item__list-content-item--link'])[6]")
    public WebElement starsButton3;
    @FindBy(xpath = "//a[@id='home_img_holder']")
    public WebElement menuButton2;
    @FindBy(xpath = "//input[@id='suggestion-search']")
    public WebElement searchBoxButton;
    @FindBy(xpath = "(//IMG[@alt='The Godfather'])[1]")
    public WebElement theGodFatherSearchButton;


    @FindBy(xpath = "//img[@height='100']")
    public List<WebElement> linklist;

    @FindBy(xpath = "(//H3[@class='ipc-title__text'])[2]")
    public WebElement photosButton;
    @FindBy(xpath = "//div[@class='sc-fa02f843-2 dwQKsL']")
    public WebElement topCreditsList;

    @FindBy(xpath = "//A[@href='/event/ev0000003/1973/1/?ref_=acd_eh']")
    public WebElement eventhistroy;
    @FindBy(xpath = "//A[@href='/title/tt0068646/?ref_=ev_nom']")
    public WebElement bestCostumedDesign;



    //The Shawshank Redemption

    @FindBy(xpath = "(//a[text()='The Shawshank Redemption'])[3]")
    public WebElement bestFilmEditing;

    @FindBy(xpath = " //a[text()='1995']")
    public WebElement eventHistory;

    @FindBy(xpath = "//IMG[@alt='The Shawshank Redemption']")
    public WebElement theShawshankSearchButton;



}