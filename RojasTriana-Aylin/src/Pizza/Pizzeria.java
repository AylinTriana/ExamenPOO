package Pizza;

public abstract class Pizzeria {
    private String nombre;
    private String descripcion;

    public Pizzeria(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Double calcularPrecio(){
        return null;
    }


}
