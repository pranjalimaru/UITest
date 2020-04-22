package com.example.android.uitest.ViewPager;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.android.uitest.StatesFront.AndamanNicobarFront;
import com.example.android.uitest.StatesFront.AndhraPradeshFront;
import com.example.android.uitest.StatesFront.ArunachalPradeshFront;
import com.example.android.uitest.StatesFront.AssamFront;
import com.example.android.uitest.StatesFront.BiharFront;
import com.example.android.uitest.StatesFront.ChandigarhFront;
import com.example.android.uitest.StatesFront.ChhatisgarhFront;
import com.example.android.uitest.StatesFront.DadraNagarHaveliFront;
import com.example.android.uitest.StatesFront.DamanDiuFront;
import com.example.android.uitest.StatesFront.GoaFront;
import com.example.android.uitest.StatesFront.GujaratFront;
import com.example.android.uitest.StatesFront.HaryanaFront;
import com.example.android.uitest.StatesFront.HimachalPradeshFront;
import com.example.android.uitest.StatesFront.JammuKashmirFront;
import com.example.android.uitest.StatesFront.JharkhandFront;
import com.example.android.uitest.StatesFront.KarnatakaFront;
import com.example.android.uitest.StatesFront.KeralaFront;
import com.example.android.uitest.StatesFront.LakshadweepFront;
import com.example.android.uitest.StatesFront.MadhyaPradeshFront;
import com.example.android.uitest.StatesFront.MaharashtraFront;
import com.example.android.uitest.StatesFront.ManipurFront;
import com.example.android.uitest.StatesFront.MeghalayaFront;
import com.example.android.uitest.StatesFront.MizoramFront;
import com.example.android.uitest.StatesFront.NCTDelhiFront;
import com.example.android.uitest.StatesFront.NagalandFront;
import com.example.android.uitest.StatesFront.OdishaFront;
import com.example.android.uitest.StatesFront.PondicherryFront;
import com.example.android.uitest.StatesFront.PunjabFront;
import com.example.android.uitest.R;
import com.example.android.uitest.StatesFront.RajasthanFront;
import com.example.android.uitest.StatesFront.SikkimFront;
import com.example.android.uitest.StatesFront.TamilNaduFront;
import com.example.android.uitest.StatesFront.TripuraFront;
import com.example.android.uitest.StatesFront.UttarPradeshFront;
import com.example.android.uitest.StatesFront.UttrakhandFront;
import com.example.android.uitest.StatesFront.WestBengalFront;


/**
 * A simple {@link Fragment} subclass.
 */
public class one extends Fragment {

    Context context;

