package net.syarihu.android.searchviewtest;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.SearchView;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.widget.ImageView;

public class Utils {
    /**
     * @param resources  Resources
     * @param searchView SearchView you want to change the style
     * @param queryHint  Hint text
     */
    public static void changeSearchViewStyle(Resources resources, SearchView searchView, String queryHint) {
        SearchView.SearchAutoComplete searchAutoComplete =
                (SearchView.SearchAutoComplete) searchView
                        .findViewById(
                                R.id.search_src_text
                        );
        // Search icon of ActionBar
        ImageView searchIcon = (ImageView)
                searchView.findViewById(
                        R.id.search_button
                );
        searchIcon.setImageResource(R.drawable.ic_action_search);

        SpannableStringBuilder ssb = new SpannableStringBuilder("   ");
        // Hint text
        ssb.append(queryHint);
        // Hint icon
        Drawable searchHintIcon =
                resources.getDrawable(R.drawable.ic_action_search);
        int textSize = (int) (searchAutoComplete.getTextSize() * 1.25);
        searchHintIcon.setBounds(0, 0, textSize, textSize);
        ssb.setSpan(
                new ImageSpan(searchHintIcon),
                1,
                2,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        );
        searchAutoComplete.setHint(ssb);

        // Text color
        searchAutoComplete.setTextColor(Color.rgb(0x56, 0x77, 0xfc));
        // Hint text color
        searchAutoComplete.setHintTextColor(
                Color.rgb(0x91, 0xa7, 0xff)
        );
        // Remove button icon
        ImageView removeIcon =
                (ImageView) searchView.findViewById(
                        R.id.search_close_btn
                );
        removeIcon.setImageResource(R.drawable.ic_action_remove);
    }
}