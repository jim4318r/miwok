package com.example.android.miwok;

import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Phrases> phrases = new ArrayList<Phrases>();
        phrases.add(new Phrases("Where are you going?","minto wuksus"));
        phrases.add(new Phrases("What is your name?","tinnә oyaase'nә"));
        phrases.add(new Phrases("My name is...","oyaaset..."));
        phrases.add(new Phrases("How are you feeling?","michәksәs?"));
        phrases.add(new Phrases("I’m feeling good.","kuchi achit"));
        phrases.add(new Phrases("Are you coming?","әәnәs'aa?"));
        phrases.add(new Phrases("Yes, I’m coming.","hәә’ әәnәm"));
        phrases.add(new Phrases("I’m coming.","әәnәm"));
        phrases.add(new Phrases("Let’s go.","yoowutis"));
        phrases.add(new Phrases("Come here.","әnni'nem"));

        PhrasesAdapter adapter = new PhrasesAdapter(this, phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


        //LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);


    }
}