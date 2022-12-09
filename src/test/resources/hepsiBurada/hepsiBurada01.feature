Feature: Hepsiburada,com üzerinden sepete ürün eklenmesi

  Scenario: TC001 Kullanıcı girişi yapılarak sepete ürün eklenmesi
    Given Kullanici Hepsiburada.com sitesini ziyaret eder.
    Then Kullanici giris islemi yapilir.
    And Yonlendirmeden sonra anasayfada kullanici giris isleminin yapildigi dogrulanir
    And Kullanici, burada satin almak istedigi urun icin Ana sayfadaki filtreleme bolumunden secim yapacaktir.
    And Kullanici, Secim sonucunda ekrana gelen urun listesinden urun secer.
    And Secilen urun icin 2 tane farkli saticidan urun secilip sepete eklenir.
    And Secilen urunun dogru olarak eklendigi ‘Sepetim’ sayfasinda dogrulanmalidir.


    Scenario: TC002 Kullanici girisi yapilmadan belirtilen urunu sepete ekleme
      Given Kullanici Hepsiburada.com sitesini gider
      Then Kullanici, Arama sonucunda ekrana gelen urun listesinden urun secer.
      And Secilen urun icin 2 tane farkli saticidan urun secilip sepete ekler
      And  Secilen urunun doğru olarak eklendigi ‘Sepetim’ sayfasinda dogrulanmalidir.


