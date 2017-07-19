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

public class festnitk extends Fragment {

    FestclickListner activityCommandar;

    public  interface FestclickListner{
        public void engineer();
        public void inci();
        public void crescendo();
        public void pheonix();
        public void bd();
        public void spandan();
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            activityCommandar = (FestclickListner) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString());
        }
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fests,container,false);
        Button engineer = (Button)view.findViewById(R.id.engineer);
        Button incident = (Button)view.findViewById(R.id.incident);
        Button crescendo = (Button)view.findViewById(R.id.crescendo);
        Button pheonix = (Button)view.findViewById(R.id.pheonix);
        Button spandan = (Button)view.findViewById(R.id.spandan);
        Button bd = (Button)view.findViewById(R.id.bd);


        engineer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                engibutton(v);
            }
        });

        incident.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incibutton(v);
            }
        });

        crescendo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cresbutton(v);
            }
        });

        pheonix.setOnClickListener(new
                                           View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   phenobutton(v);
                                               }
                                           });
        spandan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spanbutton(v);
            }
        });
        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bdbutton(v);
            }
        });
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    public void incibutton(View v){
        activityCommandar.inci();
    }


    public void engibutton(View v){
        activityCommandar.engineer();
    }

    public void cresbutton(View v){
        activityCommandar.crescendo();
    }

    public void phenobutton(View v){
        activityCommandar.pheonix();
    }

    public void spanbutton(View v){
        activityCommandar.spandan();
    }

    public void bdbutton(View v){
        activityCommandar.bd();
    }
}
