package com.example.android.miwok.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.android.miwok.R;
import com.example.android.miwok.adapters.WordsAdapter;
import com.example.android.miwok.pojo.Words;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link NumbersFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NumbersFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    List<Words> words=new ArrayList<>();

    int[] imageIDArray={R.drawable.number_one,R.drawable.number_two,R.drawable.number_three,
            R.drawable.number_four,R.drawable.number_five,R.drawable.number_six,R.drawable.number_seven,
            R.drawable.number_eight,R.drawable.number_nine,R.drawable.number_ten};



    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public NumbersFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment NumbersFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static NumbersFragment newInstance(String param1, String param2) {
        NumbersFragment fragment = new NumbersFragment();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root=inflater.inflate(R.layout.fragment_numbers, container, false);
        // Inflate the layout for this fragment
        words.add(new Words(imageIDArray[0],"one","lutti"));
        words.add(new Words(imageIDArray[1],"two","otiiko"));
        words.add(new Words(imageIDArray[2],"three","tolookosu"));
        words.add(new Words(imageIDArray[3],"four","oyyisa"));
        words.add(new Words(imageIDArray[4],"five","massoka"));
        words.add(new Words(imageIDArray[5],"six","temmokka"));
        words.add(new Words(imageIDArray[6],"seven","kenekaku"));
        words.add(new Words(imageIDArray[7],"eight","kawinta"));
        words.add(new Words(imageIDArray[8],"nine","wo'e"));
        words.add(new Words(imageIDArray[9],"ten","na'aacha"));

        ListView list= (ListView) root.findViewById(R.id.listView);
        WordsAdapter items=new WordsAdapter(getActivity(),words,R.color.category_numbers);
        if(items!=null) {
            try {
                list.setAdapter(items);
            } catch (NullPointerException e) {
                Log.i("null", "NULL RETURNED");
            }
        }



        return root;


    }

    @Override
    public void onResume() {
        super.onResume();


    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();
    }



}
