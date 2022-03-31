package lqm.di;
//Realizaremos el primer ejercicio de Acesso a datos, con datos reales de un dia en concreto de accidentes
//Debemos empezar procesando un csv

import lqm.di.model.AccidentesLeganes;
import service.ServicioAccidentes;

import java.util.List;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {

        ServicioAccidentes service = new ServicioAccidentes();

        List<AccidentesLeganes> accidentes = service.lecturaAccidentes("data/accidentesmadrid.csv");

        System.out.println("LISTAMOS TODOS LOS ACCIDENTES");

        System.out.println(accidentes.toString());
    }
}
