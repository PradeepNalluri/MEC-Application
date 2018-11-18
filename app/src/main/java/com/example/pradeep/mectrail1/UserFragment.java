package com.example.pradeep.mectrail1;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.pradeep.mectrail1.R;

/**
 * Created by delaroy on 3/27/17.
 */
public class UserFragment extends AppCompatActivity {

    private TextView textViewName;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);

    }
}
