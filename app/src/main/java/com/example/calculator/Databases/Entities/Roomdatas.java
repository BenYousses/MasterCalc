package com.example.calculator.Databases.Entities;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.calculator.Databases.Entities.OperationDao.OperationDao;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
@Database(entities = Operation_en.class ,  version =  1 , exportSchema = false)
public abstract class Roomdatas extends RoomDatabase {




        public abstract OperationDao operationDao();

        private static volatile Roomdatas INSTANCE;
        private static final int NUMBER_OF_THREADS = 4;
        public static final ExecutorService databaseWriteExecutor =
                Executors.newFixedThreadPool(NUMBER_OF_THREADS);



        public  static Roomdatas getDatabase(final Context context) {
            if (INSTANCE == null) {
                synchronized (Roomdatas.class) {
                    if (INSTANCE == null) {
                        INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                                        Roomdatas.class, "Roomdatas")

                                .build();
                    }
                }
            }
            return INSTANCE;
        }

}
