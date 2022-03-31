package lqm.di;

import lqm.di.model.AccidentesLeganes;
import lqm.di.util.ListarCSV;

import java.util.List;
import java.util.stream.Stream;

public class ConsultasAccidentes {

    List<AccidentesLeganes> accidentesLega;

    public ConsultasAccidentes(){
        //cargo la lista de accidentes
        try{
            System.out.println("hola");
         accidentesLega = ListarCSV.getAccidentes();
            procesarStreams();
        }catch (Exception e){
            System.err.println("Eror al leer el fichero de accidenters: " + e.getMessage());
        }
    }
    private void procesarStreams(){
        
        todosAccidentes();
    }

    private void todosAccidentes() {

        System.out.println("LISTAMOS TODOS LOS ACCIDENTES");
        Stream<AccidentesLeganes> acci= accidentesLega.stream(); //flujo de elementos AccidentesLega
        acci.forEach(System.out::println);

        System.out.println(accidentesLega.stream().findFirst());
        accidentesLega.stream().limit(5).filter(a -> a.getDistrito()=="Leganes").forEach(System.out::println);
        System.out.println("");
    }
}
