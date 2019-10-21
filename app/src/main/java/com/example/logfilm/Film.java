package com.example.logfilm;

import android.os.Parcel;
import android.os.Parcelable;

class Film implements Parcelable {
    private String judul;
    private  String rilis;
    private int poster;
    private String genre;
    private String durasi;
    private String sutradara;
    private String golongan;
    private String rating;
    private String sinopsis;

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getRilis() {
        return rilis;
    }

    public void setRilis(String rilis) {
        this.rilis = rilis;
    }

    public int getPoster() {
        return poster;
    }

    public void setPoster(int poster) {
        this.poster = poster;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDurasi() {
        return durasi;
    }

    public void setDurasi(String durasi) {
        this.durasi = durasi;
    }

    public String getSutradara() {
        return sutradara;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }

    public String getGolongan() {
        return golongan;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.judul);
        dest.writeString(this.rilis);
        dest.writeInt(this.poster);
        dest.writeString(this.genre);
        dest.writeString(this.durasi);
        dest.writeString(this.sutradara);
        dest.writeString(this.golongan);
        dest.writeString(this.rating);
        dest.writeString(this.sinopsis);
    }

    public Film() {
    }

    protected Film(Parcel in) {
        this.judul = in.readString();
        this.rilis = in.readString();
        this.poster = in.readInt();
        this.genre = in.readString();
        this.durasi = in.readString();
        this.sutradara = in.readString();
        this.golongan = in.readString();
        this.rating = in.readString();
        this.sinopsis = in.readString();
    }

    public static final Parcelable.Creator<Film> CREATOR = new Parcelable.Creator<Film>() {
        @Override
        public Film createFromParcel(Parcel source) {
            return new Film(source);
        }

        @Override
        public Film[] newArray(int size) {
            return new Film[size];
        }
    };
}
