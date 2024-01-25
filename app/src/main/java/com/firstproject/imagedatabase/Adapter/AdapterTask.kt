package com.firstproject.imagedatabase.Adapter


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.firstproject.imagedatabase.Models.ModelTask
import com.firstproject.imagedatabase.R

class AdapterTask(private val context: Context, private val list: List<ModelTask>) :
    RecyclerView.Adapter<AdapterTask.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout., parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val name: TextView = itemView.findViewById(R.id.name)

        fun bind(user: ModelUser) {
            name.text = user.name // Assuming there is a method to get the name from ModelUser
        }
    }
}


