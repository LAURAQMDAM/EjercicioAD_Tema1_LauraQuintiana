package lqm.di.util;

import lqm.di.model.AccidentesLeganes;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ListarCSV {
    public static List<AccidentesLeganes> getAccidentes() throws IOException {
        // Cargamos el archivo ubicado en la carpeta data
        String DATA_FILE = "accidentesmadrid.csv";
        String WORKING_DIRECTORY = System.getProperty("user.dir");
        Path path = Paths.get(WORKING_DIRECTORY + File.separator + "data" + File.separator + DATA_FILE);
        final List<String> lines = Files.readAllLines(Paths.get("data/accidentesmadrid.csv"), StandardCharsets.UTF_8);
        List<AccidentesLeganes> accidentes = new ArrayList<>();
        for (int i = 1; i < lines.size(); i++) {
            StringTokenizer tokenizer = new StringTokenizer(lines.get(i), ";");
            AccidentesLeganes accidente = new AccidentesLeganes();
            accidente.setNumExpediente(tokenizer.nextToken());
            accidente.setFecha(tokenizer.nextToken());
            accidente.setHora(tokenizer.nextToken());
            accidente.setLocalizacion(tokenizer.nextToken());
            accidente.setNumero(tokenizer.nextToken());
            accidente.setCodDistrito(tokenizer.nextToken());
            accidente.setDistrito(tokenizer.nextToken());
            accidente.setTipoAccidente(tokenizer.nextToken());
            accidente.setEstadoMetereologico(tokenizer.nextToken());
            accidente.setTipoVehiculo(tokenizer.nextToken());
            accidente.setTipoPersona(tokenizer.nextToken());
            accidente.setRangoEdad(tokenizer.nextToken());
            accidente.setSexo(tokenizer.nextToken());
            accidente.setRangoEdad(tokenizer.nextToken());
            accidente.setCodLexividad(tokenizer.nextToken());
            accidente.setLexividad(tokenizer.nextToken());
            accidente.setCoordenadaX(tokenizer.nextToken());
       //     accidente.setCoordenadaY(tokenizer.nextToken());
           // accidente.setCoordenadaY(tokenizer.nextToken().replace(",","."));
         //   accidente.setPositivaAlcohol( tokenizer.nextToken());
          //  accidente.setPositivaAlcohol(String.valueOf(tokenizer.nextToken().equals("N") ? false : true));
          //  accidente.setPositivaDrogas(String.valueOf(tokenizer.nextToken().equals("Y") ? true : false));
         //accidente.setPositivaAlcohol(tokenizer.nextToken());
         //accidente.setPositivaDrogas(tokenizer.nextToken());

            accidentes.add(accidente);
        }

        return accidentes;
    }
}