package com.example.notionary.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.notionary.R;
import com.example.notionary.databinding.FragmentMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainFragment extends Fragment {
    private FragmentMainBinding binding;

//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        binding = FragmentMainBinding.inflate(inflater, container, false);
//        View view = binding.getRoot();
//
//        BottomNavigationView bottomNav = binding.bottomNav;
//
//        NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);
//
//        bottomNav.setOnItemSelectedListener(item -> {
//            if(item.getItemId() == R.id.nav_note) {
//                navController.navigate(R.id.NoteFragment);
//                return true;
//            }
//            if(item.getItemId() == R.id.nav_reminder) {
//                navController.navigate(R.id.ReminderFragment);
//                return true;
//            }
//            if(item.getItemId() == R.id.nav_settings) {
//                navController.navigate(R.id.SettingsFragment);
//                return true;
//            }
//            return false;
//        });
//
//        // Cargar el fragmento de notas por defecto
//        if (savedInstanceState == null) {
//            navController.navigate(R.id.NoteFragment);
//        }
//
//        return view;
//    }
}