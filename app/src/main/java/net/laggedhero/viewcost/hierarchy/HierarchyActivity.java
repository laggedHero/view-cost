package net.laggedhero.viewcost.hierarchy;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import net.laggedhero.viewcost.R;

public class HierarchyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hierarchy);

        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));

        setUpView();
    }

    private void setUpView() {
        ViewPager viewPager = (ViewPager) findViewById(R.id.activityHierarchyPager);
        viewPager.setAdapter(new HierarchyFragmentPagerAdapter(getSupportFragmentManager()));

        TabLayout tabLayout = (TabLayout) findViewById(R.id.contentTab);
        tabLayout.setupWithViewPager(viewPager);
    }
}
