package patterns.factory.pizza

import java.util.*

abstract class Pizza {

    var name: String? = null
    var dough: String? = null
    var sauce: String? = null
    var toppings = ArrayList<String>()

    open fun prepare() {

        println("Prepare $name")
        println("Tossing dough...")
        println("Adding sauce...")
        println("Adding toppings: ")

        for (topping in toppings) {
            println("   $topping")
        }

    }

    open fun bake() {
        println("Bake for 25 minutes at 350")
    }

    open fun cut() {
        println("Cut the pizza into diagonal slices")
    }

    open fun box() {
        println("Place pizza in official PizzaStore box")
    }

    override fun toString(): String {

        val display = StringBuffer()

        display.append("---- $name ----\n")
        display.append(dough + "\n")
        display.append(sauce + "\n")

        for (topping in toppings) {
            display.append(topping + "\n")
        }

        return display.toString()
    }
}
