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
    private TextView textView;

    public FragmentOne()
    {
        super(R.layout.fragment_one);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);
        textView = view.findViewById(R.id.textView);

        view.findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = textView.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("text", text);
                navController.navigate(R.id.action_first_fragment_to_second_fragment, bundle);
            }
        });

        view.findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = textView.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("text", text);
                navController.navigate(R.id.action_first_fragment_to_third_fragment, bundle);
            }
        });
    }
}
