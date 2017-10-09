package com.tbdev.fragmentpageradapter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;

/**
 * Created by developer on 9.10.2017.
 */

public class FragmentOne extends Fragment {

    public FragmentOne() {
        Log.i("TOLGAHAN","Fragment one oluşturuldu");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_one, container, false);
    }
}
