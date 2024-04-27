package com.example.calculator.Databases.Entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "operation")
public class Operation_en {
    @PrimaryKey(autoGenerate = true)
    private int id ;
    private String result ;
    private String operation ;

    public Operation_en(String result, String operation) {
        this.result = result;
        this.operation = operation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
