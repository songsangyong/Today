package com.example.todaystudy

class ModelDuck : Duck() {
    init {
        mFlyBehavior = FlyNoWay()
        mQuackBehavior = Quack()
    }

    override fun display() {
        println("저는 모형 오리입니다.")
    }
}