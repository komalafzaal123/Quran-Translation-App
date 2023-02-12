package com.example.quranapp

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class SurahModel {
    @SerializedName("number")
    @Expose
    var number: Int? = null

    @SerializedName("text")
    @Expose
    var text: String? = null

    @SerializedName("numberInSurah")
    @Expose
    var numberInSurah: Int? = null

    @SerializedName("juz")
    @Expose
    var juz: Int? = null

    @SerializedName("manzil")
    @Expose
    var manzil: Int? = null

    @SerializedName("page")
    @Expose
    var page: Int? = null

    @SerializedName("ruku")
    @Expose
    var ruku: Int? = null

    @SerializedName("hizbQuarter")
    @Expose
    var hizbQuarter: Int? = null

    @SerializedName("sajda")
    @Expose
    var sajda: Double? = null

    @SerializedName("surah_number")
    @Expose
    var surahNumber: Int? = null

    @SerializedName("surah_name")
    @Expose
    var surahName: String? = null

    @SerializedName("englishName")
    @Expose
    var englishName: String? = null

    @SerializedName("englishNameTranslation")
    @Expose
    var englishNameTranslation: String? = null

    @SerializedName("revelationType")
    @Expose
    var revelationType: String? = null

    @SerializedName("sajda.id")
    @Expose
    var sajdaId: Any? = null

    @SerializedName("sajda.recommended")
    @Expose
    var sajdaRecommended: Any? = null

    @SerializedName("sajda.obligatory")
    @Expose
    var sajdaObligatory: Any? = null

    @SerializedName("UrduTranslation")
    @Expose
    var urduTranslation: String? = null

    @SerializedName("UrduTafseer")
    @Expose
    var urduTafseer: String? = null

    @SerializedName("EnglishTranslation")
    @Expose
    var englishTranslation: String? = null

    @SerializedName("Englishtafseer")
    @Expose
    var englishtafseer: String? = null

    @SerializedName("SindhiTranslation")
    @Expose
    var sindhiTranslation: String? = null

    @SerializedName("SindhiTafseer")
    @Expose
    var sindhiTafseer: String? = null

    @SerializedName("HindiTranslation")
    @Expose
    var hindiTranslation: String? = null

    @SerializedName("HindiTafseer")
    @Expose
    var hindiTafseer: String? = null

    @SerializedName("PushtoTransation")
    @Expose
    var pushtoTransation: String? = null

    @SerializedName("PushtoTafseer")
    @Expose
    var pushtoTafseer: String? = null
}