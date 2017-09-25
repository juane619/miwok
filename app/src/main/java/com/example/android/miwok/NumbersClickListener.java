package com.example.android.miwok;

import android.view.View;
import android.widget.Toast;

/**
 * Created by juane on 24/09/2017.
 */

public class NumbersClickListener implements View.OnClickListener {

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(),
                "Open the list of numbers", Toast.LENGTH_SHORT).show();
    }
}

