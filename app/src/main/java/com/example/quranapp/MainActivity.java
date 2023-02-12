package com.example.quranapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    SurahAdapter adapter;
    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<HashMap<String, String>> myDataList = new ArrayList<HashMap<String, String>>();
        recyclerView = findViewById(R.id.recycler_view);

        adapter = new SurahAdapter(Arrays.asList(getResources().getStringArray(R.array.surah_names_list)),
                surahNumber -> {
                    String allAyaatsToDisplay = "";
                    for (int i = 0; i < myDataList.size(); i++) {

                        if (myDataList.get(i).get("surah_number").equals(String.valueOf(surahNumber))) {
                            allAyaatsToDisplay = allAyaatsToDisplay + " " + myDataList.get(i).get("text");
                        }
                    }
//                    String check = "";
                    Intent intent = new Intent(this, ShowCompleteSurah.class);
                    intent.putExtra("data",allAyaatsToDisplay);
                    startActivity(intent);
                    Log.d("size", String.valueOf(myDataList.size()));

                });
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        try {
            JSONObject obj = new JSONObject(loadJSONFromAsset(this));
            JSONArray m_jArry = obj.getJSONArray("mylist");
            HashMap<String, String> hashObj;

            for (int i = 0; i < m_jArry.length(); i++) {
                JSONObject jsonObject = m_jArry.getJSONObject(i);

                String text = jsonObject.getString("text");
                String surah_name = jsonObject.getString("surah_name");
                String surah_number = jsonObject.getString("surah_number");

                hashObj = new HashMap<String, String>();
                hashObj.put("text", text);
                hashObj.put("surah_name", surah_name);
                hashObj.put("surah_number", surah_number);

                myDataList.add(hashObj);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String str = "";
    }

    private  String loadJSONFromAsset(Activity act)
    {
        String text = "";
        try {
            InputStream is = act.getAssets().open("QuranMetaData.json");

            int size = is.available();

            // Read the entire asset into a local byte buffer.
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            text = new String(buffer, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }
}