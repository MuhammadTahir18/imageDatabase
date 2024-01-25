package com.firstproject.imagedatabase.Data

import com.firstproject.imagedatabase.Models.ModelTask

class SharedPrefManager {
var list=List<ModelTask>()

    private fun putTaskList() {

    }

 fun getTaskList() :List<ModelTask{

        return list
    }
}