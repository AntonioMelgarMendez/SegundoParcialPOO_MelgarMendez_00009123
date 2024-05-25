package FactoryDepartamentos;

import java.util.ArrayList;

public  abstract class AbstractFactory {
     public String jefe;
    public String NombreDepartamento;
    public ArrayList<Empleado> empleados;

     public abstract void createDepartamento(String jefe, String NombreDepartamento, ArrayList<Empleado> empleados);

 }
