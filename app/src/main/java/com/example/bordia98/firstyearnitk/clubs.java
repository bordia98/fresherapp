package com.example.bordia98.firstyearnitk;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by bordia98 on 17/7/17.
 */

public class clubs extends Fragment {

     clubsclickListener activityCommandar;

    public interface clubsclickListener{
        public void technical();
        public void cultural();
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            activityCommandar=(clubsclickListener) activity;
        }catch (ClassCastException e) {
            throw new ClassCastException(activity.toString());
        }
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.clubs,container,false);

        ImageView tech = (ImageView) view.findViewById(R.id.technicalclubs);
        ImageView cult = (ImageView) view.findViewById(R.id.culturalclubs);

        tech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttontech(v);
            }
        });

        cult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttoncult(v);
            }
        });

        return view;
    }

    public void buttontech(View view) {
        activityCommandar.technical();
    }

    public  void buttoncult(View view){
        activityCommandar.cultural();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
