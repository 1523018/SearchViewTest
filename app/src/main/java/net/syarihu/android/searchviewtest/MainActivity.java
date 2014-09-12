package net.syarihu.android.searchviewtest;

import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.SearchView;
import android.view.Menu;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        SearchView searchView =
                (SearchView) MenuItemCompat.getActionView(
                        menu.findItem(R.id.search_view)
                );
        Utils.changeSearchViewStyle(
                getResources(),
                searchView,
                "Enter the keyword"
        );

        return true;
    }
}
