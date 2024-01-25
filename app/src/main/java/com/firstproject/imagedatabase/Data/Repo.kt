package com.firstproject.imagedatabase.Data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.firstproject.imagedatabase.Constants.Constant
import com.firstproject.imagedatabase.Models.ModelTask
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore

class Repo {

    private var db=Firebase.firestore
    private var constant=Constant()

   private var TaskCollection=db.collection(constant.TASK_COLLECTION)


 fun addTask(modelTask: ModelTask):LiveData<Boolean>
    {

        var result=MutableLiveData<Boolean>()
        TaskCollection.add(modelTask).addOnCompleteListener {
            result.value=true
        }

            .addOnFailureListener {
                result.value=false
            }

        return  result
    }
}