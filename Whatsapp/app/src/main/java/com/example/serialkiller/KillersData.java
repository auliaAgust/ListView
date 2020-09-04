package com.example.serialkiller;

import java.util.ArrayList;

public class KillersData {

    private static  String[] detail = {
            "Treat People With Kindness!",
            "Booyah!",
            "Potato",
            "It's aLl YoURs hoHOho",
            "I I I I am your little butterfly",
            "Kuberi kamu satu permintaan!",
            "Kuberi kamu satu permintaan!",
            "Hiiii there!",
            "Hi There! Whatsapp is using me",
            "Terima jasa bersih-bersih halaman!"
    };
    private static String[] nama = {
            "Abang Harry",
            "Adekku",
            "Abang Niall",
            "Abang Zayn",
            "Anak Ilang",
            "Jin Biru",
            "Mba Ari",
            "Ponakan",
            "Teh Taylor",
            "Tukang Kebun"
    };

    private static  int[] foto = {
            R.drawable.harry,
            R.drawable.adek,
            R.drawable.niall,
            R.drawable.zayn,
            R.drawable.bocilcpwp,
            R.drawable.jin,
            R.drawable.ariana,
            R.drawable.bocil,
            R.drawable.taylor,
            R.drawable.kebun
    };

    static ArrayList<BarisKontak> getListData(){
        ArrayList<BarisKontak> list = new ArrayList<>();
        for (int pos=0; pos<nama.length; pos++){
            BarisKontak bunuh = new BarisKontak(foto[pos], nama[pos], detail[pos]);
            list.add(bunuh);
        }
        return list;
    }
}
