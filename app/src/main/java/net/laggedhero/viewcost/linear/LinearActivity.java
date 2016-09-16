package net.laggedhero.viewcost.linear;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import net.laggedhero.viewcost.R;

import org.lucasr.probe.Probe;
import org.lucasr.probe.interceptors.OvermeasureInterceptor;

public class LinearActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Probe.deploy(this, new OvermeasureInterceptor(R.id.activity_linear));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);

        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
    }
}
