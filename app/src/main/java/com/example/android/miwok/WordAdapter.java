package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Christian PC on 25/03/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    //BG color
    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> WordAdapter, int colorResourceId) {
        super(context, 0, WordAdapter);
        mColorResourceId = colorResourceId;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the Word object located at this position in the list
        Word currentWord = getItem(position);
        // Find the TextView in the list_item.xml layout with the Miwok translation
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the miwok Tranlation from the current Word object and set this text on the miwok_text_view
        miwokTextView.setText(currentWord.getMiwokTranslation());

        // Same for defaultTextView
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentWord.getImageResourceId() != 0) {
            imageView.setImageResource(currentWord.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        //set the color for the background
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
