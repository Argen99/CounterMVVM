package com.geektech.countermvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;

import com.geektech.countermvvm.databinding.ActivityMainBinding;
import com.geektech.countermvvm.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewModel = new ViewModelProvider(this).get(MainViewModel.class);


        binding.btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewModel.increment().observe(MainActivity.this, integer -> {
                    binding.tvCounter.setText(String.valueOf(integer));
                });
            }
        });
        binding.btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewModel.decrement().observe(MainActivity.this,integer -> {
                    binding.tvCounter.setText(String.valueOf(integer));
                });
            }
        });
    }


}