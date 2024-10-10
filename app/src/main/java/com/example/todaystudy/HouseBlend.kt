package com.example.todaystudy

class HouseBlend : Beverage() {
    init {
        description = "하우스 블렌디드"
    }

    override fun cost(): Double {
        return 1.0
    }
}
