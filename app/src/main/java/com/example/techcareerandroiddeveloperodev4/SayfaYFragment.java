package com.example.techcareerandroiddeveloperodev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.techcareerandroiddeveloperodev4.databinding.FragmentSayfaYBinding;


public class SayfaYFragment extends Fragment {

    private FragmentSayfaYBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentSayfaYBinding.inflate(inflater,container,false);

        return binding.getRoot();
    }
}