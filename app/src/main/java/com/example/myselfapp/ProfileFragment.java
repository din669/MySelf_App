package com.example.myselfapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import android.widget.ImageView;
import android.widget.TextView;

//NIM    : 10119216
//Nama   : Muhammad Syarifuddin Rahiman
//Kelas  : IF-6
//Tanggal Pengerjaan : 22-05-2022

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProfileFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfileFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ProfileFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ProfileFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ProfileFragment newInstance(String param1, String param2) {
        ProfileFragment fragment = new ProfileFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    ImageView ivFacebook, ivInstagram, ivWhatsapp, ivMail, ivLocation, ivAbout;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_profile, container, false);

        ivFacebook = root.findViewById(R.id.iv_facebook);
        ivInstagram = root.findViewById(R.id.iv_instagram);
        ivWhatsapp = root.findViewById(R.id.iv_whatsapp);
        ivMail = root.findViewById(R.id.iv_email);
        ivLocation = root.findViewById(R.id.iv_location);
        ivAbout = root.findViewById(R.id.iv_about);


        ivFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent facebook = new Intent();
                facebook.setAction(Intent.ACTION_VIEW);
                facebook.addCategory(Intent.CATEGORY_BROWSABLE);
                facebook.setData(Uri.parse("https://www.facebook.com/din669/"));
                startActivity(facebook);
            }
        });

        ivInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent instagram = new Intent();
                instagram.setAction(Intent.ACTION_VIEW);
                instagram.addCategory(Intent.CATEGORY_BROWSABLE);
                instagram.setData(Uri.parse("https://www.instagram.com/din_669/"));
                startActivity(instagram);
            }
        });

        ivWhatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent whatsapp = new Intent();
                whatsapp.setAction(Intent.ACTION_VIEW);
                whatsapp.addCategory(Intent.CATEGORY_BROWSABLE);
                whatsapp.setData(Uri.parse("https://api.whatsapp.com/send?phone=6281320997849"));
                startActivity(whatsapp);
            }
        });

        ivMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mail = new Intent();
                mail.setAction(Intent.ACTION_VIEW);
                mail.addCategory(Intent.CATEGORY_BROWSABLE);
                mail.setData(Uri.parse("mailto:muhammadsyarifuddin669@gmail.com"));
                startActivity(mail);
            }
        });

        ivLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent location = new Intent();
                location.setAction(Intent.ACTION_VIEW);
                location.addCategory(Intent.CATEGORY_BROWSABLE);
                location.setData(Uri.parse("https://goo.gl/maps/i9FSJ5RNCxAYMuoZ9"));
                startActivity(location);
            }
        });

        ivAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CostumDialog aboutDialog = new CostumDialog();
                aboutDialog.show(getFragmentManager(),"AboutDialogFragment");
            }
        });

        return root;

    }
}