package com.geektech.countermvvm.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.geektech.countermvvm.model.CounterModel;

public class MainViewModel extends ViewModel {

    CounterModel counterModel = new CounterModel();

    MutableLiveData<Integer> count = new MutableLiveData<>();

    public MutableLiveData<Integer> increment(){
        counterModel.increment();
        count.postValue(counterModel.getCount());
        return count;
    }
    public MutableLiveData<Integer> decrement(){
        counterModel.decrement();
        count.postValue(counterModel.getCount());
        return count;
    }

}
