package com.example.bordia98.firstyearnitk;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by bordia98 on 17/7/17.
 */

public class books extends Fragment {


    courseclickListener activityCommandar;

    public interface courseclickListener{
        public void physics();
        public void chemistry();
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            activityCommandar=(courseclickListener) activity;
        }catch (ClassCastException e) {
            throw new ClassCastException(activity.toString());
        }
    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.books,container,false);
        Button phy = (Button)view.findViewById(R.id.physics);
        Button chem = (Button)view.findViewById(R.id.chemistry);


        phy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonphy(v);
            }
        });

        chem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonchem(v);
            }
        });
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Books");
    }
    public void buttonphy(View view)
    {

        activityCommandar.physics();
    }

    public void buttonchem(View view)
    {
        activityCommandar.chemistry();
    }
}
