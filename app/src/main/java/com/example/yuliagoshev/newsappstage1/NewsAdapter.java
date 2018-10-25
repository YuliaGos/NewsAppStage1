package com.example.yuliagoshev.newsappstage1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {
    /**
     * Constucts a nes {@link NewsAdapter}
     *
     * @param context of the app
     * @param NewsList    is the list of news, which is the data source of the adapter
     */

    public NewsAdapter(@NonNull Context context, List<News> NewsList) {
        super(context, 0, NewsList);
    }

    /**
     * Returns a list item view that displays information about the news at the given position
     * in the list of news.
     */

    public View getView(int position, View convertView, ViewGroup parent) {
        //Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }
        //Find the news at the given position in the list of news
        News currentNews = getItem(position);

        //Find the TextView with view ID title
        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        //Display the title of the current news in that TextView
        titleView.setText(currentNews.getTitle());

        //Find the TextView with view ID section
        TextView sectionView = (TextView) listItemView.findViewById(R.id.section);
        //Display the section of the current news in that TextView
        sectionView.setText(currentNews.getSection());

        //Find the TextView with view ID author
        TextView authorView = (TextView) listItemView.findViewById(R.id.author);
        //Display the author name of the current news in that TextView
        authorView.setText(currentNews.getAuthor());

        //Find the TextView with view ID date
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        //Display the date of the current news in that TextView
        dateView.setText(currentNews.getDate());

        //Return the list item view that is now swing the appropriate data
        return listItemView;
    }
}
