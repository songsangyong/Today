package com.example.todaystudy

abstract class Duck {
    protected lateinit var mFlyBehavior: FlyBehavior
    protected lateinit var mQuackBehavior: QuackBehavior
    abstract fun display()

    fun performQuack() {
        mQuackBehavior.quack()
    }

    fun performFly() {
        mFlyBehavior.fly()
    }

    fun setFlyBehavior(fb: FlyBehavior) {
        mFlyBehavior = fb
    }

    fun setQuackBehavior(qb: QuackBehavior) {
        mQuackBehavior = qb
    }

    fun swim() {
        println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠")
    }
}