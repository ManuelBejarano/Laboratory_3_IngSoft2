package patterns.factory.pizza.chicago

import patterns.factory.pizza.Pizza
import patterns.factory.pizza.PizzaStore

class ChicagoPizzaStore : PizzaStore() {

    override fun createPizza(item: String?): Pizza? {
        return if (item == "cheese") {
            ChicagoStyleCheesePizza()
        } else if (item == "veggie") {
            ChicagoStyleVeggiePizza()
        } else if (item == "clam") {
            ChicagoStyleClamPizza()
        } else if (item == "pepperoni") {
            ChicagoStylePepperoniPizza()
        } else null
    }
}