package com.firstproject.imagedatabase.ViewModels

import androidx.lifecycle.LiveData
import com.firstproject.imagedatabase.Constants.Constant
import com.firstproject.imagedatabase.Data.Repo
import com.firstproject.imagedatabase.Data.SharedPrefManager
import com.firstproject.imagedatabase.Models.ModelTask

class TaskViewModel {
private var constants=Constant()
private var repo=Repo()
    private var sharedprefmanager=SharedPrefManager()
  fun getTaskList(docId:String):List<ModelTask>
    {


        return sharedprefmanager.getTaskList().filter { it.userId==docId }
    }





    fun addtask(modelTask: ModelTask):LiveData<Boolean>
    {
        return repo.addTask(modelTask)
    }
}