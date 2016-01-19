package com.android.samples.activitiesandfragments;


import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.android.samples.OnButtonClickListener;
import com.android.samples.R;
import com.android.samples.util.AppConstants;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener{


    private Button recyclerViewBtn;
    private OnButtonClickListener onButtonClickListener;

    public HomeFragment() {
        // Required empty public constructor
    }

    public void onAttach(Context context){
        super.onAttach(context);
        if(context != null) {
            onButtonClickListener = (OnButtonClickListener) context;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerViewBtn = (Button)rootView.findViewById(R.id.recycler_view_btn);
        recyclerViewBtn.setOnClickListener(this);
        return rootView;
    }

    @Override
    public void onClick(View v) {
        if(v == recyclerViewBtn){
            if(onButtonClickListener != null){
                onButtonClickListener.onButtonClicked(AppConstants.RECYCLER_VIEW_BUTTON);
            }
        }
    }
}
