package com.firstproject.imagedatabase.Ui

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.recyclerview.widget.LinearLayoutManager
import com.firstproject.imagedatabase.Adapter.AdapterTask
import com.firstproject.imagedatabase.Constants.Constant
import com.firstproject.imagedatabase.Models.ModelTask
import com.firstproject.imagedatabase.R
import com.firstproject.imagedatabase.ViewModels.TaskViewModel
import com.firstproject.imagedatabase.databinding.ActivityMainBinding
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private  var taskViewModel=TaskViewModel by viewModels

    private var constants=Constant()

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        var usertasklist=taskViewModel.getTaskList("hksgdskhdgwkdhg")
        binding.rv.layouManager=LinearLayoutManager(this@MainActivity)
        binding.rv.adapter=AdapterTask(this@MainActivity,usertasklist)



        binding.upload.setOnClickListener()
        {

            taskViewModel.addTask(ModelTask("title","skhsgskahdsak"))observe
                    (

                            this@MainActivity
                            )
            {task->

                if(task)
                {
                    Toast.makeText(this@MainActivity, constants.TASK_CREATED_SUCCESSFULY, Toast.LENGTH_SHORT).show()
                }

                else
                {
                    Toast.makeText(this@MainActivity, constants.SOME_THING_WENT_WRONG, Toast.LENGTH_SHORT).show()

                }


            }

        }



    }

}