package patterns.factory.pizza.NY

import patterns.factory.pizza.Pizza

class NYStyleCheesePizza : Pizza() {

    init {
        name = "NY Style Sauce and Cheese Pizza"
        dough = "Thin Crust Dough"
        sauce = "Marinara Sauce"
        toppings.add("Grated Reggiano Cheese")
    }

}