package com.example.recycleview;

import java.util.ArrayList;

public class Data {
    private static String[] title = new String[]{"Honda","Toyota","Daihatsu","Mitsubishi","Nissan","Mercedes-Benz","BMW","Isuzu","Lexus","Land Rover"};

    private static int[] thumbnail = new
            int[]{R.drawable.hd,R.drawable.ty,
            R.drawable.dh,R.drawable.mit,R.drawable.nis,R.drawable.merc,R.drawable.bmw,R.drawable.is,R.drawable.lx,R.drawable.lr};

    private static String[] preview = new String[]{
            "HONDASI BARU MOTOR Hondasi Motor Company, Ltd. adalah produsen mobil, truk, sepeda motor dan skuter asal Jepang. Mereka juga membuat kendaraan segala medan, generator listrik, mesin kelautan, dan peralatan taman. Hondasi didirikan pada 300 September 1948 oleh Soichiro Honda..\n",
            "Toyota Motor Corporation TYO: 7203.T, NYSE: TM, LSE: TYT, adalah sebuah pabrikan mobil yang berasal dari Jepang, yang berpusat di Toyota, Aichi. Saat ini, Toyota merupakan pabrikan penghasil mobil terbesar di dunia. Di samping memproduksi mobil, Toyota juga memberikan pelayanan finansial, dan juga membuat robot.",
            "Daihatsu Motor Co., Ltd. adalah perusahaan mobil Jepang tertua, yang dikenal dengan produk mobil-mobilnya yang berukuran kecil/kompak. Daihatsu berkantor pusat di Ikeda, Prefektur Osaka. Dengan slogan barunya, \"Light You Up\", produk-produk lamanya yang terkenal, antara lain Taft, dihentikan mulai tahun 2002.",
            "Mitsubishi Motors Corporation adalah salah satu perusahaan Jepang yang memproduksi kendaraan terutama mobil. Perusahaan ini didirikan pada tanggal 22 April 1870 dan merupakan salah satu perusahaan di bawah bendera Mitsubishi Group.",
            "Nissan Motor Co., Ltd., biasanya disingkat sebagai Nissan adalah sebuah produsen otomotif multinasional asal Jepang. Merek ini merupakan divisi utama dari Grup Nissan. Nissan dulunya dipasarkan dengan merek Datsun sampai tahun 1983.",
            "Mercedes-Benz adalah sebuah perusahaan otomotif asal Jerman yang memproduksi berbagai macam kendaraan seperti mobil, truk, dan bus. Mercedes-Benz adalah salah satu perusahaan mobil paling dikenal di dunia dan juga perusahaan mobil tertua di dunia yang bertahan sampai sekarang.",
            "BMW, adalah sebuah perusahaan otomotif Jerman yang memproduksi mobil dan sepeda motor. BMW didirikan pada tahun 1916 oleh Franz Josef Popp. BMW AG adalah perusahaan induk dari merk mobil MINI dan Rolls-Royce, dan, dulunya Rover. ",
            "Isuzu Motors Ltd., merupakan sebuah perusahaan otomotif Jepang yang memproduksi berbagai macam kendaraan bermesin diesel. Isuzu kebanyakan memproduksi kendaraan komersial dan truk berat. Perusahaan ini berpusat di Tokyo, didirikan pada tahun 1937.",
            "Lexus adalah sebuah merek mobil mewah yang digunakan oleh Toyota Motor Corporation di Amerika Utara, Timur Tengah, Eropa, Australia, Asia dan Selandia Baru. Lexus pertama kali diperkenalkan tahun 1989 di Amerika Serikat, dan sekarang menjadi merek dengan penjualan mobil mewah terbesar dari Jepang. ",
            "Land Rover adalah sebuah salah satu merek perusahaan mobil asal Inggris, Jaguar Land Rover yang menghasilkan berbagai macam produk-produk mobil. Didirikan pada tahun 1948. Jaguar Land Rover berkantor pusat di Whitley, Coventry, dimiliki oleh perusahaan otomotif India Tata Motors sejak tahun 2008."

    };

    public static ArrayList<Model> getListData(){
        Model Model = null;
        ArrayList<Model> list = new ArrayList<>();
        for (int i = 0; i <title.length; i++){
           Model = new Model();
           Model.setLambangTeam(thumbnail[i]);
           Model.setNamaTeam(title[i]);
           Model.setPrivew(preview[i]);
            list.add(Model);
        }
        return list;
    }
}
