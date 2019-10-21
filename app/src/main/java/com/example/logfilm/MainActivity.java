package com.example.logfilm;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvFilm;
    private ArrayList<Film> listFilm = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvFilm = findViewById(R.id.rvFilm);
        rvFilm.setHasFixedSize(true);

        listFilm.addAll(DataFilm.getListData());
        showRecyclerList();

    }

    private void showRecyclerList() {
        rvFilm.setLayoutManager(new LinearLayoutManager(this));
        ListFilmAdapter listFilmAdapter = new ListFilmAdapter(listFilm);
        rvFilm.setAdapter(listFilmAdapter);

        listFilmAdapter.setOnItemClickAction(new ListFilmAdapter.OnItemClickAction() {
            @Override
            public void onItemClicked(Film data) {
                showSelectedFilm(data);
            }
        });
    }

    private void showSelectedFilm(Film film) {
        Film logFilm = new Film();
        logFilm.setJudul(film.getJudul());
        logFilm.setPoster(film.getPoster());
        logFilm.setGenre(film.getGenre());
        logFilm.setRilis(film.getRilis());
        logFilm.setDurasi(film.getDurasi());
        logFilm.setSutradara(film.getSutradara());
        logFilm.setGolongan(film.getGolongan());
        logFilm.setRating(film.getRating());
        logFilm.setSinopsis(film.getSinopsis());

        Intent pindahObjek = new Intent(MainActivity.this, DetailActivity.class);
        pindahObjek.putExtra(DetailActivity.EXTRA_FILM, film);
        startActivity(pindahObjek);
    }
}
