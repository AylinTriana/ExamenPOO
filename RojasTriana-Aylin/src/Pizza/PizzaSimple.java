package Pizza;

public class PizzaSimple extends Pizzeria{

    private Double precioBase;
    private Boolean esEspecial;

    public PizzaSimple(String nombre, String descripcion, Double precioBase, Boolean esEspecial) {
        super(nombre, descripcion);
        this.precioBase = precioBase;
        this.esEspecial = esEspecial;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public Boolean getEsEspecial() {
        return esEspecial;
    }

    @Override
    public Double calcularPrecio() {
        if (esEspecial) {
            return precioBase * 1.7;
        } else {
            return precioBase;
        }
    }
}
