package com.example.techcareerandroiddeveloperodev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.techcareerandroiddeveloperodev4.databinding.FragmentAnasayfaBinding;


public class AnasayfaFragment extends Fragment {

    private FragmentAnasayfaBinding binding;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding =FragmentAnasayfaBinding.inflate(inflater,container,false);

        binding.gitButtonA.setOnClickListener(v -> {

            Navigation.findNavController(v).navigate(R.id.sayfaAGecis);
        });

        binding.gitButtonB.setOnClickListener(view->{
            Navigation.findNavController(view).navigate(R.id.sayfaXGecis);
        });

        return binding.getRoot();
    }
}