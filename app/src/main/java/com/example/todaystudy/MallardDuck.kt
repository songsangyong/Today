package com.example.todaystudy

class MallardDuck : Duck() {
    init {
        mQuackBehavior = Quack()
        mFlyBehavior = FlyWithWings()
    }

    override fun display() {
        println("저는 물오리입니다.")
    }
}