package com.example.fragment_practice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.btnFragment1
import kotlinx.android.synthetic.main.activity_main.btnFragment2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstFragment=FirstFragment()
        val secondFragment= SecondFragment()

        //변환을 위해 change,supporFragmentManger써서 다룰거임,fragment transaction을
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, firstFragment)
            commit()//이걸로 담게 해줌
            //id제공해서 replace하게
        }
        btnFragment1.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, firstFragment)
                commit()//이걸로 담게 해줌
                //id제공해서 replace하게
            }
        }
        btnFragment2.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, secondFragment)
                commit()//이걸로 담게 해줌
                //id제공해서 replace하게
            }
        }
    //시작시 fragment!
    }
}