package pizza.Medellin

import patterns.factory.pizza.Pizza

class PaisaStyleCalentaoPizza : Pizza() {

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
        sauce = "Salsa de tomate"
        toppings.add("Arroz con frijoles")
        toppings.add("Cubitos de platano maduro")
        toppings.add("Chorizo")
    }

}