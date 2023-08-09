package com.example.recycler_view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerview: RecyclerView
    private lateinit var newArrayList: ArrayList<News>
    lateinit var imageId:Array<Int>
    lateinit var heading:Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageId= arrayOf(
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h,
            R.drawable.i,
            R.drawable.j,
        )

        heading= arrayOf(
            "gskndglsgnk",
            "sdnkklsngkl",
            "ewrqweredgasg",
            "gskndglsgnk",
            "sdnkklsngkl",
            "ewrqweredgasg",
            "gskndglsgnk",
            "sdnkklsngkl",
            "ewrqweredgasg",
            "ewfsfassfsaafs"
            )
        newRecyclerview=findViewById(R.id.recyclerView)
        newRecyclerview.layoutManager=LinearLayoutManager(this)
        newRecyclerview.setHasFixedSize(true)
        newArrayList= arrayListOf<News>()
        getUserdata()
    }

    private fun getUserdata() {
        for(i in imageId.indices){
            val news=News(imageId[i],heading[i])
            newArrayList.add(news)

        }
        newRecyclerview.adapter=MyAdapter(newArrayList)
    }
}