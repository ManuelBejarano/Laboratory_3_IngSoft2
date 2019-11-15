package patterns.factory.pizza.chicago

import patterns.factory.pizza.Pizza

class ChicagoStyleCheesePizza : Pizza() {

    override fun cut() {
        println("Cutting the pizza into square slices")
    }

    init {
        name = "Chicago Style Deep Dish Cheese Pizza"
        dough = "Extra Thick Crust Dough"
        sauce = "Plum Tomato Sauce"
        toppings.add("Shredded Mozzarella Cheese")
    }
}