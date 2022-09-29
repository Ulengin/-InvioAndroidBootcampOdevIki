package com.example.invioandroidbootcampodev2.odev2

fun main() {
    // 1. soru
    val fahrenhiet = Fonksiyonlar()
    val derece_fahrenhiet_donusumu = fahrenhiet.soru1(32.0)
    println("Soru 1 -> Parametre olarak girilen derecenin fahrenhiet karşılığı: $derece_fahrenhiet_donusumu fahrenhiettır.")
    // 2. soru
    val dikdortgen = Fonksiyonlar()
    dikdortgen.soru2(3,5)
    // 3. soru
    val faktoriyel = Fonksiyonlar()
    val sonuc = faktoriyel.soru3(6)
    println("Soru 3 -> Parametre olarak girilen sayının faktöriyel değeri: $sonuc")
    // 4. soru
    val kelimeler = Fonksiyonlar()
    val kelime = "Furkan Ülengin"
    val harf = 'n'
    val sonuc2 = kelimeler.soru4(kelime,harf)
    println("Soru 4 -> Parametre olarak girilen $kelime kelimesi içinde $sonuc2 adet $harf'i geçmektedir. ")
    // 5. soru
    var ic_Aci = Fonksiyonlar()
    var sonuc3 = ic_Aci.soru5(4)
    println("Soru 5 -> Parametre olarak girilen kenar sayısına göre çokgenin iç açıları toplamı: $sonuc3")
    // 6. soru
    val calisan = Fonksiyonlar()
    val maas = calisan.soru6(10)
    println("Soru 6 -> Girilen parametre kadar gün çalışan çalışanın maaşı: $maas")
    // 7. soru
    val kullanici = Fonksiyonlar()
    val ucret = kullanici.soru7(52)
    println("Soru 7 -> Girilen kota miktarına göre ödenecek ücret: $ucret")
}