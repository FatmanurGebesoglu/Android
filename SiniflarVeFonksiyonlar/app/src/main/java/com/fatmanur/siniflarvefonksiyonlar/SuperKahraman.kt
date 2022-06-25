package com.fatmanur.siniflarvefonksiyonlar

class SuperKahraman(var isim: String, var yas: Int, var meslek: String ){
 // birincil constructor sınıfın kenisini constructor olarak kullanma şuanda olduğu gibi
  //primary constructor = birincil constructor

    private var sacininRengi= "sarı"

    fun sacRenginiAl(): String{
        return this.sacininRengi
    }

    //getter
    fun testFonksiyonu(){
        println("test")

    }


    //setter
    fun sacRenginiDegistir(){
        this.sacininRengi="yeşil"
    }

//Access Level - Erişebilirlik seviyeleri
    //private-protected-internal-public

    /*

    //property
    var isim=""
    var yas=0
    var meslek=""

    // Constructor
    constructor(isim: String, yas: Int, meslek:String){

        this.isim=isim
        this.yas=yas
        this.meslek=meslek

        println("constructor çağırıldı")
    }


     */



}