package com.example.myselfapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link GaleryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GaleryFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public GaleryFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment GaleryFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static GaleryFragment newInstance(String param1, String param2) {
        GaleryFragment fragment = new GaleryFragment();
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

    RecyclerView recyclerViewGalery;
    ArrayList<GaleryModel> galeryModel;
    private StaggeredGridLayoutManager manager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_galery, container, false);

        recyclerViewGalery = root.findViewById(R.id.rv_galery);
        manager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        recyclerViewGalery.setLayoutManager(manager);

        galeryModel = new ArrayList<>();

        GaleryModel galery1 = new GaleryModel(R.drawable.f_galery1);
        galeryModel.add(galery1);
        GaleryModel galery2 = new GaleryModel(R.drawable.f_galery2);
        galeryModel.add(galery2);
        GaleryModel galery3 = new GaleryModel(R.drawable.f_galery3);
        galeryModel.add(galery3);
        GaleryModel galery4 = new GaleryModel(R.drawable.f_galery4);
        galeryModel.add(galery4);
        GaleryModel galery5 = new GaleryModel(R.drawable.f_galery5);
        galeryModel.add(galery5);
        GaleryModel galery6 = new GaleryModel(R.drawable.f_galery6);
        galeryModel.add(galery6);


        recyclerViewGalery.setAdapter(new GaleryAdapter(galeryModel));

        return root;
    }
}