package com.fatmanur.siniflarvefonksiyonlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val i=0


        if(i==0){
            ilkFonksiyon()
        }else{
            ikinciFonksiyon()
        }


        cikarma(10,20)
        var x= toplama(10,20)
        textView.text= "Sonuç: ${x}"



        button.setOnClickListener{
            val toplamaSonucu= toplama(10,50)
            textView.text= "Sonuç: ${toplamaSonucu}"

        }


        sinifCalismasi()
        nullGuvenliği()

    }
    fun ilkFonksiyon(){
        println("ilk fonksiyon çalıştırıldı")
    }
    fun ikinciFonksiyon(){
        println("ikinci fonksiyon çalıştırıldı")
    }

    //girdi almak

    fun cikarma(x: Int, y:Int){
        textView.text="Sonuç: ${x-y}"

    }
    //çıktı vermek -> döndürmek
    fun toplama(a:Int,b:Int): Int{
        return  a+b
    }
    /*


    fun degistir(view: View){
        val toplamaSonucu =toplama(10,50)
        textView.text="Sonuç: ${toplamaSonucu}"

    }
    */


    fun sinifCalismasi(){
    /*
        var numara =5
        var string = "fatmanur"
        //numara. veya string. yazarak Int ve String class larına ait alt fonksiyonlarını görebiliriz


        var isim="superman"
        var meslek="gazeteci"
        var yas=50
 */

        //constructor olmadan

        /*

        var superman= SuperKahraman()
        superman.isim="Superman"
        superman.meslek="gazeteci"
        superman.yas=50

        var spiderman =SuperKahraman()
        spiderman.isim="Spiderman"
        spiderman.meslek="gazeteci"
        spiderman.yas=20


        textView.text= "yaş: ${superman.yas}"
        */



        var superman= SuperKahraman("superman",50,"gazeteci")
        textView.text= "yaş: ${superman.yas}"
        //println(superman.sacininRengi) //sacRengini private olduğunda hata verdi

        println(superman.sacRenginiAl())

    }


    fun nullGuvenliği(){

        //Null, Nullability, Null Safety

        //Tanımlama- Definening
        var benimString: String?//sonuna ? ile koyarak null da bırakabilirz

        //definening ve initialization arasında değişken nulldır
        //Initialization
        benimString="fatmanur"

        var benimYasim :Int? = null
        //println(benimYasim * 2) bu kod hata verir çünkü yaşı null yaptık nasıl 2 ile çarpsın


        // kontrol etme

        // 1

        //benimYasim=2
        if(benimYasim != null){
            println(benimYasim*2)
        }else{
            println("null geldi")
        }

        //2
        // !!->null olmayacak , ?-> null olabilir

       // benimYasim=3
        println(benimYasim!!.minus(2))

        //3
        //elvis operatörü: sonuc null geliyorsa 10 ata

        val sonuc=benimYasim?.minus(2) ?:10
        println(sonuc)

        //4
        //let
        //null ise aşağıdakı kod çalışmaz null değilse 5 ile çalışır
        benimYasim?.let{
            println(it*5)
        }


    }


    

}