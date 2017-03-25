package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import static android.view.View.Z;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        LinearLayout rootview = (LinearLayout) findViewById(R.id.rootView);

       /* int i = 0;
        while (i < words.size()) {
            TextView wordView = new TextView(this);
            wordView.setText(words.get(i));
            rootview.addView(wordView);
            i++;
        }    */

        for (int i = 0; i < words.size(); i++) {
            TextView wordView = new TextView(this);
            wordView.setText(words.get(i));
            rootview.addView(wordView);
        }
    }
}
