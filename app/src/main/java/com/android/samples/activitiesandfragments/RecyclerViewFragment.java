package com.android.samples.activitiesandfragments;


import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.samples.R;
import com.android.samples.adapters.SimpleRecyclerViewAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecyclerViewFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private Context context;

    public RecyclerViewFragment() {
    }

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_recycler_view, container, false);
        recyclerView = (RecyclerView)rootView.findViewById(R.id.recycler_view);

        layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);

        SimpleRecyclerViewAdapter adapter = new SimpleRecyclerViewAdapter();
        recyclerView.setAdapter(adapter);

        return rootView;
    }

}
