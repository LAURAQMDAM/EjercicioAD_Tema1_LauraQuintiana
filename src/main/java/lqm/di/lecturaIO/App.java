package lqm.di.lecturaIO;
//Realizaremos el primer ejercicio de Acesso a datos, con datos reales de un dia en concreto de accidentes
//Debemos empezar procesando un csv

import lqm.di.ConsultasAccidentes;
import lqm.di.model.AccidentesLeganes;
import lqm.di.service.ServicioAccidentes;

import java.util.List;

public class App {

    public static void main(String[] args) {

        ServicioAccidentes service = new ServicioAccidentes();

        List<AccidentesLeganes> accidentes = service.lecturaAccidentes("data/accidentesmadrid.csv");

        ConsultasAccidentes consultasAccidentes = new ConsultasAccidentes();
/*        System.out.println("LISTAMOS TODOS LOS ACCIDENTES");

        System.out.println(accidentes.toString());*/




        int numero = 6;
        String ejemploMario = (numero==6) ? "hola" : "adios";

        System.out.println(ejemploMario);
    }
}
