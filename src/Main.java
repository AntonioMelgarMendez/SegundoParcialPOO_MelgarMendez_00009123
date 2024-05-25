import FactoryDepartamentos.AbstractFactory;
import FactoryDepartamentos.ConcreteFactoryDepartamentoPrincipal;
import FactoryDepartamentos.ConcreteFactoryDepartamentoSecundario;
import FactoryDepartamentos.Empleado;
import FactoryEmpleados.AbstractFactoryEmpleados;
import FactoryEmpleados.ConcreteFactoryEmpleadosCEO;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AbstractFactory fabricaDepartamentoPrincipal = new ConcreteFactoryDepartamentoPrincipal();
        AbstractFactory fabricaDepartamentoSecundario = new ConcreteFactoryDepartamentoSecundario();
        AbstractFactoryEmpleados fabricaEmpleado = new ConcreteFactoryEmpleadosCEO();
        AbstractFactoryEmpleados factoryEmpleadosCEO = new ConcreteFactoryEmpleadosCEO();
        ArrayList<Empleado> empleados = new ArrayList<>();
        factoryEmpleadosCEO.createEmpleado("Juan");
        fabricaEmpleado.createEmpleado("Carlos");
        fabricaEmpleado.createEmpleado("Pedro");
   

        fabricaDepartamentoPrincipal.createDepartamento("Ceo","Auxilio",);
    }
}