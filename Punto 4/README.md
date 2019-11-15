# Laboratory_3_IngSoft2
Desarrollo del laboratorio #3 del curso ingeniería de software 2 - Universidad Nacional de colombia

## Punto 4

### Spaghetti Code

El ejemplo de este antipattern es un juego de triqui entre el jugador y la máquina. En la clase Triquie es donde está la lógica del juego, que utiliza muchos condicionales y ciclos anidados para marcar y verificar las casillas del tablero y parar el juego cuando haya un ganador o en caso de empate.

### The Blob

El ejemplo utilizado en este antipattern es una calculadora de areas y perimetros. El ejemplo se divide en tres paquetes, en el paquete business se encuentra la clase ShapeCalculatorTest que tiene todas las funciones que hacen funcionar la calculadora. Las clases del paquete data son los modelos de todas las formas para las que la calculadora funciona. Y en el paquete UI está la interacción con el usuario por medio de la consola.

La calculadora es un ejemplo del antipattern Blob porque toda la funcinalidad se encuentra en una sola clase (ShapeCalculatorTest) y las demás clases solo contienen datos, getters y setters.
