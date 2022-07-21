package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //Student s;
    //var s: Student
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this, R.layout.activity_main)

        var student=Student("Ali", "RIT", 20)


        binding.btnSetValue.setOnClickListener(){
            //binding.tvAge.text=student.age.toString()
            student.age=25

            binding.apply {
                invalidateAll()
            }
        }

        binding.btnGetValue.setOnClickListener(){
            binding.myData=student
        }

    }
}