package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<Word> words= new ArrayList<>(10);
        words.add(new Word("Father", "әpә"));
        words.add(new Word("Mother", "әṭa"));
        words.add(new Word("Son", "angsi"));
        words.add(new Word("Daughter", "tune"));
        words.add(new Word("Older brother", "taachi"));
        words.add(new Word("Younger brother", "chalitti"));
        words.add(new Word("Older sister", "teṭe"));
        words.add(new Word("Younger sister", "kolliti"));
        words.add(new Word("Grandmother", "ama"));
        words.add(new Word("Grandfather", "paapa"));


//        for(String aux: words){
//            TextView tw= new TextView(this);
//            tw.setText(aux);
//            rootView.addView(tw);
//        }

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
