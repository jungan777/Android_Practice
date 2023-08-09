package com.example.recycler_view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(private val newList:ArrayList<News>):RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return newList.size
            //how many items in the recyclerView
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem=newList[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.tvHeading.text=currentItem.heading
    }

    class MyViewHolder(itemVIew: View):RecyclerView.ViewHolder(itemVIew){
        val titleImage:ShapeableImageView=itemVIew.findViewById(R.id.title_image)
        val tvHeading:TextView=itemView.findViewById(R.id.tvHeading)

    }
}