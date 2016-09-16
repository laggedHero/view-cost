package net.laggedhero.viewcost.constraint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import net.laggedhero.viewcost.R;

public class ConstraintActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint);

        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
    }
}
