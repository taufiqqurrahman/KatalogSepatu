package simple.example.katalogsepatu;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.katalogsepatu.model.Kantor;
import simple.example.katalogsepatu.model.Pesta;
import simple.example.katalogsepatu.model.Sepatu;
import simple.example.katalogsepatu.model.Sport;


public class DataProvider {
    private static List<Sepatu> sepatus = new ArrayList<>();

    private static List<Kantor> intDataKantor (Context ctx) {
        List<Kantor> kantors = new  ArrayList<>();
        kantors.add(new Kantor ("Sepatu EVZEN", "Buccheri",
                "Evzen sepatu Lace up yang di desain khusus untuk memberikan kenyamanan maksimum dan desain yang menonjolkan bentuk yang stylish dan elegan, hal ini bisa di capai karena dibuat dengan menggunakan metode handmade dan bahan Cow Leather dan Thermo Plastic Rubber Sole.",
                R.drawable.shoes_bucherri_evzen));
        kantors.add(new Kantor ("Sepatu cevany","cevany",
                "BRAND ; CEVANY\n" +
                        "SIZE ; 39-40-41-42-43\n" +
                        "TYPE ; PANTOFEL\n" +
                        "WARNA ; HITAM & PUTIH\n" +
                        "BAHAN : KULIT ASLI",
                R.drawable.shoes_cevany));
        kantors.add(new Kantor ("Sepatu Kickers","Kickers",
                "patu pantofel ini terbuat dari bahan kulit asli, bukan dari bahan sintetis atupun imitasi, sehingga tektur sepatu nya lebih lembut dan elegan\n" +
                        "sepatu ini cocok digunakan untuk kerja kantoran, ke pesta serta ke acara acara yang formal, bisa juga dipakai buat ke kondangan.\n",
                R.drawable.shoes_kickers));
        return kantors;
    }

    private static List<Sport> intDataSport(Context ctx) {
        List<Sport> sports = new ArrayList<>();
        sports.add(new Sport ("Nike", "Nike",
                "Sepatu nike adalah salah satu jenis sepatu dari brand ternama yang kepopulerannya tak perlu diragukan lagi.", R.drawable.shoes_nike_epic));
        sports.add(new Sport ("Alpabounce", "Adidas",
                "Sepatu Adidas Alphabounce dibuat untuk melakukan aktifitas serbaguna. Sepatu yang dirancang untuk menawarkan stabilitas dan dukungan untuk latihan yang mudah.", R.drawable.shoespabounce));
        sports.add(new Sport ("Kintamani", "Indonesia",
                "Sepatu merupakan hal yang tak bisa lepas dari olahraga sepakbola. Sepatu menjadi hal yang penting terutama bagi pemain sepakbola untuk melindungi kaki dari cedera serius. ", R.drawable.puma));

        return sports;
    }

    private static List<Pesta> intDataPesta(Context ctx) {
        List<Pesta> pestas = new ArrayList<>();
        pestas.add(new Pesta ("sepatu haig hils", "Peradapan Meksiko Kuno",
                "BAGI kaum hawa penampilan merupakan hal nomor satu. Penampilan yang mempesona dapat menambah rasa percaya diri. Salah satu gaya yang sangat melekat pada wanita adalah penggunaan high heels.", R.drawable.shoes_high_heels));
        pestas.add(new Pesta ("Hils", "Inggris",
                        "Sebab, saat mengenakannya otomatis akan membuat kesan lebih tinggi dan kaki akan terlihat lebih jenjang saat mengenakannya.", R.drawable.shoes_hils));
        pestas.add(new Pesta ("Nike Court Royale AC", "Nike",
                "Model ini memiliki bentuk seperti sepatu Vans, dilengkapi dengan pilihan pola-pola gambar unik, floral maupun warna polos.\n" +
                        "\n" +
                        "Kamu bisa memadukan sepatu ini dengan kemeja oversize dan celana bahan untuk penampilan yang memukau", R.drawable.nikecourtroyale));

        return pestas;
    }

    private static void initAllSepatu(Context ctx) {
        sepatus.addAll(intDataKantor (ctx));
        sepatus.addAll(intDataPesta (ctx));
        sepatus.addAll(intDataSport (ctx));
    }

    public static List<Sepatu> getAllSepatu(Context ctx) {
        if (sepatus.size() == 0) {
            initAllSepatu (ctx);
        }
        return  sepatus;
    }

    public static List<Sepatu> getSepatusByTipe(Context ctx, String jenis) {
        List<Sepatu> sepatuByTipe = new ArrayList<>();
        if (sepatus.size() == 0) {
            initAllSepatu (ctx);
        }
        for (Sepatu h : sepatus) {
            if (h.getJenis().equals(jenis)) {
                sepatuByTipe.add(h);
            }
        }
        return sepatuByTipe;
    }

}