@imdb
Feature: IMDb Senaryolari

  Scenario: TC001 Menuden bulunan filmle Arama Cubugu Uzerinden Bulunan film Ozellikleri Aynı Olmalidir.

    Given kullanici  imdb adresine gider
    Then Arama cubugunun sol tarafinda bulunan Menu butonuna basilir
    And  Gelen ekranda “Award & Events” başligi altinda bulunan “Oscars” butonuna tiklanir
    And Event History” basligi altinda “1973” degeri secilir
    And “Best Costume Design” basligi altinda “The God Father ” secilir
    And Gelen ekranda, The God Father’a ait Director: bilgisi kayit edilir. Writer: bilgisi kayit edilir. Stars: bilgisi kayit edilir.
    And Ekranin sol ustunde bulunan “IMDb” butonuna tiklanarak “Anasayfa’ya” donulur
    And Arama cubuguna “The God Father” yazilir.
    And Sonuclar arasinda gelen “The God Father’a” tiklanir.
    And Gelen ekranda; Director: bilgisi kayit edilen directorle ayni mi kontrol edilir.
    And Writer: bilgisi kayit edilen Writer’la ayni mi kontrol edilir.
    And Stars: bilgisi kayit edilen Starts’la ayni mi kontrol edilir.
    And Kontroller yapildiktan sonra “See all .. photos” linkine tiklanir


