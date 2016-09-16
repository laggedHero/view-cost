package net.laggedhero.viewcost.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

public class MeasureCountTextView extends TextView {

    public MeasureCountTextView(Context context) {
        super(context);
    }

    public MeasureCountTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MeasureCountTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        Log.d("MeasureCountTextView", "onMeasure");
    }
}
