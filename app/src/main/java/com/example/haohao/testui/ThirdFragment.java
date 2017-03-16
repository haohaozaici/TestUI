package com.example.haohao.testui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hsalf.smilerating.BaseRating;
import com.hsalf.smilerating.SmileRating;

/**
 * Created by haohao on 2017/3/16.
 */

public class ThirdFragment extends Fragment {

    private SmileRating smileRating;

    private static String TAG = ThirdFragment.class.getSimpleName();

    private static int smileRatingChecked;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_third, container, false);

        smileRating = (SmileRating) view.findViewById(R.id.smile_rating);
        smileRating.setSelectedSmile(smileRatingChecked);
        smileRating.setOnSmileySelectionListener(new SmileRating.OnSmileySelectionListener() {
            @Override
            public void onSmileySelected(int smiley, boolean reselected) {
                switch (smiley) {
                    case SmileRating.BAD:
                        Log.i(TAG, "Bad");
                        smileRatingChecked = BaseRating.BAD;
                        break;
                    case SmileRating.GOOD:
                        Log.i(TAG, "Good");
                        smileRatingChecked = BaseRating.GOOD;
                        break;
                    case SmileRating.GREAT:
                        Log.i(TAG, "Great");
                        smileRatingChecked = BaseRating.GREAT;
                        break;
                    case SmileRating.OKAY:
                        Log.i(TAG, "Okay");
                        smileRatingChecked = BaseRating.OKAY;
                        break;
                    case SmileRating.TERRIBLE:
                        Log.i(TAG, "Terrible");
                        smileRatingChecked = BaseRating.TERRIBLE;
                        break;
                }
            }
        });
        return view;
    }

}
