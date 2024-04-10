package Pizza;

public class Main {
    public static void main(String[] args) {

        Pizzeria pizzaMuzzarella = new PizzaSimple("Muzzarella", "Pizza De Muzzarella", 700.0, false);
        Pizzeria pizzaMargarita = new PizzaSimple("Margarita", "Pizza De Margarita", 850.0, true);
        Pizzeria pizzaAnana = new PizzaSimple("Ananá", "Pizza De Ananá", 950.0, false);

        PizzaCombinada pizzaCombinadaLoca = new PizzaCombinada("pizza Combinada Loca", "Pizza Mitad Margarita y Mitad Ananá");
        pizzaCombinadaLoca.agregarPizza(pizzaMargarita);
        pizzaCombinadaLoca.agregarPizza(pizzaAnana);

        System.out.println("Lista de pizzas: ");
        System.out.println(pizzaMuzzarella.getNombre() + ": $" + pizzaMuzzarella.calcularPrecio());
        System.out.println(pizzaMargarita.getNombre() + ": $" + pizzaMargarita.calcularPrecio());
        System.out.println(pizzaAnana.getNombre() + ": $" + pizzaAnana.calcularPrecio());
        System.out.println("Pizza combinada Loca: $" + pizzaCombinadaLoca.calcularPrecio());

    }
}
