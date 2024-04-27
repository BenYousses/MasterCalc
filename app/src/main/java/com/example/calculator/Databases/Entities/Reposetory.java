package com.example.calculator.Databases.Entities;

import android.app.Application;

import androidx.lifecycle.LiveData;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RoomDatabase;

import com.example.calculator.Databases.Entities.OperationDao.OperationDao;

import java.util.List;

public class Reposetory {
    OperationDao operationDao ;

    public Reposetory(Application application) {
        Roomdatas db = Roomdatas.getDatabase(application);
        operationDao = db.operationDao();
    }

    void InsertOperation (Operation_en nwOperation){
        Roomdatas.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                operationDao.InsertOperation(nwOperation);
            }
        });
    }
    LiveData<List<Operation_en>> getAllOperation (){
        return operationDao.getAllOperation();
    }

    void deleteAllOpeartion() {
        Roomdatas.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                operationDao.deleteAllOpeartion();
            }
        });

    }}
