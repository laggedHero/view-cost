package net.laggedhero.viewcost;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import net.laggedhero.viewcost.constraint.ConstraintActivity;
import net.laggedhero.viewcost.hierarchy.HierarchyActivity;
import net.laggedhero.viewcost.linear.LinearActivity;
import net.laggedhero.viewcost.overdraw.OverdrawActivity;
import net.laggedhero.viewcost.relative.RelativeActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));

        setUp();
    }

    private void setUp() {
        findViewById(R.id.overdraw_example).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, OverdrawActivity.class));
            }
        });

        findViewById(R.id.hierarchy_example).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, HierarchyActivity.class));
            }
        });

        findViewById(R.id.relativelayout_example).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RelativeActivity.class));
            }
        });

        findViewById(R.id.linearlayout_example).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LinearActivity.class));
            }
        });

        findViewById(R.id.constraintlayout_example).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ConstraintActivity.class));
            }
        });
    }
}
