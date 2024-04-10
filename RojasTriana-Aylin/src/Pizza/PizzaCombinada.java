package Pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaCombinada extends Pizzeria {
    private List<Pizzeria> pizzas;

    public PizzaCombinada(String nombre, String descripcion) {
        super(nombre, descripcion);
        pizzas = new ArrayList<>();
    }

    public void agregarPizza(Pizzeria pz) {
        pizzas.add(pz);
    }

    @Override
    public Double calcularPrecio() {
        Double precioTotal = 0.0;
        for (Pizzeria pizzeria : pizzas) {
            if (pizzeria.calcularPrecio() > precioTotal) {
                precioTotal += pizzeria.calcularPrecio();
            }
        }
        return precioTotal;
    }

}
