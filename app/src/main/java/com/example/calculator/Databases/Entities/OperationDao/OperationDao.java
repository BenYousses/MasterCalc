package com.example.calculator.Databases.Entities.OperationDao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.calculator.Databases.Entities.Operation_en;

import java.util.List;

@Dao
public interface OperationDao {
    @Insert
     void InsertOperation (Operation_en nwOperation);
    @Query("Select *  from operation")
    LiveData<List<Operation_en>> getAllOperation ();
    @Query("Delete from operation")
    void deleteAllOpeartion();
}
