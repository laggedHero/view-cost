package net.laggedhero.viewcost.relative;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import net.laggedhero.viewcost.R;

import org.lucasr.probe.Probe;
import org.lucasr.probe.interceptors.OvermeasureInterceptor;

public class RelativeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Probe.deploy(this, new OvermeasureInterceptor(R.id.activity_relative));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);

        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
    }
}
