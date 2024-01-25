package com.firstproject.imagedatabase.Models

import android.os.health.TimerStat
import com.google.firebase.Timestamp

class ModelTask(

    var title:String="",
    var userId:String="",
    var createdAt:Timestamp=Timestamp.now(),

) {
}