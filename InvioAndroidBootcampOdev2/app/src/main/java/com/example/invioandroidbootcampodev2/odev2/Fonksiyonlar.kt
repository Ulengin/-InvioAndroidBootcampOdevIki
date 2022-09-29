package com.example.invioandroidbootcampodev2.odev2

class Fonksiyonlar {
    fun soru1(derece:Double):Double{
        return (derece*1.8)+32
    }
    fun soru2(kisaKenar:Int,uzunKenar:Int){
        println("Soru 2 -> Kısa kenarı $kisaKenar birim olan ve uzun kenarı $uzunKenar birim olan dikdörtenin çevresi : ${(kisaKenar*2)+(uzunKenar*2)} birimdir.")
    }
    fun soru3(sayi:Int):Int{
        var deger = 1
        for (i in sayi downTo 1){
           deger*=i
        }
        return deger
    }
    fun soru4(kelime:String,harf:Char):Int{
        var adet = 0
        for (i in kelime){
            if(i == harf){
                adet++
            }
        }
        return adet
    }
    fun soru5(kenarSayisi:Int):Int{
        return (kenarSayisi-2)*180
    }
    fun soru6(günSayisi:Int):Int{
        val topCalismaSaati = günSayisi*8

        var maas = 0

        if (topCalismaSaati>160){
            val fazla_mesai = topCalismaSaati-160
            maas = (160*10) + (fazla_mesai*20)
        }else{
            maas = topCalismaSaati*10
        }

        return maas
    }
    fun soru7(kota:Int):Int{

        var ucret=0

        if (kota>50){
            var kota_aşim_miktari= kota-50
            ucret=100+(kota_aşim_miktari*4)
        }else{
            ucret=100
        }

        return ucret
    }
}