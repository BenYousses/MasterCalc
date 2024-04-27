package com.example.calculator.Databases.Entities;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class MyViewModel extends AndroidViewModel {
    Reposetory reposetory;
    public MyViewModel(@NonNull Application application) {
        super(application);
        reposetory = new Reposetory(application);
    }

   public  void InsertOperation (Operation_en nwOperation){
                reposetory.InsertOperation(nwOperation);

    }
   public LiveData<List<Operation_en>> getAllOperation (){
        return reposetory.getAllOperation();
    }

  public void deleteAllOpeartion(){
             reposetory.deleteAllOpeartion();
    }
}
