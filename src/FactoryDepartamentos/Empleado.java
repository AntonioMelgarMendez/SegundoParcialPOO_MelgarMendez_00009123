package FactoryDepartamentos;

public class Empleado {
    private String Nombre;
    public Empleado(String nombre) {
        Nombre = nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

}
