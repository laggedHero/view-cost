package net.laggedhero.viewcost.overdraw;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.laggedhero.viewcost.R;

public class OverdrawListView {

    public static OverdrawListView.OverdrawListViewHolder onCreateViewHolder(ViewGroup parent) {
        return new OverdrawListViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.view_overdraw_list_item, parent, false));
    }

    public static void onBindViewHolder(OverdrawListView.OverdrawListViewHolder holder, int position) {
    }

    public static class OverdrawListViewHolder extends RecyclerView.ViewHolder {
        public OverdrawListViewHolder(View itemView) {
            super(itemView);
        }
    }
}
