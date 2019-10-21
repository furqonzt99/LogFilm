package com.example.logfilm;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_FILM = "extra_film";
    ImageView ivPoster;
    TextView tvJudul, tvRilis, tvGenre, tvDurasi, tvSutradara, tvGolongan, tvRating, tvSinopsis;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_film);

        ivPoster = findViewById(R.id.detailPoster);
        tvJudul = findViewById(R.id.detailJudul);
        tvRilis = findViewById(R.id.detailRilis);
        tvGenre = findViewById(R.id.detailGenre);
        tvDurasi = findViewById(R.id.detailDurasi);
        tvSutradara = findViewById(R.id.detailSutradara);
        tvGolongan = findViewById(R.id.detailGolongan);
        tvRating = findViewById(R.id.detailRating);
        tvSinopsis = findViewById(R.id.detailSinopsis);

        Film film = getIntent().getParcelableExtra(EXTRA_FILM);
        int poster = film.getPoster();
        String judul = film.getJudul();
        String rilis = film.getRilis();
        String genre = film.getGenre();
        String durasi = film.getDurasi();
        String sutradara = film.getSutradara();
        String golongan = film.getGolongan();
        String rating = film.getRating();
        String sinopsis = film.getSinopsis();

        ivPoster.setImageResource(poster);
        tvJudul.setText(judul);
        tvRilis.setText(rilis);
        tvGenre.setText(genre);
        tvDurasi.setText(durasi);
        tvSutradara.setText(sutradara);
        tvGolongan.setText(golongan);
        tvRating.setText(rating);
        tvSinopsis.setText(sinopsis);
    }
}
