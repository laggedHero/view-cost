package net.laggedhero.viewcost.overdraw;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

public class OverdrawAdapter extends RecyclerView.Adapter<OverdrawListView.OverdrawListViewHolder> {
    @Override
    public OverdrawListView.OverdrawListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return OverdrawListView.onCreateViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(OverdrawListView.OverdrawListViewHolder holder, int position) {
        OverdrawListView.onBindViewHolder(holder, position);
    }

    @Override
    public int getItemCount() {
        return 15;
    }
}
