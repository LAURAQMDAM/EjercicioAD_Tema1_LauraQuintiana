package lqm.di;

import jdk.swing.interop.SwingInterOpUtils;
import lqm.di.model.AccidentesLeganes;
import lqm.di.util.ListarCSV;

import javax.xml.transform.sax.SAXSource;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;
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
        accidentsPositivoDrogas();
        numAccidentesPositivoAlcoholoDrogas();
        numAccidentesPositivoAlcoholyDrogas();
        accidentesConBus();
        numAccidentesDeHombres();
        numAccidentesDeMujeres();
        numAccidentesConFallecidos();
        accidenttesNocturnos();
        accidentesConCaidaConLluviaDebil();
        accidentesConMasDeUnVehiculoImplicado();

    }

    private void accidentesConMasDeUnVehiculoImplicado() {
        System.out.println("\nAccidentes que implican varios vehículos");


    }

    private void accidentesConCaidaConLluviaDebil() {
        System.out.println("\nAccidentes con caída en día con lluvia débil.");
        accidentesLega.stream().filter(a -> a.getEstadoMetereologico().equalsIgnoreCase("Lluvia débil")).forEach(System.out::println);
    }

    private void accidenttesNocturnos() {
        System.out.println("\nAccidentes que se realizan de noche: entre las 22:00 y las 08:00");
     /*   Predicate<AccidentesLeganes> masDiezNoche = a -> a.getHora() == "0:20:00";
        Predicate<AccidentesLeganes> menosOchoManiana = a -> a.getHora() == "8:00:00";

*/
       // accidentesLega.stream().filter(masDiezNoche.or(menosOchoManiana)).forEach(System.out::println);
    }

    private void numAccidentesConFallecidos() {
        System.out.println("\nNumero de accidentes donde ha fallecido una persona");
        //aunque se pide el numero de fallecidos, el codigo de lexividad es 05, y no existe ninguno, por lo que
        //intrepretamos que podria referirse a los "casos" donde pone null, que no lo han querido especificar

        System.out.println(accidentesLega.stream().filter(a -> a.getCodLexividad().equalsIgnoreCase("null")).count());
    }

    private void numAccidentesDeMujeres() {
        System.out.println("\nCuantos accidentes hay de mujeres");

        System.out.println( accidentesLega.stream().filter(a -> a.getSexo().equalsIgnoreCase("Mujer")).count());
    }

    private void numAccidentesDeHombres() {
        System.out.println("\nCuantos accidentes hay de hombres");

        System.out.println( accidentesLega.stream().filter(a -> a.getSexo().equalsIgnoreCase("Hombre")).count());
    }

    private void accidentesConBus() {
        System.out.println("\nListar todos los accidentes en los que haya intervenido un autobus");

        System.out.println(accidentesLega.stream().filter(a -> a.getTipoVehiculo().equalsIgnoreCase("Autobús")).count());

    }

    private void numAccidentesPositivoAlcoholyDrogas() {

        System.out.println("\nNúmero de accidentes con positivo en alcohol y drogas");
    }

    private void numAccidentesPositivoAlcoholoDrogas() {
        System.out.println("\nNúmero de accidentes con positivo en alcohol o drogas");

    }

    private void accidentsPositivoDrogas() {
        System.out.println("\nListar todos los accdentes con positivos en drogas");

    }

    private void todosAccidentes() {

        System.out.println("Listar todos los accidentes en Leganés");
        //Como no tiene la localidad de por si, porque son distritos de la comunidad de madrid, pongo las calles que tienen algo de leganes en su nombre

        accidentesLega.stream().filter(a -> a.getLocalizacion().toLowerCase().contains("leganes")).forEach(System.out::println);

        System.out.println("\nPrimer Accidente de la lista");
        System.out.println(accidentesLega.stream().findFirst());

    }
}
