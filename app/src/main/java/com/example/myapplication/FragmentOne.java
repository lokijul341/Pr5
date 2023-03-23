package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FragmentOne extends Fragment {

    private NavController navController;

    public FragmentOne()
    {
        super(R.layout.fragment_one);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        navController = NavHostFragment.findNavController(this);

        Button buttonToSecondFragment = view.findViewById(R.id.button);
        buttonToSecondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_first_fragment_to_second_fragment);
            }
        });

        Button buttonToThirdFragment = view.findViewById(R.id.button2);
        buttonToThirdFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_first_fragment_to_third_fragment);
            }
        });

        return view;
    }
}