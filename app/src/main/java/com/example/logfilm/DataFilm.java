package com.example.logfilm;

import java.util.ArrayList;

public class DataFilm {
    private static String[] judulFilm = {
            "Aquaman",
            "Avengers: Infinity War",
            "Deadpool 2",
            "How to Train Your Dragon: The Hidden World",
            "Glass",
            "Mortal Engines",
            "Preman Pensiun",
            "Spider-Man: Into the Spider-Verse",
            "The Mule",
            "Venom"
    };

    private static String[] rilisFilm = {
            "2018",
            "2018",
            "2018",
            "2019",
            "2019",
            "2018",
            "2019",
            "2018",
            "2018",
            "2018"
    };

    private static int[] posterFilm = {
            R.drawable.poster_aquaman,
            R.drawable.poster_avengerinfinity,
            R.drawable.poster_deadpool,
            R.drawable.poster_dragon,
            R.drawable.poster_glass,
            R.drawable.poster_mortalengine,
            R.drawable.poster_preman,
            R.drawable.poster_spiderman,
            R.drawable.poster_themule,
            R.drawable.poster_venom
    };

    private static String[] genreFilm = {
            "Fantasi/Fiksi ilmiah",
            "Fantasi/Sains",
            "Fantasi/Sains",
            "Fantasi/Aksi",
            "Drama/Fantasi",
            "Thriller/Fantasi",
            "Drama/Komedi-drama",
            "Fantasi/Sains",
            "Drama/Misteri",
            "Thriller/Sains"
    };

    private static String[] durasiFilm = {
            "2 jam 22 menit",
            "2 jam 40 menit",
            "2 jam 14 menit",
            "1 jam 44 menit",
            "2 jam 9 menit",
            "2 jam 9 menit",
            "1 jam 34 menit",
            "1 jam 56 menit",
            "1 jam 55 menit",
            "2 jam 20 menit"
    };

    private static String[] sutradaraFilm = {
            "James Wan",
            "Anthony & Joe Russo",
            "David Leitch",
            "Dean DeBlois",
            "M. Night Shyamalan",
            "Christian Rivers",
            "Aris Nugraha",
            "Peter Ramsey",
            "Clint Eastwood",
            "Ruben Fleischer"
    };

    private static String[] golonganFilm = {
            "13+",
            "13+",
            "17+",
            "SU",
            "13+",
            "17+",
            "13+",
            "SU",
            "17+",
            "17+"
    };

    private static String[] ratingFilm = {
            "7.0",
            "8.5",
            "7.7",
            "7.5",
            "6.7",
            "6.1",
            "7.0",
            "8.4",
            "7.0",
            "6.7"
    };

