package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.view.LayoutInflater;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.android.miwok.R.id.miwok_text_view;

/**
 * Created by jimr on 8/9/2017.
 */

public class PhrasesAdapter extends ArrayAdapter<Phrases> {

    private static final String LOG_TAG = PhrasesAdapter.class.getSimpleName();

    public PhrasesAdapter(Activity context, ArrayList<Phrases> Phrasess) {
        super(context, 0, Phrasess);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Phrases} object located at this position in the list
        Phrases currentPhrases = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the miwok text name from the current Phrases object and
        // set this text on the name TextView
        miwokTextView.setText(currentPhrases.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView defaultText = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        defaultText.setText(currentPhrases.getDefaultTranslation());
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
