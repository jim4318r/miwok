package com.example.android.miwok;

import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Color> colors = new ArrayList<Color>();
        colors.add(new Color("red","wetetti"));
        colors.add(new Color("green","chokokki"));
        colors.add(new Color("brown","ṭakaakki"));
        colors.add(new Color("gray","ṭopoppi"));
        colors.add(new Color("black","kululli"));
        colors.add(new Color("white","kelelli"));
        colors.add(new Color("dusty yellow","ṭopiisә"));
        colors.add(new Color("mustard yellow","chiwiiṭә"));

        //Log.v("NumbersActivity", "Color at Index9: " + colors.get(9));

        ColorAdapter adapter = new ColorAdapter(this, colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


        //LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);


    }
}