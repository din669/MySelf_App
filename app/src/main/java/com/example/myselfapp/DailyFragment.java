package com.example.myselfapp;

import android.os.Bundle;
import java.util.ArrayList;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;

//NIM    : 10119216
//Nama   : Muhammad Syarifuddin Rahiman
//Kelas  : IF-6
//Tanggal Pengerjaan : 22-05-2022

public class DailyFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    public DailyFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DailyFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DailyFragment newInstance(String param1, String param2) {
        DailyFragment fragment = new DailyFragment();
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
            // TODO: Rename and change types of parameters
            String mParam1 = getArguments().getString(ARG_PARAM1);
            String mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }


    RecyclerView recyclerViewDaily;
    ArrayList<DailyModel> dailyModel;



    RecyclerView recyclerViewFriendlist;
    ArrayList<FriendlistModel> friendlistModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View root = inflater.inflate(R.layout.fragment_daily, container, false);


        recyclerViewDaily = root.findViewById(R.id.rv_daily);
        recyclerViewDaily.setLayoutManager(new LinearLayoutManager(getContext()));

        dailyModel = new ArrayList<>();

        DailyModel daily1 = new DailyModel(R.drawable.ic_sleep, "SLEEP");
        dailyModel.add(daily1);
        DailyModel daily2 = new DailyModel(R.drawable.hobby, "GAMING");
        dailyModel.add(daily2);
        DailyModel daily3 = new DailyModel(R.drawable.rice, "MAKAN");
        dailyModel.add(daily3);
        DailyModel daily4 = new DailyModel(R.drawable.coffe, "MINUM");
        dailyModel.add(daily4);
        DailyModel daily5 = new DailyModel(R.drawable.ic_sleep, "SLEEP");
        dailyModel.add(daily5);

        recyclerViewDaily.setAdapter(new DailyAdapter(dailyModel));



        recyclerViewFriendlist = root.findViewById(R.id.rv_friendlist);
        recyclerViewFriendlist.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        friendlistModel = new ArrayList<>();

        FriendlistModel friendlist1 = new FriendlistModel(R.drawable.ic_friend1, "Ilham");
        friendlistModel.add(friendlist1);
        FriendlistModel friendlist2 = new FriendlistModel(R.drawable.ic_friend2, "Dzul");
        friendlistModel.add(friendlist2);
        FriendlistModel friendlist3 = new FriendlistModel(R.drawable.ic_friend3, "Azhar");
        friendlistModel.add(friendlist3);
        FriendlistModel friendlist4 = new FriendlistModel(R.drawable.ic_friend4, "Andra");
        friendlistModel.add(friendlist4);
        FriendlistModel friendlist5 = new FriendlistModel(R.drawable.ic_friend5, "Khamila");
        friendlistModel.add(friendlist5);

        recyclerViewFriendlist.setAdapter(new FriendlistAdapter(friendlistModel));

        return root;
    }


}