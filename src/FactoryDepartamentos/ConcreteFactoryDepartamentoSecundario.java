package FactoryDepartamentos;

import java.util.ArrayList;

public class ConcreteFactoryDepartamentoSecundario extends AbstractFactory {



    @Override
    public void createDepartamento(String jefe, String NombreDepartamento, ArrayList<Empleado> empleados) {

        this.NombreDepartamento= NombreDepartamento;
        this.jefe = jefe;
this.empleados= empleados;

    }
}
