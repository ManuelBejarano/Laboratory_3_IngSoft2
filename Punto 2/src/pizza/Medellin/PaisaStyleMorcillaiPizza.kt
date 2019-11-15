package pizza.Medellin

import patterns.factory.pizza.Pizza

class PaisaStyleMorcillaiPizza : Pizza() {

    override fun bake() {
        println("Horneando por 25 minutos a 350")
    }

    override fun cut() {
        println("Cortando la pizza en rebanadas triangulares")
    }

    override fun box() {
        println("Colocando la pizza en la caja oficial de la tienda")
    }

    init {
        name = "Pizza de Calentao estilo paisa"
        dough = "Masa de corteza extra gruesa"
        sauce = "Sin salsa"
        toppings.add("Trozos de morcilla")
        toppings.add("Trozos de chunculla")
        toppings.add("Carne en trozoz")
        toppings.add("Cubitos de papa")
        toppings.add("Arepa en trozoz")
    }

}