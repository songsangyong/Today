package com.example.todaystudy

class Mocha internal constructor(var beverage: Beverage) : CondimentDecorator() {
    override fun getDescription1(): String? {
        return beverage.description + ", 모카"
    }

    override fun cost(): Double {
        return 1.0 + beverage.cost()
    }
}
