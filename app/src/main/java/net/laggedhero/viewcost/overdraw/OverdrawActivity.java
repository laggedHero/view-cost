package net.laggedhero.viewcost.overdraw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import net.laggedhero.viewcost.R;

public class OverdrawActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overdraw);

        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.activity_overdraw_recycler_view);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new OverdrawAdapter());
    }
}
