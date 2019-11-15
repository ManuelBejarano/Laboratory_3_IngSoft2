package patterns.factory.pizza.chicago

import patterns.factory.pizza.Pizza

class ChicagoStyleVeggiePizza : Pizza() {

    override fun cut() {
        println("Cutting the pizza into square slices")
    }

    init {
        name = "Chicago Deep Dish Veggie Pizza"
        dough = "Extra Thick Crust Dough"
        sauce = "Plum Tomato Sauce"
        toppings.add("Shredded Mozzarella Cheese")
        toppings.add("Black Olives")
        toppings.add("Spinach")
        toppings.add("Eggplant")
    }
}