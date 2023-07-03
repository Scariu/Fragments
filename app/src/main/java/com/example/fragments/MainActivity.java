package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.fragments.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        FirstFragment firstFragment = FirstFragment.newInstance("","");
        getSupportFragmentManager().beginTransaction().add(R.id.mainContainer, firstFragment, "First").commit();
    }
}