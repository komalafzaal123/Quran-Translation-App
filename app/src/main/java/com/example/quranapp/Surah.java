package com.example.quranapp;

public class Surah {
    private int surahNo;
    private String surahName;

    public Surah(int surahNo, String surahName) {
        this.surahNo = surahNo;
        this.surahName = surahName;
    }

    public int getSurahNo() {
        return surahNo;
    }

    public void setSurahNo(int surahNo) {
        this.surahNo = surahNo;
    }

    public String getSurahName() {
        return surahName;
    }

    public void setSurahName(String surahName) {
        this.surahName = surahName;
    }
}
