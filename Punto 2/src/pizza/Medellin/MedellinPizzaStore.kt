package pizza.Medellin

import patterns.factory.pizza.Pizza
import patterns.factory.pizza.PizzaStore

class MedellinPizzaStore : PizzaStore()  {

    override fun createPizza(item: String?): Pizza? {
        return if (item == "calentao") {
            PaisaStyleCalentaoPizza()
        } else if (item == "sudao") {
            PaisaStyleSudaoPizza()
        } else if (item == "hogao") {
            PaisaStyleHogaoPizza()
        } else if (item == "morcilla") {
            PaisaStyleMorcillaiPizza()
        } else null
    }

}