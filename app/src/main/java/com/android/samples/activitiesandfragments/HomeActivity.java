package com.android.samples.activitiesandfragments;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.android.samples.OnButtonClickListener;
import com.android.samples.R;
import com.android.samples.util.AppConstants;

public class HomeActivity extends AppCompatActivity implements OnButtonClickListener {

    private FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        HomeFragment homeFragment = new HomeFragment();
        fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container, homeFragment, "HomeFragment");
        fragmentTransaction.commit();
    }

    @Override
    public void onButtonClicked(int whichButton) {
        switch(whichButton){
            case AppConstants.RECYCLER_VIEW_BUTTON:
                RecyclerViewFragment recyclerViewFragment = new RecyclerViewFragment();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, recyclerViewFragment, "RecyclerViewFragment");
                fragmentTransaction.addToBackStack("RecyclerViewFragment");
                fragmentTransaction.commit();
                break;
        }
    }

    public void onBackPressed(){
        if(getFragmentManager().getBackStackEntryCount() == 0) {
            super.onBackPressed();
        }else{
            getFragmentManager().popBackStack();
        }
    }
}
