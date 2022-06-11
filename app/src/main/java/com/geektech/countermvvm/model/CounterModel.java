package com.geektech.countermvvm.model;

public class CounterModel {

    public Integer count = 0;

    public int getCount() {
        return count;
    }

    public int increment(){
        return count++;
    }

    public int decrement(){
        return count--;
    }
}
