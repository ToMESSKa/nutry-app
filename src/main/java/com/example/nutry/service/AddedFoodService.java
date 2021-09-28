package com.example.nutry.service;

import com.example.nutry.model.AddedFood;
import com.example.nutry.repository.AddedFoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//FoodService contains the implementation of the findAll() method.
// We use the repository to retrieve data from the database.

@Service
public class AddedFoodService implements IAddedFoodService {

    @Autowired
    private AddedFoodRepository addedFoodRepository;

    @Override
    public List<AddedFood> findAll() {
        //TODO check this var modifyer
        return addedFoodRepository.findAll();
    }


    @Override
    public void save(AddedFood addedFood) {
        addedFoodRepository.save(addedFood);
    }


}