    private static String[] sinopsisFilm = {
            "Film ini mengungkap asal-usul Arthur Curry, manusia perkasa yang bisa mengendalikan air dan hewan laut. Dari mana ia mendapatkan kekuatannya? Siapa orang tuanya, dan pantaskah dia menjadi seorang raja di 7samudera?",
            "Iron Man, Thor, Hulk, dan anggota Avengers lainnya bersatu untuk bertempur melawan musuh mereka yang paling kuat - The Thanos yang jahat. Dalam sebuah misi untuk mengumpulkan keenam Batu Infinity, Thanos berencana untuk menggunakan artefak untuk menimbulkan keinginannya yang terpelintir pada kenyataan. Nasib planet dan keberadaannya sendiri tidak pernah menjadi dan lebih tidak pasti karena semua yang telah diperjuangkan para Avengers telah mengarah ke momen ini.",
            "Deadpool tentara bayaran Wisecracking bertemu Russell, seorang mutan remaja yang marah yang tinggal di panti asuhan. Ketika Russell menjadi sasaran Cable - seorang prajurit yang ditingkatkan secara genetik dari masa depan - Deadpool menyadari bahwa ia akan membutuhkan bantuan menyelamatkan bocah itu dari musuh yang begitu hebat. Dia segera bergabung dengan pasukan dengan Bedlam, Shatterstar, Domino dan mutan kuat lainnya untuk melindungi Russell muda dari Cable dan persenjataan canggihnya.",
            "Semua tampak baik di Pulau Berk karena orang Viking dan naga hidup bersama dalam kedamaian dan keharmonisan. Sekarang seorang pemimpin Viking, Hiccup semakin tertarik pada Astrid, sementara naga kesayangannya Toothless bertemu dengan makhluk memikat yang menangkap matanya. Ketika Grimmel jahat meluncurkan pai licik untuk menghapus semua naga, Hiccup harus menyatukan kedua klan untuk menemukan Caldera, sebuah tanah tersembunyi yang memegang kunci untuk menyelamatkan Toothless dan teman-teman terbangnya.",
            "Film Glass akan melanjutkan kisah pencarian Kevin Wendell Crumb yang hmelarikan diri setelah menculik para gadis. Kevin Wendel Crumbang memiliki 20 kepribadian dalam satu jiwa ini bisa berubah menjadi seorang monster saat pribadinya yang bernama The Beast muncul.",
            "Ratusan tahun setelah peristiwa dahsyat menghancurkan peradaban, Hester Shaw muda yang misterius muncul sebagai satu-satunya yang dapat menghentikan kota London - sekarang predator raksasa di atas roda - dari melahap segala sesuatu di jalannya. Dengan semangat dan didorong oleh ingatan ibunya, Hester bergabung untuk Dia bersama Tom Natsworthy, orang buangan dari London, dan Anna Fang, seorang penjahat berbahaya dengan hadiah di kepalanya.",
            "Setelah tiga tahun, bisnis kecimpring Muslihat yang sudah pensiun sebagai preman, mengalami masalah. Penjualannya mulai menurun. Muslihat juga menghadapi masalah baru saat Safira, anak perempuan satu-satunya, sudah tumbuh remaja dan mulai didatangi lelaki. Masalah lebih besar kemudian muncul, ketika ada masalah di antara mantan anak buahnya.",
            "Digigit laba-laba radioaktif di kereta bawah tanah, remaja Brooklyn Miles Morales tiba-tiba mengembangkan kekuatan misterius yang mengubah dirinya menjadi satu-satunya Spider-Man. Ketika dia bertemu Peter Parker, dia segera menyadari bahwa ada banyak orang lain yang berbagi talenta terbangnya yang istimewa. Miles sekarang harus kita Ketrampilan barunya untuk memerangi Kingpin jahat, orang gila besar yang bisa membuka portal ke alam semesta lain dan menarik versi Spider-Man yang berbeda ke dunia kita.",
            "Pecah, sendirian dan menghadapi penyitaan pada bisnisnya, Earl Stone, hortikulturis berusia 90 tahun mengambil pekerjaan sebagai kurir narkoba untuk kartel Meksiko. Kesuksesan langsungnya mengarah ke uang mudah dan pengiriman yang lebih besar yang segera menarik perhatian agen DEA Colin Bates. Ketika masa lalu Earl mistak Jika mulai membebani hati nuraninya, ia harus memutuskan apakah akan memperbaiki kesalahan itu sebelum penegak hukum dan penjahat kartel mengejar dia.",
            "Wartawan Eddie Brock berusaha menjatuhkan Carlton Drake, pendiri Life Foundation yang terkenal kejam dan brilian. Saat menyelidiki salah satu eksperimen Drake, tubuh Eddie bergabung dengan alien Venom - meninggalkannya dengan kekuatan dan kekuatan manusia super. Dipelintir, gelap dan didorong oleh kemarahan, Racun mencoba mengendalikan kemampuan baru dan berbahaya yang menurut Eddie memabukkan."
    };


    static ArrayList<Film> getListData() {
        ArrayList<Film> list = new ArrayList<>();
        for (int position = 0; position < judulFilm.length; position++) {
            Film film = new Film();
            film.setJudul(judulFilm[position]);
            film.setRilis(rilisFilm[position]);
            film.setPoster(posterFilm[position]);
            film.setGenre(genreFilm[position]);
            film.setDurasi(durasiFilm[position]);
            film.setSutradara(sutradaraFilm[position]);
            film.setGolongan(golonganFilm[position]);
            film.setRating(ratingFilm[position]);
            film.setSinopsis(sinopsisFilm[position]);
            list.add(film);
        }
        return list;
    }
}
