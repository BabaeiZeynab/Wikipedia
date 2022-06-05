package com.zeynab.foodappprojcet.room

import androidx.room.*


@Dao
interface FoodDao {

    // add new food
    // this function will get new food of Food class
    @Insert
    fun insertFood(food: Food)

    @Insert
    fun insertAllFood(data: List<Food>)

    // update food

    @Update
    fun updateFood(food: Food)

    @Delete
    fun deleteFood(food :Food)

    @Query("DELETE FROM `table-food`  ")
    fun deleteAllFood( )

    // searching in the search box
    // here we should search our search string and also we canot write the exact word so we should use %
    // in order to use % we will write '%' ||


//    @Query("SELECT * FROM `table-food` WHERE txtFoodname LIKE '%' || :searching || '%' ")
//    fun getAllFoods(searching :String)

    @Query("SELECT * FROM `table-food` WHERE txtFoodname LIKE   '%' ||  :input || '%'")
     fun searchForFood(input : String) :List<Food>


    // get all food -> in this function we will not put anything inside () we will return insted
    // room cannot use anotation like Update or Insert insted we will write query

    @Query("SELECT * FROM `table-food`")
    fun getAllFood() : List<Food>
}