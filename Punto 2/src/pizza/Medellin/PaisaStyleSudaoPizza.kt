package pizza.Medellin

import patterns.factory.pizza.Pizza

class PaisaStyleSudaoPizza : Pizza() {

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
        name = "Pizza de Sudao estilo paisa"
        dough = "Masa de corteza delgada"
        sauce = "Salsa de tomate"
        toppings.add("Carne sudada desmechada")
        toppings.add("Cubitos de papa")
        toppings.add("Cubitos de yuca")
    }

}