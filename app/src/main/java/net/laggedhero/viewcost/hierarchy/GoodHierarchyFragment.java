package net.laggedhero.viewcost.hierarchy;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.laggedhero.viewcost.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GoodHierarchyFragment extends Fragment {

    public GoodHierarchyFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_good_hierarchy, container, false);
    }

}
