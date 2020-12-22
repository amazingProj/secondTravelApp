package com.example.secondtravelapp.Repository;

import androidx.lifecycle.MutableLiveData;

import androidx.lifecycle.MutableLiveData;


import com.example.secondtravelapp.Models.Travel;

import java.util.List;

public interface ITravelRepository {
    void addTravel(Travel travel);
    void updateTravel(Travel travel);
    MutableLiveData<List<Travel>> getAllTravels();
    MutableLiveData<Boolean> getIsSuccess();
}
