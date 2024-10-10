package com.example.todaystudy


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.todaystudy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mallard = MallardDuck()
        mallard.performQuack()
        mallard.performFly()

        val model = ModelDuck()
        model.performFly()
        model.setFlyBehavior(FlyRocketPowered())
        model.performFly()
    }
}