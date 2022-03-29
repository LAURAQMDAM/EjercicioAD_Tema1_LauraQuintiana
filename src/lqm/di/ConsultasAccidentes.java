package lqm.di;

import utils.ListarCSV;

import java.util.List;
import java.util.stream.Stream;

public class ConsultasAccidentes {
    List<AccidentesLeganes> accidentesLega;

    public ConsultasAccidentes(){
        try{
            ListarCSV.getAccidentes();
            procesarStreams();
        }catch (Exception e){
            System.err.println("Error al leer el fichero de accidentes: " + e.getMessage());
        }
    }private void procesarStreams(){
        
        todosAccidentes();
    }

    private void todosAccidentes() {

        System.out.println("LISTAMOS TODOS LOS ACCIDENTES");

        Stream<AccidentesLeganes> acci= accidentesLega.stream();
        acci.forEach(accidentesLega -> System.out.println(accidentesLega));
        System.out.println("");
    }
}
