package com.example.ebac

fun main() {
    var car = Car()
    println(car.accelerate(100))
    car.print()
    car.decelerate(50)
    car.print()
    car.getvelocity()
}

class Car {
    var velocity: Int
    var acceleration: Int
    var model: String

    init {
        velocity = 0
        acceleration = 10
        model = ""
    }

    fun accelerate(accelerationCar: Int): Int {
        acceleration = accelerationCar
        velocity += acceleration
        return velocity
    }

    fun decelerate(decelerationCar: Int) {
        val newVelocity = velocity - decelerationCar
        velocity = if (newVelocity >= 0) newVelocity else 0
    }

    fun getvelocity() {
         println("A veolocidade atual é ${this.velocity}")
    }

    fun print() {
        println(
            "Aceleração: $acceleration \n Velocidade: $velocity"
        )
    }
}

