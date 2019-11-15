package patterns.factory.pizza

import patterns.factory.pizza.NY.NYPizzaStore
import patterns.factory.pizza.chicago.ChicagoPizzaStore
import pizza.Medellin.MedellinPizzaStore

object PizzaTestDrive {

    @JvmStatic
    fun main(args: Array<String>) {

        val nyStore: PizzaStore = NYPizzaStore()
        val chicagoStore: PizzaStore = ChicagoPizzaStore()
        val medellinStore : PizzaStore = MedellinPizzaStore()

        var pizza = nyStore.orderPizza("cheese")
        println("Ethan ordered a " + pizza.name + "\n")

        pizza = chicagoStore.orderPizza("cheese")
        println("Joel ordered a " + pizza.name + "\n")

        pizza = nyStore.orderPizza("clam")
        println("Ethan ordered a " + pizza.name + "\n")

        pizza = chicagoStore.orderPizza("clam")
        println("Joel ordered a " + pizza.name + "\n")

        pizza = nyStore.orderPizza("pepperoni")
        println("Ethan ordered a " + pizza.name + "\n")

        pizza = chicagoStore.orderPizza("pepperoni")
        println("Joel ordered a " + pizza.name + "\n")

        pizza = nyStore.orderPizza("veggie")
        println("Ethan ordered a " + pizza.name + "\n")

        pizza = chicagoStore.orderPizza("veggie")
        println("Joel ordered a " + pizza.name + "\n")

        pizza = medellinStore.orderPizza("calentao")
        println("Manuel ordenó una " + pizza.name + "\n")

        pizza = medellinStore.orderPizza("sudao")
        println("Daniel ordenó una " + pizza.name + "\n")

        pizza = medellinStore.orderPizza("hogao")
        println("Santiago ordenó una " + pizza.name + "\n")

        pizza = medellinStore.orderPizza("morcilla")
        println("Felipe ordenó una " + pizza.name + "\n")
    }
}