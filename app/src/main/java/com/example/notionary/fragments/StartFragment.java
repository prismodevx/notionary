package com.example.notionary.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.notionary.R;
import com.example.notionary.databinding.FragmentStartBinding;


public class StartFragment extends Fragment {
    private FragmentStartBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentStartBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        binding.btnToLogin.setOnClickListener(v -> {
//            NavDirections action = StartFragmentDirections.actionStartFragmentToLoginFragment();
//            Navigation.findNavController(view).navigate(action);
//        });
    }
}