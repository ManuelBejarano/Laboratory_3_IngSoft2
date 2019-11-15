package patterns.factory.pizza.chicago

import patterns.factory.pizza.Pizza

class ChicagoStyleClamPizza : Pizza() {

    override fun cut() {
        println("Cutting the pizza into square slices")
    }

    init {
        name = "Chicago Style Clam Pizza"
        dough = "Extra Thick Crust Dough"
        sauce = "Plum Tomato Sauce"
        toppings.add("Shredded Mozzarella Cheese")
        toppings.add("Frozen Clams from Chesapeake Bay")
    }
}