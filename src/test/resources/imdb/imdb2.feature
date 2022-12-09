@imdb2
Feature:  IMDb Senaryolari 2

  Scenario: TC002 Menuden bulunan filmle Arama Cubugu Uzerinden Bulunan film Ozellikleri Aynı Olmalidir.

    Given kullanici  imdb adresine gider.
    Then Arama cubugunun sol tarafinda bulunan Menu butonuna basilir.
    And  Gelen ekranda “Award & Events” başligi altinda bulunan “Oscars” butonuna tiklanir.
    And Event History” basligi altinda “1995” degeri secilir.
    And “Best Film Editing” basligi altinda “The Shawshank Redemption ” secilir
    And Gelen ekranda, The Shawshank Redemption’a ait Director: bilgisi kayit edilir. Writer: bilgisi kayit edilir. Stars: bilgisi kayit edilir.
    And Ekranin sol ustunde bulunan “IMDb” butonuna tiklanarak “Anasayfa’ya” donulur.
    And Arama cubuguna “The Shawshank Redemption” yazilir.
    And Sonuclar arasinda gelen “The Shawshank Redemption’a” tiklanir.
    And Gelen ekranda; Director: bilgisi kayit edilen directorle ayni mi kontrol edilir
    And Writer: bilgisi kayit edilen Writer’la ayni mi kontrol edilir
    And Stars: bilgisi kayit edilen Starts’la ayni mi kontrol edilir
    And Kontroller yapildiktan sonra “See all .. photos” linkine tiklanir.
