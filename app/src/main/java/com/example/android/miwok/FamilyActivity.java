package com.example.android.miwok;

import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Family> familys = new ArrayList<Family>();
        familys.add(new Family("father","әpә"));
        familys.add(new Family("mother","әṭa"));
        familys.add(new Family("son","angsi"));
        familys.add(new Family("daughter","ṭune"));
        familys.add(new Family("older brother","taachi"));
        familys.add(new Family("younger brother","chalitti"));
        familys.add(new Family("older sister","teṭe"));
        familys.add(new Family("younger sister","kolliti"));
        familys.add(new Family("grandmother","ama"));
        familys.add(new Family("grandfather","paapa"));

        //Log.v("NumbersActivity", "Family at Index9: " + Familys.get(9));

        FamilyAdapter adapter = new FamilyAdapter(this, familys);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


        //LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);


    }
}