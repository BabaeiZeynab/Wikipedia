package com.zeynab.foodappprojcet.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


// this part is createing database

@Database(entities = [Food::class], exportSchema = false, version = 1)
abstract class MyDataBase : RoomDatabase() {

    /// create object  foodDa here

    abstract val foodDao: FoodDao




    /// here we only craeet one instance of database when each time database is called only one time it will craeet my database
    companion object {

        val dataBase: MyDataBase? = null

        fun getDataBase(context: Context): MyDataBase {

            var instance = dataBase

            if (instance == null) {

                instance = Room.databaseBuilder(
                    context.applicationContext,
                    MyDataBase::class.java,
                    "database.db"
                ).allowMainThreadQueries()
                    .build()
            }

            return instance
        }


    }


}