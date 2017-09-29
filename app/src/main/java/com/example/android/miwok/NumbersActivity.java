package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<Word> words= new ArrayList<>(10);
        words.add(new Word("One", "Lutti"));
        words.add(new Word("Two", "otiiko"));
        words.add(new Word("Three", "tolookosu"));
        words.add(new Word("Four", "oyyisa"));
        words.add(new Word("Five", "massokka"));
        words.add(new Word("Six", "temmokka"));
        words.add(new Word("Seven", "kenekau"));
        words.add(new Word("Eight", "kawinta"));
        words.add(new Word("Nine", "wo'e"));
        words.add(new Word("Ten", "na´aacha"));


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
