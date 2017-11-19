package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.miwok.adapters.WordsAdapter;
import com.example.android.miwok.pojo.Words;

import java.util.ArrayList;
import java.util.List;

public class NumbersActivity extends AppCompatActivity {

    List<Words> words=new ArrayList<>();
    ListView list;
    int[] imageIDArray={R.drawable.number_one,R.drawable.number_two,R.drawable.number_three,
                        R.drawable.number_four,R.drawable.number_five,R.drawable.number_six,R.drawable.number_seven,
    R.drawable.number_eight,R.drawable.number_nine,R.drawable.number_ten};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
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



        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
        WordsAdapter items=new WordsAdapter(this,words,R.color.category_colors);

        list=new ListView(this);
        list.setAdapter(items);
        rootView.addView(list);

    }
}
