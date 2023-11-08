package com.example.techcareerandroiddeveloperodev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.techcareerandroiddeveloperodev4.databinding.FragmentSayfaXBinding;


public class SayfaXFragment extends Fragment {

    private FragmentSayfaXBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentSayfaXBinding.inflate(inflater,container,false);
        binding.gitButtonXToY.setOnClickListener(v->{
            Navigation.findNavController(v).navigate(R.id.sayfaXtoY);
        });
        return binding.getRoot();
    }
}