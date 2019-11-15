package patterns.factory.pizza.NY

import patterns.factory.pizza.Pizza

import patterns.factory.pizza.PizzaStore


class NYPizzaStore : PizzaStore() {

    override fun createPizza(item: String?): Pizza? {
        return if (item == "cheese") {
            NYStyleCheesePizza()
        } else if (item == "veggie") {
            NYStyleVeggiePizza()
        } else if (item == "clam") {
            NYStyleClamPizza()
        } else if (item == "pepperoni") {
            NYStylePepperoniPizza()
        } else null
    }

}