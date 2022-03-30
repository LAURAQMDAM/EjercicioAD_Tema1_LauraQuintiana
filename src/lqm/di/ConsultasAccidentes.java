package lqm.di;

import utils.ListarCSV;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ConsultasAccidentes {

    List<AccidentesLeganes> accidentesLega = new ArrayList<>();



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

        System.out.println(accidentesLega.stream().findFirst());
        //accidentesLega.stream().limit(5).filter(a -> a.getDistrito()=="Leganes").forEach(System.out::println);
        System.out.println("");
    }
}
