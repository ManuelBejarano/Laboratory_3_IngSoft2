package pizza.Medellin

import patterns.factory.pizza.Pizza

class PaisaStyleHogaoPizza : Pizza() {

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
        dough = "Masa de corteza delgada"
        sauce = "Salsa de tomate con cebolla y oregano"
        toppings.add("Tomate en trozoz")
        toppings.add("Cubitos de cebolla")
        toppings.add("Trozos de patacón")
    }


}