    public one() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_state, container, false);
        context = rootView.getContext();

        Button gujarat = rootView.findViewById(R.id.Gujarat);
        Button AndamanNicobar = rootView.findViewById(R.id.AndamanNicobar);
        Button AndhraPradesh = rootView.findViewById(R.id.AndhraPradesh);
        Button ArunachalPradesh = rootView.findViewById(R.id.ArunachalPradesh);
        Button Assam = rootView.findViewById(R.id.Assam);
        Button Bihar = rootView.findViewById(R.id.Bihar);
        Button Chandigarh = rootView.findViewById(R.id.Chandigarh);
        Button Chhatisgarh = rootView.findViewById(R.id.Chhatisgarh);
        Button DadraNagarHaveli = rootView.findViewById(R.id.DadraNagarHaveli);
        Button DamanDiu = rootView.findViewById(R.id.DamanDiu);
        Button NCTDelhi = rootView.findViewById(R.id.NCTDelhi);
        Button Goa = rootView.findViewById(R.id.Goa);
        Button Haryana = rootView.findViewById(R.id.Haryana);
        Button HimachalPradesh = rootView.findViewById(R.id.HimachalPradesh);
        Button JammuKashmir = rootView.findViewById(R.id.JammuKashmir);
        Button Jharkhand = rootView.findViewById(R.id.Jharkhand);
        Button Karnataka = rootView.findViewById(R.id.Karnataka);
        Button Kerala = rootView.findViewById(R.id.Kerala);
        Button Lakshadweep = rootView.findViewById(R.id.Lakshadweep);
        Button MadhyaPradesh = rootView.findViewById(R.id.MadhyaPradesh);
        Button Maharashtra = rootView.findViewById(R.id.Maharashtra);
        Button Manipur = rootView.findViewById(R.id.Manipur);
        Button Meghalaya = rootView.findViewById(R.id.Meghalaya);
        Button Mizoram = rootView.findViewById(R.id.Mizoram);
        Button Nagaland = rootView.findViewById(R.id.Nagaland);
        Button Odisha = rootView.findViewById(R.id.Odisha);
        Button Pondicherry = rootView.findViewById(R.id.Pondicherry);
        Button Punjab = rootView.findViewById(R.id.Punjab);
        Button Rajasthan = rootView.findViewById(R.id.Rajasthan);
        Button Sikkim = rootView.findViewById(R.id.Sikkim);
        Button TamilNadu = rootView.findViewById(R.id.TamilNadu);
        Button Tripura = rootView.findViewById(R.id.Tripura);
        Button UttarPradesh = rootView.findViewById(R.id.UttarPradesh);
        Button Uttrakhand = rootView.findViewById(R.id.Uttrakhand);
        Button WestBengal = rootView.findViewById(R.id.WestBengal);


        gujarat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, GujaratFront.class);
                startActivity(intent);
            }
        });

        AndamanNicobar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, AndamanNicobarFront.class);
                startActivity(intent);
            }
        });

        AndhraPradesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, AndhraPradeshFront.class);
                startActivity(intent);
            }
        });

        ArunachalPradesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ArunachalPradeshFront.class);
                startActivity(intent);
            }
        });

        Assam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, AssamFront.class);
                startActivity(intent);
            }
        });

        Bihar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, BiharFront.class);
                startActivity(intent);
            }
        });

        Chandigarh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ChandigarhFront.class);
                startActivity(intent);
            }
        });

        Chhatisgarh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ChhatisgarhFront.class);
                startActivity(intent);
            }
        });

        DadraNagarHaveli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DadraNagarHaveliFront.class);
                startActivity(intent);
            }
        });

        DamanDiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DamanDiuFront.class);
                startActivity(intent);
            }
        });

        NCTDelhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, NCTDelhiFront.class);
                startActivity(intent);
            }
        });

        Goa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, GoaFront.class);
                startActivity(intent);
            }
        });

        Haryana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, HaryanaFront.class);
                startActivity(intent);
            }
        });

        HimachalPradesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, HimachalPradeshFront.class);
                startActivity(intent);
            }
        });

        JammuKashmir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, JammuKashmirFront.class);
                startActivity(intent);
            }
        });

        Jharkhand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, JharkhandFront.class);
                startActivity(intent);
            }
        });

        Karnataka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, KarnatakaFront.class);
                startActivity(intent);
            }
        });

        Kerala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, KeralaFront.class);
                startActivity(intent);
            }
        });

        Lakshadweep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, LakshadweepFront.class);
                startActivity(intent);
            }
        });

        MadhyaPradesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MadhyaPradeshFront.class);
                startActivity(intent);
            }
        });

        Maharashtra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MaharashtraFront.class);
                startActivity(intent);
            }
        });

        Manipur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ManipurFront.class);
                startActivity(intent);
            }
        });

        Meghalaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MeghalayaFront.class);
                startActivity(intent);
            }
        });

        Mizoram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MizoramFront.class);
                startActivity(intent);
            }
        });

        Nagaland.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, NagalandFront.class);
                startActivity(intent);
            }
        });

        Odisha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, OdishaFront.class);
                startActivity(intent);
            }
        });

        Pondicherry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, PondicherryFront.class);
                startActivity(intent);
            }
        });

        Punjab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, PunjabFront.class);
                startActivity(intent);
            }
        });

        Rajasthan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, RajasthanFront.class);
                startActivity(intent);
            }
        });

        Sikkim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, SikkimFront.class);
                startActivity(intent);
            }
        });

        TamilNadu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, TamilNaduFront.class);
                startActivity(intent);
            }
        });

        Tripura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, TripuraFront.class);
                startActivity(intent);
            }
        });

        UttarPradesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, UttarPradeshFront.class);
                startActivity(intent);
            }
        });

        Uttrakhand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, UttrakhandFront.class);
                startActivity(intent);
            }
        });

        WestBengal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, WestBengalFront.class);
                startActivity(intent);
            }
        });
        return rootView;
    }


}
